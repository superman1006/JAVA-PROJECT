package final_keywoed;

class Father {
    //若在class Father前加final，那么class Son 就会报错，因为Father无法被继承
    public void run() {
        //如果改成public final void run()，那Son 的run就会报错，因为Father的run无法被重写
        System.out.println("Father is running");
    }
}
