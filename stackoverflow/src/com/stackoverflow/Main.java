package com.stackoverflow;


import com.stackoverflow.models.User;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello StackOverflow");
        User amit = new  User("amit","amit@gmail.com");

        System.out.println(amit.getUserName());
    }
}