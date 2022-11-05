package API.ArrayList_and_String.basic;

import java.util.ArrayList;

public class ArrayList_class {
    public static void main(String[] args) {
        //ArrayList就是一种集合,它里面的每一个元素都是一个对象，所以不使用数据类型int之类的，要写integer才行
        //集合的数据类型不固定，大小可变。适合做数据个数不确定并且需要增删元素的项目
        //                        add()
        {
            //创建对象
            ArrayList List = new ArrayList();//调用无参数构造器
            List.add("Java");
            List.add("Java");
            List.add("MySQL");
            List.add(1);
            List.add(2);
            List.add(3);
            System.out.println(List);//输出结果是内容而不是地址(通过继承优化过的)

            // [Java, Java, JMySQL, 1, 2, 3]
            List.add(1,"CL");//在索引1的位置插入“CL”元素
            System.out.println(List);//[Java, CL, Java, JMySQL, 1, 2, 3]
        }
        //                         泛型概述
        {
            // ArrayList<E>:其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型
            //ArrayList<String> List = new ArrayList<String>();
            ArrayList<String> List = new ArrayList<>();//后面的类型声明可以不用写
            List.add("a");
            List.add("b");
            List.add("c");

            ArrayList<Integer> List2 = new ArrayList<>();
            List.add("a");
            List.add("b");
            List.add("c");

            ArrayList<Object> List3 = new ArrayList<>();
            //Object可以存储全部类型
        }
        //                         常用API
        {
            ArrayList<String> List = new ArrayList<>();
            List.add("Aava");
            List.add("Aava");
            List.add("Aava");
            List.add("Bava");
            List.add("Cava");
            List.add("Dava");
            //获取某一个元素
            System.out.println(List.get(2));//Aava

            //获取集合的大小
            System.out.println(List.size());//6

            //删除某个索引位置的元素
            System.out.println(List.remove(1));//相当于Python的pop()，删除后会返回该值
            System.out.println(List.remove("Aava"));//删除 ！第一个！ 指定内容元素，若存在该元素则返回true,若不存在则返回false
            System.out.println(List.remove("Java"));//返回false

            // 修改某一个位置的元素内容
            String s = List.set(2,"Java");//将2索引位置修改为"Java"，并且返回被删除的元素值
            System.out.println(s);//Cava
            System.out.println(List);
        }
        //                         Test
        {
            // 将小于80的元素全部删除
            ArrayList<Integer> scores = new ArrayList<>();
            scores.add(99);
            scores.add(100);
            scores.add(67);
            scores.add(80);
            scores.add(82);
            System.out.println(scores);// [99, 100, 67, 80, 82]
            //如果从前往后remove那么会有bug，所以要养成习惯从后往前删除元素
            for (int i = scores.size()-1; i >= 0 ; i--) {
                if (scores.get(i) < 80){
                    scores.remove(i);
                }
            }
            System.out.println(scores);
        }
    }
}