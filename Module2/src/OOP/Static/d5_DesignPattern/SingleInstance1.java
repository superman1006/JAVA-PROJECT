package OOP.Static.d5_DesignPattern;

// 饿汉单例: 再类获取对象的时候，对象以及提前为你创建好
public class SingleInstance1 {
    // 1,将构造器私有，不然在外界创造对象
    private SingleInstance1(){

    }
    // 2,定义一个公开静态成员变量存储一个类的对象
    public static SingleInstance1 instance = new SingleInstance1();
}
