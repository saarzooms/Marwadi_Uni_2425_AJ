package com.allysoftsolutions.servletlc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/servlet-three")
public class ServletThree extends HttpServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method from servlet 3 called");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig method called");
        return null;
    }

//    @Override
//    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        System.out.println("service method called");
//        PrintWriter out =  servletResponse.getWriter();
//        out.println("service called from servlet 3");
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method called");
        PrintWriter out =  resp.getWriter();
        out.println("doGet called from servlet 3");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo method called");
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("destroy method called ServletThree");
    }
}
