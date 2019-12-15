package com.web.big.homework.servlet;

import com.web.big.homework.bean.Major;
import com.web.big.homework.service.MajorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/major")
public class MajorServlet extends HttpServlet {
    private MajorService majorService = new MajorService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Major> allMajor = majorService.getAllMajor();
        req.setAttribute("majors",allMajor);
        req.getRequestDispatcher("/WEB-INF/view/major.jsp").forward(req,resp);
    }
}
