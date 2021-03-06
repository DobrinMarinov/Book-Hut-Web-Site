package controllers;

import config.Config;
import models.bindingModels.LoginModel;
import services.UserService;
import servicesImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/signin")
public class SignInController extends HttpServlet{

    private UserService userService;

    public SignInController() {
        this.userService = new UserServiceImpl();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("templates/signin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String signUp = req.getParameter("signin").toString();
        if(signUp != null) {
            String username = req.getParameter("username").toString();
            String password = req.getParameter("password").toString();
            LoginModel currentLoginModel = this.userService.findByUsernameAndPassword(username, password);
            if(currentLoginModel != null) {
                HttpSession session = req.getSession();
                session.setAttribute(Config.LOGIN_MODEL, currentLoginModel);
                resp.sendRedirect("/");
            } else {
                req.getRequestDispatcher("/templates/signin.jsp").forward(req, resp);
            }
        }
    }
}
