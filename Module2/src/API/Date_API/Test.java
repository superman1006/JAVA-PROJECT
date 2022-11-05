package API.Date_API;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);//毫秒

    }
}
