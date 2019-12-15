package com.web.big.homework.servlet;

import com.web.big.homework.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private LoginService loginService = new LoginService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        String password = req.getParameter("password");
        String email = req.getParameter("email");



        int i = loginService.doRegister(number, password,email);
        if(i>0){
            req.setAttribute("message","注册成功");
            req.getRequestDispatcher("/login").forward(req,resp);
        }else{
            req.setAttribute("message","注册失败");
            req.getRequestDispatcher("/500.jsp").forward(req,resp);
        }
    }
}
