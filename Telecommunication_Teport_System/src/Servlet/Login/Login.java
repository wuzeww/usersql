package Servlet.Login;

import model.User.NormalUser;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/template/Login/Login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        System.out.println("1");
        if (request.getParameter("userID").equals("1") && request.getParameter("password").equals("1"))
        {
            HttpSession httpSession = request.getSession();
            NormalUser normalUser = new NormalUser();
            String id = request.getParameter("userID");
            normalUser.setUserID(id);
            String passwd = request.getParameter("password");
            normalUser.setPassword(passwd);
            System.out.println(id);
            System.out.println(passwd);
            httpSession.setAttribute("user", normalUser);
            response.sendRedirect("/template/Main_Page/mainpage.jsp");
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
