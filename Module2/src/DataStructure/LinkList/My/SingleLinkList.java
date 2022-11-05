package DataStructure.LinkList.My;

public class SingleLinkList {
    Node head;

    public SingleLinkList(){
        this.head = null;
    }

    public SingleLinkList(String val){
        head = new Node(val);
    }

    public void append(String val){
        Node node = new Node(val);
        if (null == head){
            head = node;
        }else {
            Node cur = head;
            while(cur.next != null){
                cur= cur.next;
            }
            cur.next = node;
            node.pre = cur;
        }
    }

    public void prepend(String val){
        Node node = new Node(val);
        if (!is_empty()) {
            node.next = head;
            head.pre = node;
        }
        head = node;
    }

    public boolean is_empty(){
        return null == head;
    }

    public void remove(String val){//删除第一个值为val的节点
        Node cur = head;
        if(!cur.val.equals(val)){
            cur = cur.next;
            while(cur != null){
                if (cur.val.equals(val)){
                    cur.pre.next = cur.next;
                    cur.next.pre = cur.next;
                    cur.next = null;
                    cur.pre = null;
                    break;
                }else {
                    cur = cur.next;
                }
            }
        }else {
            head = head.next;
            cur.next = null;
        }
    }

    public void travelList(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.val+"\t");
            cur = cur.next;

        }
        System.out.println("\t");
    }

    public int size(){
        Node cur = head;
        int size = 0;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }
}
