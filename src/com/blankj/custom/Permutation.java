package com.blankj.custom;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
//        System.out.println(permutation("abcd").length);
        System.out.println(Arrays.toString(permutation("abc")));
    }

    private static String[] permutation(String orginal) {
        System.out.println("orginal = " + orginal);
        ArrayList list = new ArrayList();
        if (orginal.length() == 1) {
            System.out.println("跳出递归 " + orginal);
            return new String[]{orginal};
        } else {
            for (int i = 0; i < orginal.length(); i++) {
                String s = orginal.charAt(i) + "";
                System.out.println("s: " + s + " + " + i);
                //e.g bc时分别输出c b
                String leftS = orginal.substring(0, i) + orginal.substring(i + 1, orginal.length());
                System.out.println("leftS: " + leftS);
                //递归 permutation(leftS)
                for (String element : permutation(leftS)) {
                    System.out.println("递归： " + s + " + " + element + " = " + (s + element));
                    list.add(s + element);
                }
            }
            System.out.println(Arrays.toString(list.toArray()));
            return (String[]) list.toArray(new String[list.size()]);
        }
    }
}
