package com.example.spring.load.order.config;

import com.example.spring.load.order.BeanFactory.FilterFactoryBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.DispatcherType;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class FilterConfig {
    @Bean("mtFilter")
    public FilterFactoryBean mtFilter() {
        FilterFactoryBean f = new FilterFactoryBean();
        String filters = "/ = user\n" +
                "/data/dim/** = user\n";
        Map<String, String> m = new HashMap<>();
        m.put("user","/data/dim/**");
        f.setFilterChainDefinition(m);
        return  f;
    }

    @Bean
    public FilterRegistrationBean delegationFilterProxy() {
        DelegatingFilterProxy filter = new DelegatingFilterProxy();
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        filter.setTargetBeanName("mtFilter");
        filter.setTargetFilterLifecycle(true);
        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        registrationBean.setDispatcherTypes(DispatcherType.FORWARD);
        registrationBean.setName("mtFilter");
        registrationBean.setOrder(1);
        registrationBean.setEnabled(false);
        return registrationBean;
    }
}
