package com.assesment.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webconfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{

                com.assesment.springmvc.config.appconfig.class



        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{

                "/"

        };
    }
}
