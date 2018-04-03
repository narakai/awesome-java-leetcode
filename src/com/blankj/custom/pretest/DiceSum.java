package com.blankj.custom.pretest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DiceSum {

    public static void main(String[] args) {
        int[] candidates = {1, 2, 3, 4, 5, 6};
        int target = 610;
        System.out.println(combination(candidates, target).size());
    }

    public static List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> tmp = new LinkedList<Integer>();
        // 先将数组排序避免重复搜素
        Arrays.sort(candidates);
        helper(res, candidates, target, 0, tmp);
        return res;
    }

    private static void helper(List<List<Integer>> res, int[] candidates, int target, int index, List<Integer> tmp) {
        // 如果当前和已经大于目标，说明该路径错误
        if (target < 0) {
            return;
            // 如果当前和等于目标，说明这是一条正确路径，记录该路径
        } else if (target == 0) {
            List<Integer> oneComb = new LinkedList<Integer>(tmp);
            res.add(oneComb);
            // 否则，对剩余所有可能性进行深度优先搜索
        } else {
            // 选取之后的每个数字都是一种可能性
            for (int i = index; i < candidates.length; i++) {
                // 典型的先加入元素，再进行搜索，递归回来再移出元素的DFS解法
                if (i > 0 && candidates[i] == candidates[i - 1])
                    continue;
                tmp.add(candidates[i]);
                helper(res, candidates, target - candidates[i], i, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
