package API.ArrayList_and_String.basic;

import java.util.Scanner;

public class String_class {
    public static void main(String[] args) {
        {
            //String类为不可变字符串类型,它的对象再创建后不可被更改
            String name = "ab";
            name += "cd";
            name += "ef";
            System.out.println(name);
            // 但是发现输出的结果将"abcdef"加在了一起
            // 其实是因为:在堆内存中有一个 字符串常量池 用于储存 ab cd ef，这三个对象都一直存在,
            // 但是用+=将它们加在一起组成了一个新的对象"abcdef"，此时在栈内存的String name修改了指针方向，将指针指向了新的对象

            // 常见常见字符串对象的方法
            //           1
            String name1 = "abcd";
            System.out.println(name1);

            //           2
            char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
            String name2 = new String(chars);
            System.out.println(name2);

            //           3
            byte[] bytes = {97, 98, 99, 65, 66, 67};//  abcABC
            String name3 = new String(bytes);
            System.out.println(name3);


            //                              ！！！注意！！！
            //用""给出的字符串对象，在字符串常量池中放着，而且相同的内容只会存储 一份！！
            //而用new String 创建的字符串对象时，每new一次都会创建一个新的对象，尽管他们内容相同
            String s1 = "abc";
            String s2 = "abc";
            System.out.println(s1 == s2);  //true

            String s3 = new String("def");
            String s4 = new String("def");
            System.out.println(s3 == s4);  //false

            String s5 = new String("ghj");//创建了两个对象，""创建了一个对象放在字符串常量池中，通过new也创建了一个对象放在堆内存中
            String s6 = "ghj";
            System.out.println(s5 == s6);//false

            String s7 = "123";
            String s8 = "12";
            String s9 = s8 + "3";
            System.out.println(s7 == s9);
            // 字符串常量池中创建了123，12，3三个对象;凡是通过加减修改过的都要创建一个新对象在堆内存中，所以s7指向常量池中的abc，而s9指向堆内存的abc

            // 需要注意的一个小的！不同！是:
            String s10 = "abcd";
            String s11 = "a";
            String s12 = "a" + "b" + "c" + "d";
            System.out.println(s10 == s12);
            // s11中其实没有创建a，b，c，d四个对象。由于java存在编译优化机制，如果相加的全是字符串(即使其中的某个字符串已经在常量池中)，那么java会默认将"a"+"b"+"c"+"d"直接合并成"abcd"
        }

        //                                常用API
        {
            // 扫描器获取的字符串是放在堆内存中，而==只能比较 内存地址 是否相同，不能直接比较两个字符串内容是否相等
            // 使用a.equals(b)来比较a和b的内容是否相同
            // 使用a.equalsIgnoreCase(b)来比较a和b的内容是否相同, 不考虑大小写
            String okName = "chenlv";
            String okPassword = "123456";
            Scanner sc = new Scanner(System.in);
            System.out.println("Name:");
            String Name = sc.next();
            System.out.println("Password:");
            String Password = sc.next();
            if (okName.equals(Name) && okPassword.equalsIgnoreCase(Password)) {
                System.out.println("Pass");
            } else {
                System.out.println("Failure");
            }

            String name = "CL_ZYY";
            System.out.println(name.length());

            System.out.println(name.charAt(3));// 索引

            char[] chars = name.toCharArray();//将字符串转为字符数组
            System.out.println(chars);

            System.out.println(name.substring(1,4));//截取字符串，输入索引，包前不包后，输出1，2，3
            System.out.println(name.substring(4));//从4截取到末尾

            System.out.println(name.replace("Y","y"));//将大写Y替换成小写y

            System.out.println(name.contains("C"));//判断字符串中是否包含C元素

            System.out.println(name.startsWith("C"));//判断字符串是否以C开头

            String name2 = "a,b,c,d,e,f";
            String[] names = name2.split(",");//将name2以“,”分隔开，再装入数组
            for (int i = 0; i < names.length; i++) {
                System.out.print(names[i]);
            }

        }
    }
}
