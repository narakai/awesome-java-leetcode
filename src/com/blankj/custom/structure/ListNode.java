package com.blankj.custom.structure;

/**
 * Created by laileon on 2017/7/19.
 */
//链表 插入删除o(1)
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = null;
    }

    //单向链表, 从前往后反转各个结点的指针域的指向
    //非递归实现很简单，只需要遍历一遍链表，在遍历过程中，把遍历的节点依次插入到头部
    public ListNode reverseList(ListNode head) {
        ListNode curr = null;
        while (head != null) { //如果当前节点不为空
            curr = head; //prev后移一位
            head = head.next;
            head.next = curr; //head指向head后面那个
//            ListNode tmp = head.next; //tmp赋值为head后面的节点
//            head = tmp; //head后移一位
        }
        return curr;
    }

}
