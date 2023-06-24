package com.it.servlet.model;

import com.google.gson.Gson;
import com.it.bean.Book;
import com.it.bean.Cart;
import com.it.bean.CartItem;
import com.it.mapper.BookMapper;
import com.it.servlet.base.BaseServlet;
import com.it.util.CommonResult;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

public class CartServlet extends BaseServlet {
    protected void addCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        if(cart==null){
            cart = new Cart();
            session.setAttribute("cart",cart);
        }
        Integer id = Integer.valueOf(request.getParameter("id"));

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        Book bookById = bookMapper.findBookById(id);
        cart.addCart(bookById);
        Integer totalCount = cart.getTotalCount();
        CommonResult ok = CommonResult.ok().setResultData(totalCount);
        String s = new Gson().toJson(ok);
        System.out.println(ok);

        response.getWriter().write(s);



    }

    protected void toCartPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("a");
        this.processTemplate("cart/cart",request,response);

    }

    protected void showCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cart cart = (Cart) request.getSession().getAttribute("cart");
        Collection<CartItem> allCartItem = cart.getAllCartItem();
        Integer totalCount = cart.getTotalCount();
        Double totalAmount = cart.getTotalAmount();
        ArrayList arrayList = new ArrayList();
        arrayList.add(allCartItem);
        arrayList.add(totalCount);
        arrayList.add(totalAmount);
        CommonResult commonResult = CommonResult.ok().setResultData(arrayList);
        String s = new Gson().toJson(commonResult);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(s);


    }

    protected void clearCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("cart");
        this.processTemplate("cart/cart",request,response);

    }

    protected void addCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        cart.addCount(Integer.parseInt(id));
        showCart(request,response);

    }
    protected void deleteCartItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        cart.deleteCartItem(Integer.parseInt(id));
        showCart(request,response);

    }

    protected void subCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        cart.subCount(Integer.parseInt(id));
        showCart(request,response);

    }

    protected void changeCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String  newCount= request.getParameter("newCount");
        HttpSession session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        cart.changeCount(Integer.parseInt(id),Integer.parseInt(newCount));
        showCart(request,response);

    }

}
