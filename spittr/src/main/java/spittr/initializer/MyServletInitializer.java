package spittr.initializer;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by lssemail on 2018/1/5.
 */
public class MyServletInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        ServletRegistration.Dynamic myServlet =
                servletContext.addServlet("myServlet", MyServlet.class);
        myServlet.addMapping("/myServlet/*");


    }
}
