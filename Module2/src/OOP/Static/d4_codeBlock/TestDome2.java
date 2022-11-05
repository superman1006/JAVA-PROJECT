package OOP.Static.d4_codeBlock;
// (了解即可，用的少)
public class TestDome2 {
    // 构造代码块: 随对象走，与对象一起加载，自动触发执行
    {
        System.out.println("构造代码块被触发");
    }
    public static void main(String[] args) {
        System.out.println("==main方法被触发==");
        new TestDome2();// 结果是先执行构造代码块，再执行构造器
    }
    public TestDome2(){
        System.out.println("构造器被触发");
    }
}
