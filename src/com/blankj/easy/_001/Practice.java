package com.blankj.easy._001;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            //            [0 , 15] [1, 10] [2, 6] [3, 2]
            int num = nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Practice solution = new Practice();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 17;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
