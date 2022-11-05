package InterClass.Basic;

public class outer {

    public static class intera{
        // 静态内部类，与普通类相同
        // 创建对象时需要 外部类类名.内部类类名 name = new 外部类类名.内部类类名();
        public static String a_name = "inter";
    }

    public class interb{
        //成员内部类，在JDK16之前不能在成员内部类中创建静态变量，16之后可以
        //创建对象是 外部类类名.内部类类名 name = new 外部类类名().new 内部类类名();
        public static String b_name = "inter";
    }
}
