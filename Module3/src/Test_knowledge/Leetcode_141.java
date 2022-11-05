package Test_knowledge;
//Floyd  HashMap

/*
给你一个链表的头节点 head ，判断链表中是否有环。、
* */

//注意一个关键的容易忽略的问题:判断的应该是节点，而不是节点的值，因为可能存在前后两个不同的节点但是他们的val相同
public class Leetcode_141 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        new ListNode(a,b);
        new ListNode(b,c);
        new ListNode(c,d);
        new ListNode(d,e);
        new ListNode(e,b);
        /*

            e <-d
            v   ^
        a-> b-> c

        */
        System.out.println(hasCycle(a));

    }
    // 可以使用HashMap:时间复杂度：O(n);空间复杂度：O(n)(最坏的情况下是需要全部节点都遍历一遍)
    // Floyd(弗洛伊德) 判圈算法！！ (使用快慢指针)
    public static boolean hasCycle(ListNode head) {
        if(null == head) return false;
        ListNode fastPointer = head;// 创建快指针
        ListNode slowPointer = head;// 创建慢指针
        while(fastPointer.next != null && fastPointer.next.next != null){
            fastPointer = fastPointer.next.next;//快指针每次走两步
            slowPointer = slowPointer.next;//慢指针每次走一步
            if(fastPointer == slowPointer){
                return true;
            }
        }
        return false;
    }
}
