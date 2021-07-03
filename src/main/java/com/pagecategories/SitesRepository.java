package com.pagecategories;

import com.pagecategories.Site.DomainKlazify;
import com.pagecategories.Site.Site;
import com.pagecategories.Site.SiteKlazify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface SitesRepository extends JpaRepository<Site,Long> {

   boolean existsByDomainUrl(String domainUrl);

}
