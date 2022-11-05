package InterClass.Basic;

public class Test {
    outer.intera a = new outer.intera();
    outer.interb b = new outer().new interb();


    public static void go(Swim swim){
        swim.swim();
    }

    public static void main(String[] args) {

        /**
         * !!!!! 匿名内部类 !!!!!!!
         * 方便创建子类对象，简化代码编写
         * 不需要给你所创建的子类单独写一个class
         * 直接创建一个父类对象，后面接{}，在{}中重写方法
         * 最后就可以直接获得一个子类对象，这个过程跳过了创建子类的过程
         **/

        Animal a = new Animal() {
            @Override
            void run() {
                System.out.println("Tiger is running");
            }
        };
        a.run();

        //创建一个匿名内部类对象，注意不是接口对象，因为接口没有构造器，不能创建对象
        //可以在外面创建了在调用go方法，也可以直接调用go方法并且在go方法中创建对象


        //   1
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("chenlv is swimming");
            }
        };
        go(s);


        //   2
        go(new Swim() {
            @Override
            public void swim() {
                System.out.println("chenlv is swimming");
            }
        });
    }
}

abstract class Animal{
    void run(){}
}

@FunctionalInterface
interface Swim{
    void swim();
}
