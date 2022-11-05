package InterClass.Lambda_expression;

public class Test {
    //Lambda表达式只能简化 ！函数式接口！ 的 !匿名内部类! 的写法形式
    // 即 是接口，也是有且仅有一个抽象方法

    //参数类型可以省略不写
    //如果只有一个参数，那么可以省略()
    //如果函数体只有一行，那么可以省略 {} 和 ; ，如果是return语句还可以省略return和;不写
    //
    public static void main(String[] args) {

        // 1
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println(" person run");
            }
        };
        a.run();

        Animal a2 =() -> System.out.println(" person run");
        a2.run();
    }
}

@FunctionalInterface     //代表函数式接口
interface Animal{
    void run();
}