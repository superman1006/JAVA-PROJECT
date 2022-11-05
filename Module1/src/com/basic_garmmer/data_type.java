package com.basic_garmmer;

public class data_type {
    public static void main(String[] args) {
        {
            System.out.print("a+\t+b+\t+c");
            System.out.println("hello world1");
            System.out.println("hello world2");
            System.out.println();// 不输入也会占据一行输出
            System.out.println("hello world3");
            // main: 调用 public static void main(String[] args)
            // sout: 调用 System.out.println();
            // ctrl+D: 复制当前行到下一行
            // ctrl+X: 删除所在行
            // ctrl+alt+L: 一键矫正代码格式
            // ctrl+shift+上(下)箭头: 移动当前行到上(下)行
            /*多行注释：ctrl+shift+/ 单行注释：ctrl+/
             */
        }


        {
            //输出单字符用单引号，输出字符串用双引号
            System.out.println('a');
            System.out.println("abcd");
            System.out.println(true);
            System.out.println(false);
        }

        {
            //  变量类型 int double
            int a = 1;
            double b = 2.50;
            int c;
            //在定义变量的时候可以没有初始值，但是在使用的时候必须赋值，否则会报错
            c = 3;
            System.out.println(a);
            System.out.println(b);
            a += 1;
            System.out.println(a);
            System.out.println(c);
            //只能在同一个大括号里访问局部变量a,b,c，不能在大括号外访问大括号内的变量
        }

        {
            //   数据类型
            /*
            整数：
                byte     1字节
                short    2字节
                int      4字节
                long     8字节
            浮点数：
                float    4字节
                double   8字节
            字符：
                char     2字节
            布尔：
                boolean  1字节
            */
            byte number = 100;
            System.out.println(number);

            short money = 100;
            System.out.println(money);

            int a = 10000000;
            System.out.println(a);

            long b = 1312345325;
            System.out.println(b);
            // 若long类型数据过大，超过int范围但没超过long类型范围，需要在其后加 L/l
            long c = 123124125151L;
            System.out.println(c);

            double d = 98.5;
            System.out.println(d);
            //随便写一个小数字面量默认是double类型，若想随便写一个小数就是float类型需要在变量值后加 F/f
            float e = 98.5F;
            System.out.println(e);

            //字符
            char f = 'a';
            System.out.println(f);

            //字符串
            String g = "abcd";
            System.out.println(g);
        }

        {
            //       关键字
            /*常见关键字：public，class,byte,short,int,long,double.....
            关键字不能用作变量名称，否自报错
            */
        }
    }
}
































