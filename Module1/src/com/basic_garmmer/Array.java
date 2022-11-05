package com.basic_garmmer;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //完整格式:数据类型[]数组名 = new 数据类型[]{元素1，元素2，元素3，元素4}
        //简化格式:数据类型[]数组名 = {元素1，元素2，元素3，元素4}
        {
            //               静态初始化数组:
            double [] arr = new double[]{99.5, 85.0, 69.5};
            int [] ages = {34 , 23, 18};
            // int ages [] = {34 , 23, 18};也是对的，但是不常用

            String [] names = {"Jack", "Rose", "Lisa"};
            System.out.println(arr);
            System.out.println(ages);
            System.out.println(names);
            //上面三个输出的结果不是数组本身，而是三个数组的内存地址

            System.out.println(arr[0]);
            System.out.println(ages[1]);
            System.out.println(names[2]);
            System.out.println(arr.length);
            //输出三个索引所对应的元素以及arr的长度

            arr[0] = 99.0;
            ages[1] = 22;
            names[2] = "ZYY";
            System.out.println("----------------------------------------------------------");;
            System.out.println(arr[0]);
            System.out.println(ages[1]);
            System.out.println(names[2]);
            //同时也可以改变一个数组中的任何一个元素

        }

        {
            //               动态初始化数组:
            int [] arr = new int [3];
            //创建了一个数组长度为3的int类型数组·
            arr[0] = 4;
            System.out.println(arr[0]);
            //可以在创建后再赋值
            //静态初始化和动态初始化不能混淆使用
            //在创建动态数组时，默认值为
            //byte,short,char,int,long 为0
            //float,double             为0.0
            //boolean                  为false
            //类 数组 接口，String       为null

            //   遍历
            int [] ages = {34 , 23, 18};
            for (int i = 0; i < ages.length; i++) {
                System.out.println(ages[i]);
            }
        }

        {
            //                    输出数组1
            int[] arr = {1,2,3,4,5,6,7,8,9,10};

            System.out.print("[");
            for (int i = 0;i < arr.length;i++){
                if (i == arr.length-1){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(arr[i]+", ");
                }
            }
            System.out.println("]");


            //                    输出数组2
            System.out.print("[");
            for (int i = 0; i < arr.length;i++){
                System.out.print(i != arr.length-1 ? arr[i]+", ": arr[i]);
            }
            System.out.print("]");
            System.out.println();
        }

        {
            System.out.println("--------------------------Test4---------------------------");
            //Test4
            //目的:键盘录入一组工号，最后要随机数出一组作为排名
            //1,动态初始化一个数组，储存5个工号
            int[] codes = new int[5];

            //2,定义一个循环，循环5次，依次录入一个工号存入对应的位置
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < codes.length; i++) {
                System.out.println("the number of "+(i+1)+" members:");
                int code = sc.nextInt();
                codes[i] = code;
            }
            //3,遍历数组中的每一个元素，然后随机一个索引出来，让该元素与对应索引的元素进行交换位置
            Random r = new Random();
            for (int i = 0; i < codes.length; i++) {
                int index = r.nextInt(codes.length);//0--4
                int temp = codes[index];
                //为了方便交换数值，定义一个temp储存index中的数据
                codes[index] = codes[i];
                codes[i] = temp;
            }
            //4,遍历打乱后的数组元素
            for (int j = 0; j < codes.length; j++) {
                System.out.print(codes[j]+"\t");
            }
            System.out.println();
        }

        {
            System.out.println("--------------------------Test5---------------------------");
            //Test5
            //冒泡排序
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter how many number do you want to compare:");
            int t = sc.nextInt();
            int [] arr = new int[t];
            for (int i = 0; i < t ; i++) {
                System.out.println("The " + (i+1) + " number is :");
                int data = sc.nextInt();
                arr[i] = data;
            }
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("The result from smallest to largest are as follow:\t");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
