package Collection_Map.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class basic {
    // Collection包含List接口和Set接口
    // List接口包含 ArrayList实现类 和LinkedList实现类
    // Set接口 包含 HashSet(无序，不重复，无索引，数组，链表，红黑树)实现类(包含Linked实现类) 和
    //            TreeSet(有序，不重复，无索引，红黑树（无法排序自定义的类，只有Integer那种才可以排序）)实现类，
    //                  如果要进行比较自定义的类，需要你的自定义的类implements Comparable 并且重写compareTo方法（大于0升序）
    //                  如果集合(compareTo)和你的自定义的类(new comparator<>)又有比较规则，那么优先使用集合的,
    //                  推荐只使用集合自带的，这样可以用lambda自定义，况且才一行代码

    public static void main(String[] args) {
        // 有序，可重复，有索引
        Collection list1 = new ArrayList<>();
        list1.add("java");
        list1.add("java");
        list1.add("12");
        list1.add(123);
        list1.add(false);
        list1.remove(123);//如果有相同的，默认删除前面一个元素；会return是否remove成功
        list1.contains(123);

        System.out.println(list1);
        list1.clear();//清空元素
        list1.isEmpty();//判断是否为空
        // a1集合中添加a2集合的元素用a1.addAll(a2)


        // 无序，不重复，无索引
        Collection list2 = new HashSet<>();
        list2.add("java");
        list2.add("java");
        list2.add("12");
        list2.add(123);
        list2.add(false);
        list2.remove(123);//如果有相同的，默认删除前面一个元素；会return是否remove成功
        list2.contains(123);
        System.out.println(list2);

    }
}
