package com.tom;

public class Person {
    public static void main(String[] args){

        Customer[] customers = {
                new Customer("0013",490,0,490),
                new Customer("0052",1000,100,900),
                new Customer("0081",290,0,290),
                new Customer("2122",2000,200 ,1800)
        };

        System.out.println("客戶編號/消費金額/折讓/金額");

        for (int i = 0; i < customers.length; i++) {
            customers[i].print();
        }

    }
}
