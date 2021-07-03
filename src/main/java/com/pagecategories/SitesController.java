package com.pagecategories;

import com.pagecategories.Site.Site;
import com.pagecategories.Site.SiteKlazify;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SitesController {



    private final SitesService sitesService;

    @Autowired
    public SitesController(SitesService sitesService) {
        this.sitesService = sitesService;
    }
    //TODO przerzucic logike komunikacji z api do innej metody serwisowej
    @GetMapping("/post")
    public SiteKlazify postSite(@RequestParam("pageUrl") String pageUrl){
        return sitesService.getSiteKLazify(pageUrl);
    }
    @GetMapping("/getsites")
    public Page<Site> getAllSites(@PageableDefault(page=0,size=20,sort = {"id"},direction = Sort.Direction.DESC)
                                  @NotNull final Pageable pageable){
        return sitesService.getAllSites(pageable);
    }
    @GetMapping("/patch/{id}")
    public ResponseEntity<String> patchSiteEntry(@PathVariable("id") Long id,@RequestParam("pageUrl") String pageUrl){
        return new ResponseEntity<>(sitesService.patchSiteEntry(id,pageUrl),HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public String getSiteCategory(@PathVariable("id") Long id){
        return sitesService.getSiteCategory(id);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<Long> deleteSiteById(@PathVariable("id") Long id) {
        sitesService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }




}
