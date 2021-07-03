
package com.pagecategories.Site;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "github_url",
        "facebook_url",
        "twitter_url",
        "instagram_url",
        "youtube_url",
        "medium_url",
        "pinterest_url",
        "linkedin_url"
})
@Generated("jsonschema2pojo")
public class SocialMediaKlazify {
    @JsonProperty("github_url")
    private String githubUrl;
    @JsonProperty("facebook_url")
    private String facebookUrl;
    @JsonProperty("twitter_url")
    private String twitterUrl;
    @JsonProperty("instagram_url")
    private String instagramUrl;
    @JsonProperty("youtube_url")
    private String youtubeUrl;
    @JsonProperty("medium_url")
    private String medium_Url;
    @JsonProperty("pinterest_url")
    private String pinterestUrl;
    @JsonProperty("linkedin_url")
    private String linkedinUrl;


    @JsonProperty("github_url")
    public String getGithubUrl() {
        return githubUrl;
    }

    @JsonProperty("github_url")
    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    @JsonProperty("facebook_url")
    public String getFacebookUrl() {
        return facebookUrl;
    }

    @JsonProperty("facebook_url")
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    @JsonProperty("twitter_url")
    public String getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitter_url")
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("instagram_url")
    public String getInstagramUrl() {
        return instagramUrl;
    }

    @JsonProperty("instagram_url")
    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    @JsonProperty("youtube_url")
    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    @JsonProperty("youtube_url")
    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    @JsonProperty("linkedin_url")
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    @JsonProperty("medium_url")
    public String getMedium_Url() {
        return medium_Url;
    }

    @JsonProperty("pinterest_url")
    public String getPinterestUrl() {
        return pinterestUrl;
    }

    @JsonProperty("linkedin_url")
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    @JsonProperty("medium_url")
    public void setMedium_Url(String medium_Url) {
        this.medium_Url = medium_Url;
    }

    @JsonProperty("pinterest_url")
    public void setPinterestUrl(String pinterestUrl) {
        this.pinterestUrl = pinterestUrl;
    }
}
