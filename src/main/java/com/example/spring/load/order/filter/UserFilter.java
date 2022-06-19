package com.example.spring.load.order.filter;

import com.example.spring.load.order.BeanFactory.FilterFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class UserFilter implements Filter {
    private static transient final Logger log = LoggerFactory.getLogger(UserFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }


    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    public boolean onPrehandle(){
        log.info("UserFilter:onPrehandle");
        return true;
    }
}
