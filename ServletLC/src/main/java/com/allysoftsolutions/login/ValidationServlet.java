package com.allysoftsolutions.login;

import com.allysoftsolutions.connection.MyConn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/validate")
public class ValidationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("from doGet");
        validate(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("from doPost");
        validate(req, resp);
    }
    void validate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //fetch all parameters
        String unm = req.getParameter("uname");
        String pd = req.getParameter("pwd");
        PrintWriter out = resp.getWriter();
        MyConn conn = MyConn.getInstance();
        String res = conn.validateUser(unm,pd);
        if(!res.equals("No user found")){
            out.print("Welcome "+res);
        }else{
            out.print("invalid credentials/"+res);
        }
    }
}
