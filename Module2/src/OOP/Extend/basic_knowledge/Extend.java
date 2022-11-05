package OOP.Extend.basic_knowledge;

public class Extend {
    /**
     * JAVA使用子类 extends 父类 进行继承
     * JAVA不支持 多继承 ，即每一个子类至多只有一个父类。但是可以支持多层继承
     * JAVA 继承中子类不会继承 父类的构造器
     * JAVA 子类会继承父类的私有成员变量（private xxx），但是不能直接访问
     * JAVA 子类不能继承父类的静态成员变量（方法），只是子类可以共享，但是不是继承给子类
     * JAVA 在子类使用父类成员变量的时候，要使用super.xxx;  使用子类自己的成员变量，要使用this.xxx;
     * JAVA 每一次方法重写都要加一个@Qverride，代表要使用方法重写，它是判断方法重写是否成功的标准
     * JAVA 父类的私有方法不能被方法重写
     * JAVA 子类重写父类方法时，访问权限必须满足大于或者等于父类（缺省 < protected < public）
     * JAVA 子类不能重写父类的静态方法，否则会报错
     */

    public static void main(String[] args) {
        Son s = new Son();
        s.method();
        System.out.println("-------------------------------");
        s.run();
        s.go();
        s.A();
    }

}

