package com.pagecategories.Site;

import javax.persistence.*;

@Entity
@Table(name = "PagesCategory")
public class Site {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean success;
    private String domainUrl;
    private String githubUrl;
    private String facebookUrl;
    private String twitterUrl;
    private String instagramUrl;
    private String youtubeUrl;
    private String medium_Url;
    private String pinterestUrl;
    private String linkedinUrl;
    private String logoUrl;
    private Double confidence;
    private String name;
    public Site(String domainUrl,String githubUrl,boolean success,String facebookUrl,String twitterUrl,String instagramUrl,String youtubeUrl,String medium_Url,String pinterestUrl,
                String linkedinUrl,Double confidence,String name,String logoUrl) {
        this.domainUrl=domainUrl;
        this.githubUrl=githubUrl;
        this.success=success;
        this.facebookUrl=facebookUrl;
        this.twitterUrl=twitterUrl;
        this.instagramUrl=instagramUrl;
        this.youtubeUrl=youtubeUrl;
        this.medium_Url=medium_Url;
        this.pinterestUrl=pinterestUrl;
        this.linkedinUrl=linkedinUrl;
        this.confidence=confidence;
        this.name=name;
        this.logoUrl=logoUrl;
    }
    public Site(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setPinterestUrl(String pinterestUrl) {
        this.pinterestUrl = pinterestUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public String getPinterestUrl() {
        return pinterestUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getConfidence() {
        return confidence;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public String getMedium_Url() {
        return medium_Url;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public void setMedium_Url(String medium_Url) {
        this.medium_Url = medium_Url;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }
}

