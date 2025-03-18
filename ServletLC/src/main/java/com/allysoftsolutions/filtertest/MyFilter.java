package com.allysoftsolutions.filtertest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
@WebFilter("/test/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("from filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest)servletRequest;
        System.out.println("from dofilter before call"+(new Date().toString())+" "+req.getRemoteAddr());
        if(req.getRemoteAddr().equals("10.80.30.30"))
        filterChain.doFilter(servletRequest,servletResponse);
        else
            servletResponse.getWriter().println("You are not authorized to access");
        System.out.println("from dofilter after  call"+(new Date().toString()));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
