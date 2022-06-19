package com.example.spring.load.order.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("user")
public class PartnerUserFilter extends UserFilter {
    private static transient final Logger log = LoggerFactory.getLogger(PartnerUserFilter.class);
    @Override
    public boolean onPrehandle(){
        log.info("PartnerUserFilter:onPrehandle");
        return true;
    }
}
