package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String rs = "电话13483947264，邮箱1402788264da@qq.com"+
                "电号码fada13483123464，邮箱1402788264da@qwb.com" +
                "400-100-12138";

        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|"+
                "(1[3-9]\\d{9})|"+
                "(0\\d{2,6}-?\\d{5,20})|"+
                "(400-?\\d{3,9}-?\\d{3,9})";
        //第一行代表邮箱
        //第二行代表电话
        //第三行代表由 0 开头的，有一个-电话
        //第四行代表由 400 开头的，有两个-的电话


        //创建一个匹配对象获取爬取规则
        Pattern pattern = Pattern.compile(regex);
        //创建一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);
        while(matcher.find()){// 返回boolean值
            String rs1 = matcher.group();//放在一组
            System.out.println(rs1);
        }
    }
}
