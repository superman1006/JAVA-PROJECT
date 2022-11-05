package OOP.JavaBean;

public class User {
    //  1.成员变量必须要用private修饰
    private String name;
    private double height;
    private double salary;

    //  2.要为每一个成员变量设置set和get方法用于获取和修改数据
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public double getsalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    //  3.每一个实体类都要存在一个无参数构造器(有参数构造器可以选择写不写都可以)

    //快捷键 :右键----生成(Generate)----构造函数(constructor)----shift全选----确定
    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }
    //快捷键 :右键----生成(Generate)----构造函数(constructor)----无选择
    public User() {
    }
}
