package com.basic_garmmer;

public class if_and_switch {
    public static void main(String[] args) {
//                                  if
        {
            System.out.println("------------分支结构------------");
            // if分支 (三种格式)
            /*
                  1
             if(条件表达式){
               语句体;
             }

                  2
             if(条件表达式){
               语句体1;
             }else{
               语句体2;
             }

                  3
              if(条件表达式1){
               语句体1;
             }else if(条件表达式2){
               语句体2;
             }else if(条件表达式3){
               语句体3;
             }else if(条件表达式4){
               语句体4;
             }

            */
            int a = 70;
            {
                if(a >= 60){
                    System.out.println("pass");
                }else{
                    System.out.println("fall");
                }
            }

            {
                if (0<=a && a<=60){
                    System.out.println("你及格啦");
                }else if (a>60 && a<=80){
                    System.out.println("你这次考得不错");
                }else if (a>80 && a<=100){
                    System.out.println("你这次考的太棒啦");
                }
            }


        }
//                                 switch
        {
            //switch分支:表达式只支持byte，short,int,char,String(JDK7),最后注意一定要写break;
            String weekday = "Wednesday";
            switch (weekday){
                case "Monday":
                    System.out.println("Monday");
                    break;
                case "Tuesday":
                    System.out.println("Tuesday");
                    break;
                case "Wednesday":
                    System.out.println("Wednesday");
                    break;
                case "Thursday":
                    System.out.println("Thursday");
                    break;
                case "Friday":
                    System.out.println("Friday");
                    break;
                case "Saturday":
                    System.out.println("Saturday");
                    break;
                case "Sunday":
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("default");
                    break;
                case "a":
                case "b":
                case "c":
                case "d":
                    //穿透性:当输入值为abcd时都输出相同的结果
                    System.out.println("abcd");
                    break;
            }
        }
    }
}
