package OOP.Static.d2_Method;

public class Student {
    private String name;
    private int age;
    // 实例方法
    public void study(){
        System.out.println(name+" is Studying");
    }

    // 静态方法
    public static void getMax(int a,int b){
        System.out.println(a > b? a : b);
    }

    public static void main(String[] args) {
        // 静态方法
        // 在类中可以直接调用static 方法，也可以使用类名.方法调用
        Student.getMax(1,2);
        getMax(10,2);

        // 实例方法
        Student s1 = new Student();
        s1.name = "CL";
        s1.study();

    }
}
