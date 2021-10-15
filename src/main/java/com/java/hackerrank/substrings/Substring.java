package com.java.hackerrank.substrings;
/*
* substring warm up
* */
public class Substring {
    public static void main(String[] args) {
        String val = "Helloworld";
        System.out.println(String.format("length of val: %d: ",val.length()));
        System.out.println(val.substring(0, 4));
        System.out.println("substring includes the first given index and exclude given ending index");
    }
}
