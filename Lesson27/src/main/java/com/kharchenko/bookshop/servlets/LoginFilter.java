package com.kharchenko.bookshop.servlets;

import javax.servlet.*;
import java.io.IOException;

public class LoginFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        String login = servletRequest.getParameter("login");
        String password = servletRequest.getParameter("password");

        if (login.equals("John") && password.equals("secret")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println("incorrect user name and password");
            throw new ServletException("incorrect user name and password");
        }
    }

    public void destroy() {
    }
}
