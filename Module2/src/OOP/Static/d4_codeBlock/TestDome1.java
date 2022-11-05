package OOP.Static.d4_codeBlock;

public class TestDome1 {


    public static void main(String[] args) {
        System.out.println("==main方法被触发==");
    }

    // 静态代码块: 与类一起加载，优先执行，执行一次
    // 作用: 在程序加载之前，将静态数据初始化(准备内容)
    static{
        System.out.println("==静态代码块被触发==");
    }
}
