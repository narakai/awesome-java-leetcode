package com.blankj.csutom;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcba";
        System.out.println(isAnagram3(s1, s2));
    }

    public static boolean isAnagram(String word, String anagram) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();//将str倒置的方法
        String newStr = new String(sb);
        return anagram.equals(newStr);
    }


    public static boolean iAnagram2(String word, String anagram) {
        //默认长度>1
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return !word.equals(anagram) && Arrays.equals(charFromWord, charFromAnagram);
    }

    public static boolean isAnagram3(String word, String anagram) {
        if (word.length() != anagram.length() || word.equals(anagram)) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

}
