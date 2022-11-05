package abstract_class;

public abstract class Animal {
    public abstract void run();
    //创建一个抽象类Animal，并且创建抽象方法run，代表run方法是子类必须有的，若不重写run方法则会报错
    //抽象方法是没有方法体的
    //抽象类不能创建对象，因为抽象类的抽象方法没有方法体，所以不能被调用，否则会报错的
    //抽象类可以没有抽象方法
    //一个类继承了抽象类，必须完成所有抽象方法的重写，否则必须成为抽象类
    //abstract不能与final并列，因为他们是互斥关系
    //abstract不能与private，static，final，native并列修饰同一个方法




    //模板方法
    //当两个类的所需要的代码大量重复时，可以使用模板方法
    //1，创建一个abstract的父类
    //2，将其中一个类的所有代码放入父类
    //3，将两个类不同的代码在父类中单独标识为abstract方法
    //4，将两个类继承父类然后在重写方法
}
