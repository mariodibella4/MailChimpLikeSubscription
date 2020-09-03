package com.newsletter.subscription;

import configuration.MyWebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@SpringBootApplication
public class SubscriptionApplication extends AbstractAnnotationConfigDispatcherServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SubscriptionApplication.class, args);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { MyWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
