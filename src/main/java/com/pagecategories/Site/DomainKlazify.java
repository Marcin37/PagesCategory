
package com.pagecategories.Site;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "categories",
        "domain_url",
        "social_media",
        "logo_url"
})
@Generated("jsonschema2pojo")
public class DomainKlazify {
    @JsonProperty("categories")
    private List<CategoryKlazify> categories = null;
    @JsonProperty("domain_url")
    private String domainUrl;
    @JsonProperty("social_media")
    private SocialMediaKlazify socialMediaKlazify;
    @JsonProperty("logo_url")
    private String logoUrl;


    @JsonProperty("categories")
    public List<CategoryKlazify> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<CategoryKlazify> categories) {
        this.categories = categories;
    }

    @JsonProperty("domain_url")
    public String getDomainUrl() {
        return domainUrl;
    }

    @JsonProperty("domain_url")
    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    @JsonProperty("social_media")
    public SocialMediaKlazify getSocialMediaKlazify() {
        return socialMediaKlazify;
    }

    @JsonProperty("social_media")
    public void setSocialMediaKlazify(SocialMediaKlazify socialMediaKlazify) {
        this.socialMediaKlazify = socialMediaKlazify;
    }

    @JsonProperty("logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("logo_url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }


}
