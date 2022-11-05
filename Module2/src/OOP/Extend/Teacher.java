package OOP.Extend;

public class Teacher extends People{
    private int number;
    public Teacher(String name,int age,int number){
        super(name,age);//不写也会执行
        this.number = number;
        System.out.println("子类构造器被调用");
    }

    public Teacher() {
        System.out.println("子类构造器被调用");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Teacher独有的行为
    public void Teach(){
        System.out.println(getName() + " is teaching");
    }
}
