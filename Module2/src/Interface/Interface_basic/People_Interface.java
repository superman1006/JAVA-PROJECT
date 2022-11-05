package Interface.Interface_basic;

//接口定义要用interface
//接口不能创建对象
//接口和接口之间可以用extends来继承
//接口的作用，接口是用来被类实现（implements）的，实现接口的类被称为实现类，实现类可以理解为子类，接口可以理解为特殊的父类
//实现类可以被单实现，也可以被多实现

public interface People_Interface {
    //JDK1.8之前接口只包含变量和抽象方法
    //public static final 可以省略不写，接口会默认帮你加上
    String NAME = "CHEN_LV";//他是（final）常量！，而不是成员变量！

    //public abstract 可以省略不写，接口会默认帮你加上
    void run();//没有方法体的
}
