package API.ArrayList_and_String.Test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //1，定义一个Movie类
        //2，定义一个ArrayList储存Movie对象
        ArrayList<Movie> Movies = new ArrayList<>();
//        Movie m1 = new Movie("肖申克的救赎","罗宾斯",9.7);
//        Movies.add(m1);可以不用创建实例，直接添加
        Movies.add(new Movie("肖申克的救赎","罗宾斯",9.7));
        Movies.add(new Movie("霸王别姬","张国荣",9.6));
        Movies.add(new Movie("阿甘正传","汤姆.汉克斯",9.5));
        System.out.println(Movies);//地址[API.Test.Movie@16b98e56, API.Test.Movie@7ef20235, API.Test.Movie@27d6c5e0]
        for (int i = 0; i < Movies.size(); i++) {
            Movie m = Movies.get(i);
            System.out.println(m.getName()+m.getActor()+m.getScore());
        }
    }
}