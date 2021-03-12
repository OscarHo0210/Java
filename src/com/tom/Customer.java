package com.tom;

public class Customer {
    String id;
    int money;
    int discount;
    int lastMoney;
    public Customer(String id, int money, int discount, int lastMoney){
        this.id = id;
        this.money = money;
        this.discount = discount;
        this.lastMoney = lastMoney;
    }
    public void print(){
        System.out.println(id + "/" + money + "/" + discount + "/" + lastMoney);
    }
}
