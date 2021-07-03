package com.pagecategories;

import com.pagecategories.Site.Site;
import com.pagecategories.Site.SiteKlazify;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;


@Service
public class SitesService {
    private final SitesRepository sitesRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(SitesService.class);
    private KlazifyApiService klazifyApiService;
    @Autowired
    public SitesService(SitesRepository sitesRepository, KlazifyApiService klazifyApiService) {
        this.sitesRepository = sitesRepository;
        this.klazifyApiService=klazifyApiService;
    }

    public static String getDomainName(String url) throws URISyntaxException {
            URI uri = new URI(url);
            String domain = uri.getHost();
            return "https://"+domain+"/";
    }
    public boolean checkIfAlreadyInDB(String pageUrl) {
        try {
          String properDomainName=getDomainName(pageUrl);
        if (sitesRepository.existsByDomainUrl(properDomainName)){
            return true;
        }

        }catch (URISyntaxException uriSyntaxException)
        {
            LOGGER.error("Wrong syntax");
        }

        return false;
    }


    public void createSiteEntry(SiteKlazify siteKlazify) {
        String domainUrl=siteKlazify.getDomainKlazify().getDomainUrl();
        String githubUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getGithubUrl();
        boolean success=siteKlazify.getSuccess();
        String facebookUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getFacebookUrl();
        String twitterUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getTwitterUrl();
        String linkedinUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getLinkedinUrl();
        String mediumUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getMedium_Url();
        String instagramUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getInstagramUrl();
        String youtubeUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getYoutubeUrl();
        String pinterestUrl=siteKlazify.getDomainKlazify().getSocialMediaKlazify().getPinterestUrl();
        Double confidence=siteKlazify.getDomainKlazify().getCategories().get(0).getConfidence();
        String name=siteKlazify.getDomainKlazify().getCategories().get(0).getName();
        String logoUrl=siteKlazify.getDomainKlazify().getLogoUrl();
        Site site=new Site(domainUrl,githubUrl,success,facebookUrl,twitterUrl,instagramUrl,youtubeUrl,mediumUrl,pinterestUrl,linkedinUrl,confidence,name,logoUrl);
        sitesRepository.save(site);
    }

    public Page<Site> getAllSites(Pageable pageable) {
        return sitesRepository.findAll(pageable);
    }

    public void deleteById(Long id) {
        try {
            sitesRepository.deleteById(id);
        } catch (EntityNotFoundException entityNotFoundException) {
            LOGGER.error("This id doesn't exist");
            throw entityNotFoundException;
        }
    }

    public String patchSiteEntry(Long id, String pageUrl) {
        try {
            Site site = sitesRepository.getById(id);
            site.setDomainUrl(pageUrl);
            sitesRepository.save(site);
            return "Entry in Database was sucessfully patched";
        } catch (EntityNotFoundException entityNotFoundException) {
            LOGGER.error("This id doesn't exist");
            throw entityNotFoundException;
        }
    }

    public String getSiteCategory(Long id) {
        try {
            Site site = sitesRepository.getById(id);
            String name = site.getName();
            String domainUrl = site.getDomainUrl();
            return domainUrl + " " + name;
        } catch (EntityNotFoundException entityNotFoundException) {
            LOGGER.error("This id doesn't exist");
            throw entityNotFoundException;
        }

    }

    public SiteKlazify getSiteKLazify(String pageUrl) {
        if(!checkIfAlreadyInDB(pageUrl)){
            SiteKlazify siteKlazify=klazifyApiService.getSiteKLazifyCategories(pageUrl);
            createSiteEntry(siteKlazify);
            return siteKlazify;
        }
        throw new IllegalStateException("Site already exists");
    }
}
