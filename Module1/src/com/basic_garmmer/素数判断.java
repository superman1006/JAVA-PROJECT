package com.basic_garmmer;

public class 素数判断 {
    public static void main(String[] args) {
        Sushu(101,200);
        System.out.println("");

    }
    public static void Sushu(int c, int b){
        for (int a = c; a <= b; a++){
            //判断这个数是不是素数
            //信号位flag: 标记
            boolean flag = true;
            for (int j = 2; j < a; j++){
                if(a % j == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.print(a+"\t");
            }
        }
    }
//    public static void
}
