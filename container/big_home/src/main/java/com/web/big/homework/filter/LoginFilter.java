package com.web.big.homework.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yangenyu
 */
public class LoginFilter implements Filter {
    private String excludePages;
    private String[] excludePageArray;

    public String getExcludePages() {
        return excludePages;
    }

    public void setExcludePages(String excludePages) {
        this.excludePages = excludePages;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.excludePages = filterConfig.getInitParameter("excludePages");
        if(this.excludePages != null){
            this.excludePageArray = this.excludePages.split(",");
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;

        //排除路径
        String path = req.getServletPath();
        for(String p : excludePageArray){
            if(path.indexOf(p) > 0){
                filterChain.doFilter(req,resp);
                return;
            }
        }


        HttpSession session = req.getSession();
        String number = (String)session.getAttribute("number");
        if(number != null){
            filterChain.doFilter(req,resp);
        } else{
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    public void destroy() {

    }
}
