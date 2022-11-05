package OOP.encapsulation;
//封装 :为了让数据即 安全 (private)也 可用(为私有变量创建方法);提升开发效率,让程序更容易理解与维护
public class Student {
    private int age ;
    //当使用private时,也要为这个并成员变量设置公共方法

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=0 && age<=200){
            this.age = age;
        }else {
            System.out.println("请重新检查你输入的年龄");
        }

    }
}
