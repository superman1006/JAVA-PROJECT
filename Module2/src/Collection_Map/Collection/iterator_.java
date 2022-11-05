package Collection_Map.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class iterator_ {
    //------------------------------------------------迭代器---------------------------------------------------
    public static void main(String[] args) {
        Collection<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("javaaaa");
        list1.add("12");
        list1.add("你好");

        //1，创建迭代器
        Iterator<String> it = list1.iterator();
        //迭代器指针刚开始时是指向第一个元素的
        while (it.hasNext()){//判断是否有下一个元素
            System.out.println(it.next());
        }

        System.out.println("-----------------------------------------------------");

        //2，增强for循环，也叫foreach
        for(String i : list1){
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------");

        //3，ArrayList的foreach(new Consumer)
        list1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-----------------------------------------------------");
        //可以简化成下面的格式
        list1.forEach(System.out::println);


        //只有Iterator迭代器可以一遍遍里一边删除元素，不会出现bug也不会出现漏删
        //除此之外普通的for循环从前往后删除可以删除，不会有bug，但是会漏删！但是从后往前不会漏删也不会有bug
        //所以最后有两种方法实现可以一边遍历一边删除：Iterator迭代器利用hasNext和next！ 和 普通for循环的从后往前删除！

    }
}
