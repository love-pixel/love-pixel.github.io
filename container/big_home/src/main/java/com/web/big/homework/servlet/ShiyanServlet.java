package com.web.big.homework.servlet;

import com.web.big.homework.bean.Labortory;
import com.web.big.homework.service.LabortoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/shiyan")
public class ShiyanServlet extends HttpServlet {
    private LabortoryService labortoryService = new LabortoryService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Labortory> allLabortories = labortoryService.getAllLabortories();
        System.out.println(allLabortories.size());
        req.setAttribute("labortories",allLabortories);
        req.getRequestDispatcher("/WEB-INF/view/shiyan.jsp").forward(req,resp);
    }
}
