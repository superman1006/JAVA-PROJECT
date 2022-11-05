package OOP.basic;

public class Car {
    //创建对象： 类名 对象名 = new 类名();
    //变量（成员变量） 默认值为0,null,false
    String name;
    double price;
    //方法(不用加 static)
    public void Start(){
        System.out.println("汽车"+name+"启动啦");
    }
    public void Run(){
        System.out.println("汽车"+name+"跑起来啦");
    }
    public void Rename(String name){
        System.out.println("你已成功将车原本的名字"+this.name+"改为"+name);
        //因为方法中的形参列表为name与成员变量的name名字相同，所以第一个为成员变量所以加了this
        this.name = name;
    }


    //                                     构造器
    // Car()就是一个构造器，他构造了一个没有参数的对象
    // 每一个类都存在一个默认的 无参数构造器，不需要自己手动写
    // 但是,当写了Car的有参数构造器,那么Car类的无参数构造器就会被覆盖，此时需要自己手动写一个无参数构造器Car();
    // 无参数构造器Car():使用Car c1 = new Car()创建对象时,对象的属性都为默认值，需要后期赋值
    public Car(){
        System.out.println("无参数构造器被触发");
    }
    // 有参数构造器Car(xxx,xxx):使用Car c2 = new Car("BMW",800000.0)创建对象时需要直接赋值，这样不需要后期填写

    /*
    public Car(String name,double price){
        //有参数构造器中的形参列表的名称不能和成员变量的名称相同（如name）,因为此时系统不能区分name为成员变量还是接收的变量
        System.out.println("有参数构造器被触发");
        name = name;
        price = price;
    }
    */

    // 正确做法: 使用 this 关键字(this关键字可以锁定为成员变量)
    // this关键字可以使用在 有参数构造器 和 成员方法 中
    public Car(String name,double price){
        //有参数构造器中的形参列表的名称不能和成员变量的名称相同（如name）,因为此时系统不能区分name为成员变量还是接收的变量
        System.out.println("有参数构造器被触发");
        this.name = name;
        this.price = price;
    }


    // 无参数构造器
    // 快捷键 :右键----生成(Generate)----构造函数(constructor)----无选择
    // 有参数构造器
    // 快捷键 :右键----生成(Generate)----构造函数(constructor)----shift全选----确定


}
