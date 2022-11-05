package Interface.Interface_implements;

public interface SportMan {
    void run();
    void compete();
    default void a(){
        //默认方法
        //这个方法用default修饰，该方法不需要被接口类重写
        //  接口类可以直接调用！！
        System.out.println("调用了默认方法");
        c();
    }
    static void b(){
        // 静态方法，这个方法是被限制在只能在接口中使用，不能再接口类中调用
        System.out.println("静态方法");
    }
    private void c(){
        //私有的对象方法，只能在接口内部调用
        System.out.println("");
    }
}
