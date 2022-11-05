package Test_knowledge;

//和141相似，双指针 HashMap

//给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
public class Leetcode_142 {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
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
        System.out.println(detectCycle(a));

    }
    //最重要的是 : 第一个相遇节点正向移动到入环节点的距离 == head节点到入环节点的距离
    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fastProinter = head;
        ListNode slowProinter = head;
        boolean loopExist = false;
        while(fastProinter.next != null && fastProinter.next.next != null){
            fastProinter = fastProinter.next.next;
            slowProinter = slowProinter.next;
            if(fastProinter == slowProinter){
                loopExist = true;
                break;
            }
        }
        if(loopExist){
            slowProinter = head;
            while(fastProinter != slowProinter){
                fastProinter = fastProinter.next;
                slowProinter = slowProinter.next;
            }
            return fastProinter;
        }
        return null;
    }
}
