package com.allysoftsolutions.sessiontracking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/scthird")
public class ServletCookieThird extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie:cookies){
            out.println(cookie.getName());
            out.println(cookie.getValue());
            out.println(cookie.getDomain());
            out.println(cookie.getPath());
            out.println(cookie.getMaxAge());
            out.println(cookie.getSecure());
            out.println(cookie.getVersion());
            out.println(cookie.getComment());
        }
    }
}
