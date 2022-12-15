package com.basic_garmmer;

//                   理解JAVA的方法参数传递机制
public class 方法注意事项 {
    public static void main(String[] args) {
        int a = 20;
        change1(a);
        System.out.println(a);//20
        //这属于基本类型的参数传递机制
        //对于int a = 20;传递给change1(a)时传递的是数值20，而不是地址;

        System.out.println("-----------------------------------------------");

        int[] arr = new int[]{1,2,3,4,5,6};
        change2(arr);
        System.out.println(arr[2]);//200
        //这属于引用类型的参数传递机制
        //对于int[] arr,传递给change2(int arr)的是int arr的内存地址,而不是单单一个数组内容
        //因此使用change2(int arr)时改变了该内存地址的数组中的元素值
    }


    public static void change1(int a){
        System.out.println(a);//20
        a = 100;
        System.out.println(a);//100
    }
    public static void change2(int[] arr){
        System.out.println(arr[2]);//2
        arr[2] = 200;
        System.out.println(arr[2]);//200
    }
}
