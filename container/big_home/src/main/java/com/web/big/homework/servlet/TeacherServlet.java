package com.web.big.homework.servlet;

import com.web.big.homework.bean.Teacher;
import com.web.big.homework.service.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/teacher")
public class TeacherServlet extends HttpServlet {
    private TeacherService teacherService = new TeacherService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Teacher> allTeacher = teacherService.getAllTeacher();
        req.setAttribute("teachers",allTeacher);
        req.getRequestDispatcher("/WEB-INF/view/teacher.jsp").forward(req,resp);
    }
}
