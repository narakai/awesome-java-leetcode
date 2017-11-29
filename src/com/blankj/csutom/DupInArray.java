package com.blankj.csutom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DupInArray {
    public static void main(String[] args) {
        String[] array = new String[]{"a","a","b","a","c","c"};
        System.out.println(Arrays.toString(getDupElement(array).toArray()));
    }

    public static List<String> getDupElement(String[] array) {
        HashSet hashSet = new HashSet();
        List<String> dupList = new ArrayList<>();
        for (String name : array) {
            if (!hashSet.add(name)) {
                if(!dupList.contains(name)) dupList.add(name);
            }
        }
        return dupList;
    }
}
