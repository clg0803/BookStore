package com.it.bean;

import java.math.BigDecimal;

public class CartItem {
    private Book book;
    private Integer count;

    @Override
    public String toString() {
        return "CartItem{" +
                "book=" + book +
                ", count=" + count +
                ", amount=" + amount +
                '}';
    }

    private Double amount;

    public CartItem(Book book, Integer count) {
        this.book = book;
        this.count = count;
        BigDecimal price = new BigDecimal(this.book.getPrice()+"");
        BigDecimal count1 = new BigDecimal(this.count+"");
        this.amount=price.multiply(count1).doubleValue();

    }

    public CartItem() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
        BigDecimal price = new BigDecimal(this.book.getPrice()+"");
        BigDecimal count = new BigDecimal(this.count+"");
        this.amount=price.multiply(count).doubleValue();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
        BigDecimal price = new BigDecimal(this.book.getPrice()+"");
        BigDecimal count1 = new BigDecimal(this.count+"");
        this.amount=price.multiply(count1).doubleValue();
    }

    public Double getAmount() {
        return amount;
    }


}
