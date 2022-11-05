package DataStructure.LinkList.My;

public class Test {
    public static void main(String[] args) {
        SingleLinkList s1 = new SingleLinkList("3");
        s1.append("4");
        s1.append("5");
        s1.append("4");
        s1.append("3");
        s1.prepend("111");
        s1.travelList();
        s1.remove("111");
        s1.travelList();
        s1.remove("4");
        s1.travelList();
        System.out.println("size is "+ s1.size());
        System.out.println(s1.head.next.next.pre.val);

        SingleLinkList s2 = new SingleLinkList();
        s2.append("1");
        System.out.println(s2.head);
    }
}
