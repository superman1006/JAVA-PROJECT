package Permission_modifier.A;

public class Father {
    private void say(){
        System.out.println("Father is saying");
    }

    void move(){
        System.out.println("moving");
    }

    protected void run(){
        System.out.println("running");
    }

    public void everyone(){
        System.out.println("everyone");
    }


    public static void main(String[] args) {
        Father f = new Father();
        f.say();     //private
        f.move();    //void
        f.run();     //protected void
        f.everyone();//public void
    }
}
