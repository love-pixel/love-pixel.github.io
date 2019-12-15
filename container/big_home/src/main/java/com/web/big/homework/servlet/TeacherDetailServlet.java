package com.web.big.homework.servlet;

import com.web.big.homework.bean.Teacher;
import com.web.big.homework.service.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.PrivateKey;

@WebServlet("/teacher_detail")
public class TeacherDetailServlet extends HttpServlet {
    private TeacherService teacherService = new TeacherService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teacher_id = req.getParameter("teacher_id");
        Teacher teacher = teacherService.getTeacherByTeacherId(Integer.parseInt(teacher_id));
        req.setAttribute("teacher",teacher);
        req.getRequestDispatcher("/WEB-INF/view/teacher_detail.jsp").forward(req,resp);
    }
}
