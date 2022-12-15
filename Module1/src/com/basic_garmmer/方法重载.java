package com.basic_garmmer;

public class 方法重载 {
    public static void main(String[] args) {
        //                 方法重载
        //可以创建多的相同名称的方法(区分大小写)
        //但是每个方法所接收的形参列表不能相同
        //若相同，计算机无法决策使用那个一个方法
        //计算机会根据调用方法时输入的形参列表的 数据类型 和 数量决定使用什么方法
        Fire();
        System.out.println("-----------------------------------");
        Fire("American");
        System.out.println("-----------------------------------");
        Fire(6);
        System.out.println("-----------------------------------");
        Fire("American",10);
    }
    public static void Fire(){
        System.out.println("Fire");
    }
    public static void Fire(String country){
        System.out.println("Fire to "+ country);
    }
    public static void Fire(int times ){
        System.out.println("Fire "+ times + " times");
    }
    public static void Fire(String country ,int times){
        System.out.println("Fire " + times +" times to "+ country);

    }
}
