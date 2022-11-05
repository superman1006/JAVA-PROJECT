package com.basic_garmmer;// 后面用到了Scanner扫描器和Random随机数，所以要在前面导包
import java.util.Random;
import java.util.Scanner;

public class for_and_while_cycle {
    public static void main(String[] args) {
        // Difference:知道要循环几次就用 for ; 不知道就用 while ;
        //                   for_cycle
        {
            for (int i = 0;i < 3; i++){
                System.out.println("hello world");
            }

            System.out.println("-----------------------");
            for (int i = 1;i <= 5; i+=2){
                System.out.println("hello world");
            }

            System.out.println("-----------------------");
            //  求和1-2-3-4-5
            int sum1 = 0;
            // fori
            for (int i = 1; i < 5; i++) {
                sum1 += i;
            }
            System.out.println(sum1);

            //求和1到10的奇数
            System.out.println("-----------------------");
            int sum2 = 0;
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 1){
                    sum2 += i;
                }
            }
            System.out.println(sum2);

        }
        //                   while_cycle
        {
            System.out.println("-----------------------");
            int i = 0;
            while (i<3){
                System.out.println("hello world");
                i++;
            }

            int peak_height = 8848860;
            double a = 0.1;
            int times = 0;
            while (a < peak_height){
                a += a;
                times += 1;
            }
            System.out.println(times + "\ttimes");
            System.out.println(a + "mm\theight");
        }
        //                     do_while
        {
            System.out.println("-----------------------");
            int i =0;
            do {
                System.out.println("hello_world");
                i++;
            }while(i<3);
        }
        //                 死循环
        {
//            for( ; ;){
//                System.out.println("hello world");
//            }
        }
        {
//            while (true){
//                System.out.println("hello_world");
//            }
        }

        {
            int okpasswords = 520;
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("please enter your password:");
                int password = sc.nextInt();
                if (password == okpasswords){
                    System.out.println("ok!");
                    break;
                }else {
                    System.out.println("");
                }
            }
            for (int i = 1; i < 5; i++) {
                if (i==3){
                    continue;//跳出当前循环,进入下一次循环
                }
            }
        }
        //                      Random
        //1, import java.util.Random;
        //2,创建随机数Random对象 r
        //3,对对象 r 调用 r.nextInt();方法
        //4,r.nextInt(10) 代表再0到9之间随机
        {
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                int data = r.nextInt(10) + 10;
                System.out.println(data);
            }
        }

    }
}
