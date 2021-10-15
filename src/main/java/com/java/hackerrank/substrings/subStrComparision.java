package com.java.hackerrank.substrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string, , and an integer, ,
 * complete the function so that it finds
 * the lexicographically smallest and largest substrings of length *
 */

public class subStrComparision {
    public static void main(String[] args) {
        String givenString = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        char[] splitted = givenString.toCharArray();
        System.out.println(splitted.length);

        List<String> newList = new ArrayList<>();
        int size = 1;
        for (int i = 0; i < splitted.length; i++) {
            try {
                int endIdx = i + size;
                String a = givenString.substring(i, endIdx);
                newList.add(a);
                if (givenString.length() == endIdx) {
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(newList);
                System.out.println(e.getMessage());
            }
        }

        Collections.sort(newList);
        System.out.println(newList);

        System.out.println(newList.get(0));
        System.out.println(newList.get(newList.size()-1));


    }
}
