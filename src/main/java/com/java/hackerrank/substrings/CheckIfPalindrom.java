package com.java.hackerrank.substrings;
/*
    Check if a string is a palindrom
* */
public class CheckIfPalindrom {
    public static void main(String[] args) {
        String val = "madam";
        String reversed = new StringBuilder(val).reverse().toString();
        System.out.println(val);
        System.out.println(reversed);
        System.out.println(val.equals(reversed));
        System.out.println(val.equalsIgnoreCase(new StringBuilder(val).reverse().toString()));
    }
}
