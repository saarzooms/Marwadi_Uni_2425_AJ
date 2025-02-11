package com.allysoftsolutions.servletlc;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/servlet-two")
public class ServletTwo extends GenericServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method from servlet 2 called");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig method called");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called");
        PrintWriter out =  servletResponse.getWriter();
        out.println("service called from servlet 2");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo method called");
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("destroy method called ServletTwo");
    }
}
