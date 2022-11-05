package Test_knowledge;
// 快慢指针

//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false。

public class Leetcode_234 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        new ListNode(a,b);
        new ListNode(b,c);
        new ListNode(c,d);
        System.out.println(isPalindrome(a));

    }
    // 快慢指针
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            // 链表长度为奇数
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        // 现在开始都走一步
        while(slow != null){
            if(fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    // 反转链表方法（用于上面的isPalindrome方法）
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode temp = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = temp;
            temp = cur;
            cur = next;
        }
        return temp;
    }
}
