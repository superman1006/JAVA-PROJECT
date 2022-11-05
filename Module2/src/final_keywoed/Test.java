package final_keywoed;

public class Test {
    public static void main(String[] args) {

        //了解final关键字
        //final关键字修饰类，类不可被继承
        //final修饰方法，方法不能被重写
        //final修饰变量，变量只能被赋值一次  一般用于修饰 静态成员变量，不修饰实例成员变量
        Son s = new Son();
        s.run();
        final int a = 1;
        //a = 2;会报错
    }


    //常量:使用 public static final 来修饰的 静态成员变量
    public static final String SCHOOL_NAME = "华南师范大学";


}
