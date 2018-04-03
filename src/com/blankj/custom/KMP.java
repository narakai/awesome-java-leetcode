package com.blankj.custom;

import java.util.Arrays;

public class KMP {
//    http://blog.csdn.net/v_july_v/article/details/7041827
//    http://blog.csdn.net/christ1750/article/details/51259425

//    失配时，模式串向右移动的位数为：已匹配字符数 - 失配字符的上一位字符所对应的最大长度值

//    把next 数组跟之前求得的最大长度表对比后，不难发现，next 数组相当于“最大长度值” 整体向右移动一位，然后初始值赋为-1。
//    意识到了这一点，你会惊呼原来next 数组的求解竟然如此简单：就是找最大对称长度的前缀后缀，然后整体右移一位，初值赋为-1（
//    当然，你也可以直接计算某个字符对应的next值，就是看这个字符之前的字符串中有多大长度的相同前缀后缀）。

//    失配时，模式串向右移动的位数为：失配字符所在位置 - 失配字符对应的next 值

    public static int[] kmpnext(String dest) {
//        String a = "baba";  [0,0,1,2]
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(j) != dest.charAt(i)) {
                j = next[j - 1];
                System.out.println("j1= " + j + " i1= " + i);
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int kmp(String str, String dest, int[] next) {//str文本串  dest 模式串
        for (int i = 0, j = 0; i < str.length(); i++) {
            while (j > 0 && str.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
                System.out.println("j= " + j + " i= " + i);
            }
            if (str.charAt(i) == dest.charAt(j)) {
                j++;
            }
            if (j == dest.length()) {
                return i - j + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //next 数组确实是只要将各个最大前缀后缀的公共元素的长度值右移一位，且把初值赋为-1 即可
        String a = "abcabcaaf";
        String b = "abcabcabea";
        int[] next = kmpnext(a);
        int res = kmp(b, a, next);

        System.out.println("index is: " + res);
        System.out.println(Arrays.toString(next));
    }
}
