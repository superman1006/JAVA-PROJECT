package OOP.Extend;

public class Test {
    public static void main(String[] args) {
        //创建子类对象，判断是否可以使用父类方法
        Teacher t = new Teacher();
        t.setName("Cl");
        t.setAge(19);
        t.setNumber(96);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getNumber());

        // 子类独有的行为方法
        t.Teach();

    }
}
