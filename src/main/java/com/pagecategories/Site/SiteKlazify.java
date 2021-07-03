
package com.pagecategories.Site;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domain",
    "success"
})
@Generated("jsonschema2pojo")
public class SiteKlazify {

    @JsonProperty("domain")
    private DomainKlazify domainKlazify;
    @JsonProperty("success")
    private Boolean success;

    private SiteKlazify(){

    }

    @JsonProperty("domain")
    public DomainKlazify getDomainKlazify() {
        return domainKlazify;
    }

    @JsonProperty("domain")
    public void setDomainKlazify(DomainKlazify domainKlazify) {
        this.domainKlazify = domainKlazify;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }



}
