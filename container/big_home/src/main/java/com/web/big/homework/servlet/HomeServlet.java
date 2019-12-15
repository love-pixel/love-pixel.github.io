package com.web.big.homework.servlet;

import com.web.big.homework.bean.News;
import com.web.big.homework.service.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    private NewsService newsService = new NewsService();

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> allNews = newsService.getAllNews();
        req.setAttribute("news",allNews);
        req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req,resp);
    }
}
