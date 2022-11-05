package API.BigDecimal_API;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a+b;//0.30000000000000004
        System.out.println(c);


        //BigDecimal a1 = new BigDecimal(a);
        //BigDecimal b1 = new BigDecimal(b);
        //不推荐使用new创建的BigDecimal,因为不能解决问题

        //推荐使用BigDecimal.valueOf();
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);// +
        System.out.println(c1);
        BigDecimal c2 = a1.subtract(b1);// -
        System.out.println(c2);
        BigDecimal c3 = a1.multiply(b1);// *
        System.out.println(c3);
        BigDecimal c4 = a1.divide(b1);// /
        System.out.println(c4);

        //这个BigDecimal只是手段，最终需要转换成double类型
        double x = c1.doubleValue();
        System.out.println(x);



        //只能处理精确运算，像10.0/3.0这种不精确的是会报错的
        BigDecimal A = BigDecimal.valueOf(10);
        BigDecimal B = BigDecimal.valueOf(3);
//        System.out.println(A.divide(B));//报错
        System.out.println(A.divide(B,4, RoundingMode.HALF_UP)); //保留4位小数.RoundingMode.HALF_UP代表四舍五入

    }
}
