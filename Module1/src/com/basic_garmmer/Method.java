package com.basic_garmmer;

public class Method {
    public static void main(String[] args) {
        // 标准格式:
        // 方法修饰符  返回值类型  方法名称  （形参列表）{
        // 方法的执行代码
        // 返回值
        // }

        //方法的修饰符：暂时都统一用public static修饰
        //方法的返回值类型必须填写，若无返回值方法则是void(无返回值)
        //可以有多个形参也可以没有
        //方法和方法之间是并列关系
        //不能在方法中定义方法，但是可以在方法中调用别的方法
        System.out.println(sum(10,20));
        int[] temp = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Find_max(temp));

    }
    //求和
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
    public static int Find_max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
