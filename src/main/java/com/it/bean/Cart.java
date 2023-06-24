package com.it.bean;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Integer,CartItem> map=new HashMap();
    private Integer totalCount;
    private Double totalAmount;
    public void addCart(Book book){
        CartItem cartItem = map.get(book.getId());
        if(cartItem==null){
            CartItem cartItem1 = new CartItem(book,1);
            map.put(book.getId(),cartItem1);
        }else {
            cartItem.setCount(cartItem.getCount()+1);
        }
        System.out.println(map);
    }

    public Integer getTotalCount(){
        Collection<CartItem> values = map.values();
        Integer total=0;
        for (CartItem value : values) {
            total += value.getCount();
        }
        this.totalCount=total;
        return total;

    }

    public Collection<CartItem> getAllCartItem(){
        return map.values();
    }

    public Double getTotalAmount(){
        Collection<CartItem> values = map.values();
        BigDecimal total = new BigDecimal("0");
        for (CartItem value : values) {
            BigDecimal amount = new BigDecimal(value.getAmount()+"");
            total=total.add(amount);
        }
        this.totalAmount=total.doubleValue();
        return totalAmount;
    }

    public void addCount(Integer id){
        CartItem cartItem = map.get(id);
        cartItem.setCount(cartItem.getCount()+1);

    }

    public void deleteCartItem(Integer id){
        map.remove(id);
    }

    public void subCount(Integer id){
        CartItem cartItem = map.get(id);
        cartItem.setCount(cartItem.getCount()-1);

    }

    public void changeCount(Integer id,Integer newCount){
        CartItem cartItem = map.get(id);
        cartItem.setCount(newCount);

    }
}
