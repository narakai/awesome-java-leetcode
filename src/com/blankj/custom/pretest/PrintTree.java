package com.blankj.custom.pretest;

import com.blankj.custom.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(0, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node1R = new TreeNode(1, null, null);
        TreeNode node1L = new TreeNode(1, node0, node7);
        TreeNode node3 = new TreeNode(3, node9, node1R);
        TreeNode node2 = new TreeNode(2, node1L, node3);
        printTree(node2);
    }

    public static void printTree(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();

//        需要额外两个变量。一个变量用来保存当前层 还未打印的结点个数，另一个变量保存下一层待打印的结点个数
        int current;//当前层 还未打印的结点个数
        int next;//下一层结点个数
        StringBuilder nodeVal = new StringBuilder();

        queue.offer(root);
        current = 1;
        next = 0;
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            nodeVal.append("(").append(currentNode.val).append(")").append(",");
            current--;

            if (currentNode.left != null) {
                //queue加入节点
                queue.offer(currentNode.left);
                next++;
            }
            if (currentNode.right != null) {
                //queue加入节点
                queue.offer(currentNode.right);
                next++;
            }
            if (current == 0) {
                current = next;
                next = 0;
                System.out.println(nodeVal.toString().substring(0, nodeVal.lastIndexOf(",")));
                nodeVal = new StringBuilder();
            }
        }
    }
}
