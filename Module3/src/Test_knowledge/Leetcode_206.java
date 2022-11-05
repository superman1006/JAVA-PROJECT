package Test_knowledge;
// 指针

// 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
public class Leetcode_206 {
    public static void main(String[] args) {
        ListNode a =new ListNode(2);
        ListNode b =new ListNode(3);
        ListNode c =new ListNode(4);
        ListNode d =new ListNode(5);
        ListNode e =new ListNode(6);
        new ListNode(a,b);
        new ListNode(b,c);
        new ListNode(c,d);
        new ListNode(d,e);
//      2-->3-->4-->5-->6
        System.out.println(reverseList1(a));
        System.out.println(reverseList2(a));
//        System.out.println(reverseList3(a));

    }
    // 指针 时间复杂度O(n) 空间复杂度O(1)
    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = temp;
            temp = cur;
            cur = next;
        }
        return temp;
    }
    // 递归 时间复杂度O(n) 空间复杂度O(n)
    // 需要注意的是 head 的下一个节点必须指向 null。如果忽略了这一点，链表中可能会产生环。(如果没有写指向null，当 5-->4 时， 4也-->5，这就形成了环形列表)
    public static ListNode reverseList2(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode reveseHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return reveseHead;
    }
//    public static ListNode reverseList3(ListNode node1){//接收第一个实际节点即 2-->3-->4-->5-->6  的 2
//        ListNode head = null;
////        head.next = node1;
//        head.next = null;
//        ListNode cur = node1;
//        while (cur != null){
//            ListNode Next = cur.next ;
//            cur.next = head.next;
//            head.next  = cur;
//            cur = Next;
//        }
//        return head;
//    }
}





