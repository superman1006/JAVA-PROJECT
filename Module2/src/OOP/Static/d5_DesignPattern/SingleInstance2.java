package OOP.Static.d5_DesignPattern;

// 懒汉单例: 当真正需要一个对象时才会去创建一个对象
public class SingleInstance2 {
    // 1,将构造器私有，不然在外界创造对象
    private SingleInstance2(){

    }
    // 2,定义一个 ！私有！静态成员变量 (但是先不创建存储一个类的对象)
    private static SingleInstance2 instance;// null

    // 3,定义一个方法获取一个对象
    public static SingleInstance2 getInstance(){
        if (instance == null){
            instance = new SingleInstance2();
        }
        return instance;
    }
}
