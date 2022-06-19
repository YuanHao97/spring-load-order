package com.example.spring.load.order.BeanFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.servlet.Filter;
import java.util.Map;

public class FilterFactoryBean implements FactoryBean, BeanPostProcessor {
    private static transient final Logger log = LoggerFactory.getLogger(FilterFactoryBean.class);
    private Map<String, String> defMap;
    @Override
    public Object getObject() throws Exception {
        log.info("FilterBeanFactory:getObject");
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        log.info("FilterBeanFactory:getObjectType");
        return null;
    }

    @Override
    public boolean isSingleton() {
        log.info("FilterBeanFactory:isSingleton");
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("FilterBeanFactory:postProcessBeforeInitialization, bean type {}, bean name {}", bean.getClass().toString(), beanName);
        if (bean instanceof Filter) {
            log.info("found filter chain filter: {}", beanName);
            Filter filter = (Filter) bean;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("FilterBeanFactory:postProcessAfterInitialization, bean type {}, bean name {}", bean.getClass().toString(), beanName);
        return bean;
    }

    public void setFilterChainDefinition(Map<String, String> filters) {
        log.info("FilterBeanFactory:setFilterChainDefinition");
        this.defMap = filters;
    }
}
