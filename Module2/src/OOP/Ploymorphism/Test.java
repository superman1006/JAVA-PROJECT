package OOP.Ploymorphism;

public class Test {
    public static void main(String[] args) {
        //多态，再创建对象时可以使用父类 名称 = new 子类构造器 的格式来创建对象
        // 创建的对象的类型还是父类类型，
        // 但是调用方法时，使用的是子类的方法（run）
        // 但是调用变量时，使用的是父类的的方法（name）
        fu a = new zi1();
        System.out.println(a.name);//fu
        a.run();
        fu b = new zi2();
        System.out.println(b.name);//fu
        b.run();


        //除此之外，还可以将对象的类型强行转换
//        zi1 c = (zi1) a;
//        System.out.println(c.name);//zi1
//        a.run();


        //但是建议在强转之前使用 instanceof 判断是否
        System.out.println(a instanceof zi1);//true
        System.out.println(b instanceof zi1);//false
    }
}
