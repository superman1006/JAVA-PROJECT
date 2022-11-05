package Test_knowledge;

public class ListNode {
        int val;
        ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public ListNode(ListNode a,ListNode b){
        a.next = b;
    }
}
