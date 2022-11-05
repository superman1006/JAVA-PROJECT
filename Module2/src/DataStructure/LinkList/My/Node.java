package DataStructure.LinkList.My;

public class Node {
    String val;
    Node next;
    Node pre;

    public Node(String val) {
        this(val,null,null);
    }
    public Node(String val, Node next, Node pre) {
        this.val = val;
        this.next = next;
        this.pre = pre;
    }
}
