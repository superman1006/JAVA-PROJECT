package Test_knowledge;

// HashMap 双指针（让两个指针走一样长度）

/*给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null*/

public class Leetcode_160 {
    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(4);
        ListNode E = new ListNode(5);

        new ListNode(A,B);
        new ListNode(B,C);
        new ListNode(C,D);
        new ListNode(E,C);

        /*
           A-->B-->C-->D
                   ^
                   E
        */
        System.out.println(getIntersectionNode1(A,E));
        System.out.println(getIntersectionNode2(A,E));

    }
    // 由于两个链表长度可能不不一样，最好的办法就是让A指针走一遍A再开始走B，同样B指针走一遍B再开始走A，这时这样就，而以保证同时走完，也可以比较同一个位置有没有交叉
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA == null|| headB == null) return null;
        ListNode A = headA;
        ListNode B = headB;
        while(A != B){
            if(A == null){
                A = headB;
            }else if(B == null){
                B = headA;
            }else{
                A = A.next;
                B = B.next;
            }
        }
        return A;
    }
    // 先找出两个链表的长度，算出差值d，让长的链表移动d，然后在一起遍历
    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;
        int d = 0;
        ListNode A = headA;
        ListNode B = headB;
        while(A != null){
            l1++;
            A = A.next;
        }
        while(B != null){
            l2++;
            B = B.next;
        }
        A = headA;
        B = headB;
        if(l1 >= l2){
            d = l1-l2;
            for(int i = 0;i < d;i++){
                A = A.next;
            }
        }else{
            d = l2-l1;
            for(int i = 0;i < d;i++){
                B = B.next;
            }
        }
        while(A != null && B != null){
            if(A == B){
                return A;
            }
            A = A.next;
            B = B.next;
        }
        return null;
    }
}
