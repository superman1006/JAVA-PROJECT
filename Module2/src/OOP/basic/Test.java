package OOP.basic;

public class Test {
    public static void main(String[] args) {
        //        无参数构造器
        Car car1 = new Car();
        System.out.println(car1.price);
        System.out.println(car1.name);
        car1.name = "BMW";
        car1.price = 1000;
        System.out.println(car1.price);
        System.out.println(car1.name);
        car1.Run();
        car1.Start();
        car1.Rename("CL和ZYY的车车");
        System.out.println(car1.name);

        //        有参数构造器
        Car car2 = new Car("宝马", 800000);
        System.out.println(car2.name);
        System.out.println(car2.price);
    }
}
