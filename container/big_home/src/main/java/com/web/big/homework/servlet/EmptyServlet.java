package com.web.big.homework.servlet;

import com.web.big.homework.bean.Major;
import com.web.big.homework.bean.Teacher;
import com.web.big.homework.service.LabortoryService;
import com.web.big.homework.service.MajorService;
import com.web.big.homework.service.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/empty")
public class EmptyServlet extends HttpServlet {
    private TeacherService teacherService = new TeacherService();
    private MajorService majorService = new MajorService();
    private LabortoryService labortoryService = new LabortoryService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Teacher> allTeacher = teacherService.getAllTeacher();
        List<Major> allMajor = majorService.getAllMajor();

        req.setAttribute("teachers",allTeacher);
        req.setAttribute("majors",allMajor);
        req.getRequestDispatcher("/WEB-INF/view/empty.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String labname = req.getParameter("labname");
        Integer labmajorId = Integer.parseInt(req.getParameter("labmajor"));
        Integer labteacherId = Integer.parseInt(req.getParameter("labteacher"));
        String labstudentname = req.getParameter("labstudent");
        Integer labstatus = Integer.parseInt(req.getParameter("labstatus"));
        String labproject = req.getParameter("labproject");
        Integer labstudentnumber = Integer.parseInt(req.getParameter("labstudentnumber"));

        int a = labortoryService.addLabortory( labname,
                                         labmajorId,
                                         labteacherId,
                                         labstudentname,
                                         labstatus,
                                         labproject,
                                         labstudentnumber);

        if(a>0){
            resp.sendRedirect("/empty");
        }
    }
}
