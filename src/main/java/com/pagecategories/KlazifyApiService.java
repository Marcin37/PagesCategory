package com.pagecategories;


import com.pagecategories.Site.SiteKlazify;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class KlazifyApiService {
    private String apiKey;

    private RestTemplate restTemplate;


    public KlazifyApiService(RestTemplate restTemplate, @Value("${api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey=apiKey;
    }

    private HttpEntity<String> buildHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(apiKey);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setCacheControl("no-cache");
        return new HttpEntity<>(headers);
    }

    public SiteKlazify getSiteKLazifyCategories(String pageUrl) {
        String url = "https://www.klazify.com/api/categorize?url=" + pageUrl;
        HttpEntity<?> httpEntity = buildHttpEntity();
        SiteKlazify siteKlazify = restTemplate.postForObject(url, httpEntity, SiteKlazify.class);
        return siteKlazify;
    }
}
