package com.blankj.csutom;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "ba";
        String s2 = "ab";
        System.out.println(iAnagram(s1, s2));
    }

    public static boolean iAnagram(String word, String anagram) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();//将str倒置的方法
        String newStr = new String(sb);
        return anagram.equals(newStr);
    }

}
