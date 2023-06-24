package com.it.servlet.model;

import com.it.servlet.base.BaseServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserServlet extends BaseServlet {

    protected void toRegisterPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.processTemplate("register",request,response);

    }

    protected void toLoginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("aaaa");
        this.processTemplate("index",request,response);

    }


}
