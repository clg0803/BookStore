package com.it.servlet.model;

import com.it.bean.Book;
import com.it.mapper.BookMapper;
import com.it.mapper.UserMapper;
import com.it.servlet.base.BaseServlet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;


public class BookServlet extends BaseServlet {
    protected void findAllBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        List<Book> allbook=bookMapper.findAllBook();
        sqlSession.close();
        System.out.println(allbook);
        request.setAttribute("books",allbook);
        //response.sendRedirect("book_manager.html");*/
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        List<Book> allbooks=bookMapper.findAllBook();
        sqlSession.close();
        System.out.println(allbooks);
        request.setAttribute("books",allbooks);
        //response.sendRedirect("book_manager.html");


        this.processTemplate("manager/book_manager",request,response);


    }

    protected void toAddBookPage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        this.processTemplate("manager/book_add",request,response);
    }

    protected void addBook(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        Map<String, String[]> parameterMap = request.getParameterMap();
        Book book=new Book();
        //BeanUtils.populate
        //book.getBookName(parameterMap.get("book"));
        try {
            org.apache.commons.beanutils.BeanUtils.populate(book,parameterMap);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println(book);
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        //List<Book> allbooks=bookMapper.findAllBook();
        Boolean flag=bookMapper.saveBook(book);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
        if(flag){
            response.sendRedirect(request.getContextPath()+"/book?flag=findAllBook");
        }

        //System.out.println(parameterMap);
       // this.processTemplate("manager/book_add",request,response);
    }

    protected void deleteBook(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        Integer id = Integer.valueOf(request.getParameter("id"));

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        Boolean flag=bookMapper.deleteBook(id);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
        if(flag){
            response.sendRedirect(request.getContextPath()+"/book?flag=findAllBook");
        }

    }


    protected void toUpdateBookPage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        Integer id = Integer.valueOf(request.getParameter("id"));

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        Book bookById = bookMapper.findBookById(id);
        request.setAttribute("book",bookById);
        this.processTemplate("manager/book_edit",request,response);
        /*Boolean flag=bookMapper.deleteBook(id);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
        if(flag){
            response.sendRedirect(request.getContextPath()+"/book?flag=findAllBook");
        }*/

    }

    protected void toUpdateBook(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        Integer id = Integer.valueOf(request.getParameter("id"));

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        Book bookById = bookMapper.findBookById(id);
        request.setAttribute("book",bookById);
        Map<String, String[]> parameterMap = request.getParameterMap();
        Book book=new Book();
        //BeanUtils.populate
        //book.getBookName(parameterMap.get("book"));
        try {
            org.apache.commons.beanutils.BeanUtils.populate(book,parameterMap);
            System.out.println(book);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


        Boolean flag=bookMapper.upDateBook(book);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
        if(flag){
            response.sendRedirect(request.getContextPath()+"/book?flag=findAllBook");
        }

        //this.processTemplate("manager",request,response);
        /*Boolean flag=bookMapper.deleteBook(id);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
        if(flag){
            response.sendRedirect(request.getContextPath()+"/book?flag=findAllBook");
        }*/

    }

}
