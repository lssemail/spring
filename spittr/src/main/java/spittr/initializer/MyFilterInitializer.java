package spittr.initializer;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by lssemail on 2018/1/5.
 */
public class MyFilterInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        FilterRegistration.Dynamic filter = servletContext.addFilter("myFilter", MyFilter.class);
        filter.addMappingForUrlPatterns(null, Boolean.FALSE, "/*");

    }
}
