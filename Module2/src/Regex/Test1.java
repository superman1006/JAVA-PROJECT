package Regex;

public class Test1 {
    public static void main(String[] args) {

        System.out.println(checkQQ1("123124352235"));
        System.out.println(checkQQ1("12312435223523423523523"));
        System.out.println(checkQQ1("1231243asd2235"));
        System.out.println(checkQQ1("123"));
        System.out.println("-------------------------------------------------");

        //正则表达式
        System.out.println(checkQQ2("123124352235"));
        System.out.println(checkQQ2("12312435223523423523523"));
        System.out.println(checkQQ2("1231243asd2235"));
        System.out.println(checkQQ2("123"));
        System.out.println("-------------------------------------------------");


        System.out.println("a".matches("\\d"));//判断一个字符，判断是不是一个整数false
        System.out.println("a".matches("[abc]"));//判断一个字符，判断是不是a,b,c中的其中一个true
        System.out.println("ab".matches("[abc]"));//判断一个字符，判断是不是a,b,c中的其中一个false
        System.out.println("c".matches("[^abc]]"));//判断一个字符，判断是不是除了a,b,c以外的整数false
        System.out.println("a".matches("\\w"));//判断一个字符，判断是不是英文数字字母下划线true
        System.out.println("2".matches("\\w"));//判断一个字符，判断是不是英文数字字母下划线ture
        System.out.println("c".matches("\\w"));//判断一个字符，判断是不是英文数字字母下划线true
        System.out.println("ac".matches("\\W"));//判断一个字符，判断是不是 不是一个整数false
        System.out.println("你好".matches("\\W"));//判断一个字符，判断是不是 不是一个整数false
        System.out.println("abcd".matches("[a-zA-Z0-9]{4}"));//判断一个字符，要有英文字母数字
        System.out.println("abc_d".matches("[\\w]{4}"));//判断一个字符,要有英文字母数字下划线，长度为4
        System.out.println("abc_d".matches("[\\w && [^_]]{4}"));//判断一个字符,要有英文字母数字下划线,再除去下划线
        System.out.println("-------------------------------------------------");


        //判断手机号是否正确
        String a = "13620413695";
        String b = "11120413695";
        String c = "136204136aa";
        System.out.println(a.matches("1[3-9]\\d{8,9}"));//若{}和前面没有空格，代表{}中的内容是匹配最后的(\\d)的内容
        System.out.println(a.matches("1[3-9]\\d {8,9}"));//若{}前面有空格，代表{}的内容匹配所有的字符
        System.out.println(b.matches("1[3-9]\\d{9}"));
        System.out.println(c.matches("1[3-9]\\d{9}"));
        String x = ".";
        System.out.println(x.matches("\\."));
    }




    public static boolean checkQQ1(String qq){
        if (qq == null || qq.length()<6 || qq.length()>20){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch<'0'|| ch>'9')
                return false;
        }
        return true;
    }
    public static boolean checkQQ2(String qq){
        return qq!=null && qq.matches("\\d{6,20}");//   "\d"代表判断是否为一个整数，后面的{}中的数字代表长度的范围要求
    }
}
