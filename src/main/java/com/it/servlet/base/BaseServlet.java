package com.it.servlet.base;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

public class BaseServlet extends ViewBaseServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, UnsupportedEncodingException {
        doGet(request,response);

    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String flag=request.getParameter("flag");
        Class c=this.getClass();
        try{
            Method method=c.getDeclaredMethod(flag,HttpServletRequest.class,HttpServletResponse.class);
            method.setAccessible(true);
            method.invoke(this,request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

