package Servlet.Login;

import DAO.user.user_DAO;
import model.User.BaseUser;
import model.User.NormalUser;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Login", urlPatterns = "/template/Login/Login")
public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        System.out.println("1");
        user_DAO user_dao = new user_DAO();
        BaseUser baseUser;
        try {
            baseUser = user_dao.findByID(request.getParameter("userID"));
            if (baseUser.getPassword().equals(request.getParameter("password")))
            {
                HttpSession httpSession = request.getSession();

//                System.out.println(baseUser.getUserID());
//                System.out.println(baseUser.getUserName());
//
//                System.out.println(baseUser.getPassword());
                httpSession.setAttribute("userName", baseUser.getUserName());
                httpSession.setAttribute("user", baseUser);
                request.getRequestDispatcher("/template/Main_Page/mainpage.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
