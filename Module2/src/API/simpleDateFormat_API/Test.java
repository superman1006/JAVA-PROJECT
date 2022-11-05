package API.simpleDateFormat_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //1,创建日期对象
        String dateStr = "2022-10-24 14:33:00";
        System.out.println(dateStr);


        //2,将字符串解析成日期对象
        //解析的形式必须相同，否则运行会报错
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(dateStr);// 由于parse会报错因为计算机不知道你写的格式是否有问题，他会告诉你出现报错
        // alt + enter,选择第一个回车，丢掉异常

        //3，往后走两天1小时
        long time = d1.getTime()+(2*24*60*60+60*60)*1000L;//要加一个L，让所有数字以long运行，以免运行时

        System.out.println(sdf.format(time));

        Date d2 = sdf.parse(sdf.format(time));
        System.out.println(d2);
        System.out.println(d2.after(d1));//判断d2是否在d1之前
        System.out.println(d2.before(d1));//判断d2是否在d1之后


    }
}
