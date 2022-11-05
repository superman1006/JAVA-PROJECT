package Exception_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
//        String a = "2022年10月27日 09:44:00";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        Date d = sdf.parse(a);

        //--------------------------- EXCEPTION------------------------------------
        //1，throws Exception
        //2，try catch

        //快捷键： 选中后Ctrl+Alt+t
        try {
            String a = "2022-10/27 09:44:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(a);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //推荐两个方法一起用，创建一个方法(写throws Exception)
        // 在底层(就是方法中)出现错误之后，在main函数中用try catch来捕获异常
        // 这样的好处是，可以让用户直接知道异常的出现并且不会将异常抛给JVM虚拟机，也就不会程序死亡，这样也可以继续执行后面的代码
    }
}
