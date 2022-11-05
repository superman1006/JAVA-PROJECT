package API.StringBuilder_API;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b").append(false).append(1231);//支持链式编程
        System.out.println(sb);//太修改了object的toString方法，所以输出结果就是内容


        //反转
        sb.reverse().append(666666);
        System.out.println(sb);

        // StringBuilder只是一个手段，在平常的开发中使用的都是String，所以要将它操作完转换成String类型
        System.out.println(sb.getClass());
        String a = sb.toString();
        System.out.println(a.getClass());
    }
}
