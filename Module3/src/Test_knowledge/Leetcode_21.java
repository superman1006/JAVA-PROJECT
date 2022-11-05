package Test_knowledge;

// 方法一 :双指针+循环(迭代)
// 方法二 :递归

/*
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
* */


public class Leetcode_21 {
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

        System.out.println(mergeTwoLists1(a, d));
        System.out.println(mergeTwoLists2(a, d));
    }
    // 方法一 :双指针+循环(迭代)
    // 时间复杂度: O(n + m);
    // 空间复杂度: O(1);
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode resultNode = new ListNode(0);//将0存入第一个节点resultNode
        ListNode p = resultNode;//命令一个 p节点 在整个链表中可以移动，p的初始位置是在头节点resultNode
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 != null){
            p.next = list1;
        }
        if(list2 != null){
            p.next = list2;
        }
        return resultNode.next;
    }
    // 方法二 :递归
    // 时间复杂度: O(n + m);
    // 空间复杂度: O(n + m);
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if (list1.val < list2.val){
            list1.next = mergeTwoLists2(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists2(list1,list2.next);
            return list2;
        }
    }
}
