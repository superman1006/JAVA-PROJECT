package Test_knowledge;

//递归  指针
/*
* 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
*/
public class Leetcode_83 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        new ListNode(a,b);
        new ListNode(b,c);
        // list1 = [1,2,4]

        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        new ListNode(d,e);
        new ListNode(e,f);
        // list2 = [1,3,4]
        System.out.println(deleteDuplicates1(a));
        System.out.println(deleteDuplicates2(d));
    }
    // 指针
    //时间复杂度0(n);空间复杂度O(1)
    public static ListNode deleteDuplicates1(ListNode head) {
        if(null == head) return head;
        ListNode cur = head;
        while(null != cur.next){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
    //递归 :递归的本质是数据的压栈与出栈，所以空间复杂度会较高
    //时间复杂度0(n);空间复杂度较大
    public static ListNode deleteDuplicates2(ListNode head) {
        if (null == head.next || null == head) return head;
        head.next = deleteDuplicates2(head.next);
        return head.val == head.next.val ? head.next:head;
    }
}
