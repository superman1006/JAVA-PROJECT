package File_;

import java.io.File;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("D:/ja-netfilter/");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.length());//字节大小
        System.out.println(f1.lastModified());//最后修改时间,时间毫秒值
        long time  = f1.lastModified();
        System.out.println("最后修改时间："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time));
        //判断是文件还是文件夹
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
    }
}
