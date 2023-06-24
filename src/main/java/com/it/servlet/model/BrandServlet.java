package com.it.servlet.model;

import com.it.bean.Brand;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BrandServlet extends HttpServlet {
    BrandService brandService = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("a");
        //List<Brand> brands = brandService.selectAll();
        //request.setAttribute("brands",brands);
        System.out.println(brandService.selectAll());
        //request.getRequestDispatcher("brand.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
