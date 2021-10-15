package com.java.hackerrank.substrings;

import java.util.*;

/*
    Find anagram
    Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
    Function Description
    Complete the isAnagram function in the editor.
    isAnagram has the following parameters:
    string a: the first string
    string b: the second string
    Returns
    boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
* */
public class Anagram {
    public static void main(String[] args) {
        String a = "banana1";
        String b = "banana3";

        boolean isAnagram = new Anagram().isAnagram(a, b);
        System.out.println(isAnagram);
    }

    public boolean isAnagram(String val1, String val2) {
        if (Objects.isNull(val1) || val1.isEmpty() || Objects.isNull(val2) || val2.isEmpty()) {
            return false;
        }

        if (val1.trim().length() != val2.trim().length()) {
            System.out.println("Not Same length: " + val1.trim().length() + " val2: " + val2.trim().length());
            return false;
        }

        char[] arr1 = val1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = val2.toCharArray();
        Arrays.sort(arr2);

        Map<Character, Integer> map1 = getCharCount(arr1);
        Map<Character, Integer> map2 = getCharCount(arr2);

        System.out.println(arr1);
        System.out.println(val1 + ": " + map1);
        System.out.println(arr2);
        System.out.println(arr2 + ": " + map2);

        if ((map1.size() != map2.size())) {
            return false;
        }

        System.out.println("both map keys are the same: " + (map1.keySet().containsAll(map2.keySet())));
        Collection<Integer> values = map1.values();
        Collection<Integer> values2 = map2.values();

        return (map1.keySet().containsAll(map2.keySet())) && (values.containsAll(values2));
    }

    public TreeMap<Character, Integer> getCharCount(char[] chars) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            char _x = chars[i];
            int counter = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (_x == chars[j]) {
                    counter++;
                }
            }
            if (!treeMap.containsKey(_x)) {
                treeMap.put(_x, counter);
            }
        }

        return treeMap;
    }
}
