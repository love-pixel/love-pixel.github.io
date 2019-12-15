package com.web.big.homework.servlet;

import com.web.big.homework.bean.Profile;
import com.web.big.homework.service.ProfileService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    private ProfileService profileService = new ProfileService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Profile> allProfile = profileService.getAllProfile();
        req.setAttribute("profiles",allProfile);
        req.getRequestDispatcher("/WEB-INF/view/profile.jsp").forward(req,resp);
    }
}
