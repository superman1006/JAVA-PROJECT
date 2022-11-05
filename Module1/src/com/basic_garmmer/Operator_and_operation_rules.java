package com.basic_garmmer;

public class Operator_and_operation_rules {
    public static void main(String[] args) {
        {
            System.out.println("------------------1----------------------");
            int a = 20;
            //byte b = a;报错，因为不能将数据类型范围大的变量赋值给数据类型范围小的变量
            byte d = (byte)a;
            System.out.println(d);
            //但是可以如上,先将c通过(byte)c转变为byte类型在赋值给b
            double e = 99.4;
            double f = 99.5;
            double g = 99.6;
            int ei = (int)e;
            int fi = (int)f;
            int gi = (int)g;
            System.out.println(ei);//99
            System.out.println(fi);//99
            System.out.println(gi);//99
            //将double类型转换为int类型会将小数点后面的数抹去，得到比它小的最大整数。

        }

        {
            System.out.println("-------------------2---------------------");
            double a = 10;
            int b = 3;
            System.out.println(a+b);//13
            System.out.println(a-b);//7
            System.out.println(a*b);//30
            System.out.println(a/b);//3
            /*
            int类型除以int类型的结果任为int类型的数据
            若两个数之间1存在一个double类型的数据则结果也为double类型
            只有全部为int类型结果才是int类型
            */
            System.out.println(3/2);    //1.0
            System.out.println(3*1.0/2);//1.5
            System.out.println(3/2*1.0);//1.0
        }

        {
            System.out.println("-------------------3---------------------");
            //              数据拆分
            //需要拆分一个三位数，把个位，十位，百位分别输出
            int data = 123;
            // 个位
            int a = data % 10;// % 取余数  / 取整数
            System.out.println(a);
            // 十位
            int b = data /10 % 10;
            System.out.println(b);
            // 百位
            int c = data /100;
            System.out.println(c);
        }

        {
            int i = 10;
            int j = ++i;//代表先将i+1后，再赋值给j。注意此时的i已经是2了。
            System.out.println(i);//11
            System.out.println(j);//11

            int m = 10;
            int n = m++;//代表先将m的值赋值给n，再将 m+1
            System.out.println(m);//11
            System.out.println(n);//10

            System.out.println("--------------------4--------------------");
            int k = 3;
            int p = 5;
            //   一步一步操作，将操作后的结果写在每一个对应变量的后面
            //k  3 4 5 4
            //p  5 4 3 4
            //rs  3 + 5 - 4 + 4 - 5 + 4 + 2
            int rs  = k++ + ++k - --p + p-- - k-- + ++p + 2;
            System.out.println(k);//4
            System.out.println(p);//4
            System.out.println(rs);//9
        }

        {
            System.out.println("--------------------5--------------------");
            double size = 9.8;
            double money = 6;
            //         &:与    &&:双与    |:或    ||:双或   ^:异或(不同时结果为true)
            //   字符优先级: () > & > | > && > || > !
            System.out.println(size > 9 & money >= 8);
            System.out.println(size > 9 | money >= 8);
            System.out.println(!true);
            System.out.println(!false);
            System.out.println(true^false);//true
            System.out.println(false^true);//true
            System.out.println(true^true);//false
            System.out.println(false^false);//false
            System.out.println(size > 9 && money++ >= 8);//  && 代表如果左边为false, 则不会执行右边
            System.out.println(size > 9 || ++money >= 8);//  || 代表如果左边为true, 则不会执行右边

        }

        {
            System.out.println("--------------------6--------------------");
            double score = 59;
            String rs = score >= 60 ? "pass":"fall";
            //  接收变量 = 判断语句 ? true的返回结果 : false的返回结果
            System.out.println(rs);

            int a = 60;
            int b = 14646115;
            int c = 100000;
            int max_number = a >= b ? (a >= c ? a : c) : (b >= c ? b : c);
            System.out.println(max_number);
        }

    }
}