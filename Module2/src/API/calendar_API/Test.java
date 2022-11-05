package API.calendar_API;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//calendar私有了构造器，提供了一个单例对象，我们只能获取一个单例来使用
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int date = c.get(Calendar.DATE);//一个月的第几天
        System.out.println(date);

        int dateofyear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(dateofyear);

        c.add(Calendar.DAY_OF_YEAR,60);//60天之后的时间是那一天
        System.out.println(c);
    }
}
