package OOP.Static.d1_field;

public class User {
    //用static修饰的变量是静态成员变量(存放于堆内存中)，用于需要被共享的信息
    //而实例成员变量用于属于每个对象的不同的信息

    //在线人数信息：静态成员变量
    //使用类名.静态成员变量访问  或者  直接使用（必须在类中才能直接访问）
    public static int onlineNumber;//默认为0
    // 实例成员变量
    private String name;
    private int age;

    public static void main(String[] args) {
        onlineNumber++;
        System.out.println(onlineNumber);
        System.out.println(User.onlineNumber);
        User u1 = new User();
        u1.name = "cl";
        u1.age = 19;
        System.out.println(u1.name);
        System.out.println(u1.age);
    }
}
