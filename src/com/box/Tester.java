package com.box;

import java.util.Scanner;

public class Box{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height");
        int height = Integer.parseInt(scanner.next());
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        if (box1.validate(length, width, height)) {
            System.out.println(box1.getName());
        }


    }