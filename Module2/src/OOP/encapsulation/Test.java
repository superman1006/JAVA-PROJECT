package OOP.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        //使用private封装成员变量后,不允许在外界访问改成员变量
        //例如:  s1.age = 18;   这是错误的因为无法在外界访问

        System.out.println(s1.getAge());//0
        int new_age = 50;
        s1.setAge(new_age);
        System.out.println(s1.getAge());//50
    }
}
