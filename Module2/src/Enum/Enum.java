package Enum;

public class Enum {
    /**
        * 枚举类
        *标志是用enum定义的类
        * 第一行必须罗列枚举类的对象名称，尽量全部大写
        * 入参严谨，代码可读性高
    * */
    public static void main(String[] args) {
        a(Season.SPRING);
        a(Season.SUMMER);
        // 再外面调用只能用枚举类.名称入参
        // 但是在switch里面不用，是因为switch可以兼容枚举类，它可以自己判断
    }
    public static void a(Season s){
        switch (s){
            case SPRING:
                System.out.println("SPRING");
            case SUMMER:
                System.out.println("SUMMER");
            case AUTUMN:
                System.out.println("AUTUMN");
            case WINNER:
                System.out.println("WINNER");
        }
    }
}
