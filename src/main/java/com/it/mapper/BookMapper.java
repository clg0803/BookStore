package com.it.mapper;

import com.it.bean.Book;

import java.util.List;

public interface BookMapper {
    List<Book> findAllBook();
    Boolean saveBook(Book book);
    Boolean deleteBook(Integer id);
    Book findBookById(Integer id);
    boolean upDateBook(Book book);
}