package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import config.WebConfig;

//configurations using java instead of  xml
// this is the servelet initializer
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //final class of spring and hybernate configuration
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
