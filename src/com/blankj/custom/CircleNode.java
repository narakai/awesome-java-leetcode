package com.blankj.custom;


import com.blankj.custom.structure.ListNode;

public class CircleNode {

    //判断是否有环
    public static boolean isLoop(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //如果无环，则fast先走到终点
        //当链表长度为奇数时，fast->Next为空
        //当链表长度为偶数时，fast为空

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //如果有环，则fast会超过slow一圈
            if (fast == slow) {
                break;
            }
        }

        return fast != null && fast.next != null;
    }

    //计算环的长度
    public static int loopLength(ListNode head) {
        if (isLoop(head)) return 0;
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        boolean begin = false;
        boolean again = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            //超两圈后停止计数，挑出循环
            if (fast == slow && again) {
                break;
            }

            //超一圈后开始计数
            if (fast == slow) {
                begin = true;
                again = true;
            }

            //计数
            if (begin)
                ++length;

        }
        return length;
    }

    //求出环的入口点
    ListNode findLoopEntrance(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //如果有环，则fast会超过slow一圈
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) return null;
        slow = head;
//            碰撞点p到连接点的距离=头指针到连接点的距离，因此，分别从碰撞点、头指针开始走，相遇的那个点就是连接点
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //    4.如何判断两个链表（不带环）是否相交？将其中的一个链表首尾相连，然后判断另一个链表是否带环即可。
    boolean checkCross(ListNode listNode1, ListNode listNode2) {
        ListNode listNode = listNode1;
        while (listNode1.next != null) {
            listNode = listNode.next;
        }
        listNode.next = listNode1;
        return isLoop(listNode2);
    }
}
