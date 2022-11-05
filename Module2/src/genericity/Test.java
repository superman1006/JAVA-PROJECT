package genericity;

import java.util.Arrays;

public class Test {
    /**
     * T：任意类型 type
     * E：集合中元素的类型 element
     * K：key-value形式 key
     * V： key-value形式 value
     **/
    public static void main(String[] args) {
        // 通常使用ETKV
        // ? 在使用泛型的使用代表一切类型
        // 注意，定义class a; class b;ab都extends c，
        // 但是ArrayList<a>,ArrayList<b>,ArrayList<c>三者是没有任何关系的，不存在继承关系！！
        // 如果需要传入不同类的参数进行比较就像同样是汽车，但是汽车下面有不同类，比较性能的时候是比较所有牌子的车，所以需要用?来表示入参时的类型
        // 但是不能允许其他的类就像Dog作为入参，所以会有上下限，
        // 上限表示为:<? extends 父类>，规定了只能入参 父类或其子类类型的对象
        // 下限表示为:<? super 子类>， 规定了只能入参 子类或其父类类型的对象


        //--------------------------------------泛型------------------------------------------
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.remove(3);
        //1，在你创建的类中加上<E>后，你下面的方法的入参要求可以写(E e)
        //2，当你在外界调用创建一个它的对象并且添加泛型时，对象的其他方法都只能用你创建的泛型类型的参数入参

        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.remove("3");


        Integer []arr = {1,2,3,4,5,6,7,8,9,10};
        printArrayList(arr);


    }
    public static <T> void printArrayList(T[] arr){
        StringBuilder sb = new StringBuilder("[");
        if (arr == null){
            sb.append(Arrays.toString(arr));
        }else {
            for(int i = 0; i <arr.length;i++){
                if (i == arr.length-1){
                    sb.append(arr[i]);
                }else {
                    sb.append(arr[i]).append(",");
                }
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
