package Permission_modifier.A;

public class test {
    public static void main(String[] args) {
        Father f = new Father();
        //f.say()无法访问
        f.move();    //void
        f.run();     //protected void
        f.everyone();//public void
    }

}
