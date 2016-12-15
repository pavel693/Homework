package com.kharchenko.bookshop.servlets;

import com.kharchenko.bookshop.credentials.Validation;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    private Validation validation;

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        String login = servletRequest.getParameter("login");
        String password = servletRequest.getParameter("password");

        validation = new Validation(login, password);

        if (validation.userValidation()) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            HttpServletResponse resp = (HttpServletResponse) servletResponse;
            resp.sendRedirect("/context/forgotpassword.html");
        }
    }

    public void destroy() {
    }
}
