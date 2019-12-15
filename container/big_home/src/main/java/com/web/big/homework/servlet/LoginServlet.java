package com.web.big.homework.servlet;

import com.web.big.homework.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private LoginService loginService = new LoginService();

  
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        String password = req.getParameter("password");
        List<Map<String, Object>> maps = loginService.doLogin(number, password);
        if(maps !=null && maps.size() > 0){
            HttpSession session = req.getSession();
            session.setAttribute("number", maps.get(0).get("number"));
            resp.sendRedirect("/home");
        }else {
            req.getRequestDispatcher("/404.jsp").forward(req, resp);
        }
    }
}
