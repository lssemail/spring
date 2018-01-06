package spittr.initializer;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lssemail on 2018/1/5.
 */
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter-init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter-doFilter");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter-destroy");
    }
}
