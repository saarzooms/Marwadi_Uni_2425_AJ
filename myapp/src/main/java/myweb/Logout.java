package myweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Cookie userCookie;
        for(Cookie c:cookies){
            if(c.getName().equals("uname")){
                userCookie = c;
                userCookie.setValue("");
                userCookie.setMaxAge(0);
                resp.addCookie(userCookie);
            }
        }
//        resp.setIntHeader("refresh",5);
        resp.sendRedirect("login");

    }
}
