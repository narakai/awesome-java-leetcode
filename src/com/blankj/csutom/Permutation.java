package com.blankj.csutom;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
//        System.out.println(permutation("abcd").length);
        System.out.println(Arrays.toString(permutation("abcd")));
    }

    private static String[] permutation(String orginal){
        ArrayList list = new ArrayList();
        if(orginal.length() == 1){
            return new String[]{orginal};
        } else{
            for (int i = 0; i < orginal.length(); i++) {
                String s = orginal.charAt(i) + "";
                String result = "";
                String resultA = result + s;
                String leftS = orginal.substring(0, i) + orginal.substring(i + 1, orginal.length());
                //递归 permutation(leftS) 从2位慢慢加起来的
                for (String element : permutation(leftS)) {
                    result = resultA + element;
                    System.out.println(result);
                    list.add(result);
                }
            }
            return (String[]) list.toArray(new String[list.size()]);
        }
    }
}
