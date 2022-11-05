package Collection_Map.Map_;

import java.util.*;
import java.util.function.BiConsumer;

public class map {
    public static void main(String[] args) {
        // 哈希表是一种增删改查都效率很高的数据结构
        // 哈希表的组成：JDK1.8之前使用数组+链表组成。JDK1.8之后使用数组+链表+红黑树组成
        // 哈希表中每一个元素都有一个哈希值，它是由地址转换为的int值，可以理解为地址，但不是地址

        //  Map 用键值对组成，键不能相同，值可以相同
        //  包括 .put(key,value)
        //      .remove(key)
        //      .clear()
        //      .containsKey(key)
        //      .containsValue(value)
        //      .isEmpty()
        //      .size()
        //      .get(key)返回值
        //      map1.putAll(map2) 把map2加到map1中
        // HashMap (无序，不重复，无索引)可以使用maps.foreach(new Biconsumer)
        // HashTable
        // TreeMap (排序，不重复，无索引)
        // LinkedHashMap (有序，不重复，无索引)

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("chenlv",19);
        map.put("zyy",18);
        map.put(null,null);
        System.out.println(map);// {chenlv=18, zyy=18, null=null}

        Set<String> keys = map.keySet();//获取key，用Set类型存储，因为Set是无序的
        System.out.println(keys);

        Collection<Integer> values = map.values();
        System.out.println(values);

        
        //遍历map
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key+"==>"+value);
//            }
//        });

        map.forEach((key,value) -> System.out.println(key+"==>"+value));


        System.out.println("--------------------------------------------------------");
        Map<Student,String> studentMap = new HashMap<>();

        Student s1 = new Student("cl",19);
        Student s2 = new Student("zyy",18);
        studentMap.put(s1,"广州");
        studentMap.put(s2,"梅州");
        studentMap.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student.toString()+s);
            }
        });
    }
}
class Student{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }


    public Student( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}