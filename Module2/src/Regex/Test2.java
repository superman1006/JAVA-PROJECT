package Regex;
//正则表达式的方法
//      .split
//      .replaceAll
public class Test2 {
    public static void main(String[] args) {
        String a = "fsf你312好fsdf142陈aafa律";
        String[] a1 = a.split("");//全部分割开并储存在一个String数组里
        String[] a2 = a.split("\\w+");
        String a3 = a.replaceAll("\\w+","  ");//将a3中的所有\\w(英文数字字母1下划线)都替换成 空格
        System.out.println(a3);




        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);

        }


    }
}
