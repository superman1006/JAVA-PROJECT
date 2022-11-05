package OOP.Static.d5_DesignPattern;

public class Test {
    public static void main(String[] args) {
        // 饿汉单例模式
        SingleInstance1 s1 = SingleInstance1.instance;
        SingleInstance1 s2 = SingleInstance1.instance;
        SingleInstance1 s3 = SingleInstance1.instance;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // 三个是一样的地址，证明了之创建了一个对象



        // 懒汉单例模式
        // 都用方法调用
        SingleInstance2 s4 = SingleInstance2.getInstance();
        SingleInstance2 s5 = SingleInstance2.getInstance();
        SingleInstance2 s6 = SingleInstance2.getInstance();

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        // 三个是一样的地址，证明了之创建了一个对象
    }
}
