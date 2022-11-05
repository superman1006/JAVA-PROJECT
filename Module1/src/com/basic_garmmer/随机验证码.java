package com.basic_garmmer;

import java.util.Random;

public class 随机验证码 {
    public static void main(String[] args) {
        System.out.println(createCode(6));
    }
    public static String createCode(int n){
        //        A--Z           a--z
        // char 65 -- (65+25)    97 -- (97+25)
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);//0,1,2
            switch (type){
                case 0:
                    //大写
                    char ch1 = (char)(r.nextInt(26)+65);
                    code += ch1;
                    break;
                case 1:
                    //小写
                    char ch2 = (char)(r.nextInt(26)+97);
                    code += ch2;

                case 2:
                    //数字
                    int a = r.nextInt(10);
                    code += a;
            }
        }
        return code;
    }
}
