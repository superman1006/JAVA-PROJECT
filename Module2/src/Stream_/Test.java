package Stream_;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // -----------------------------------------example----------------------------------------------------------
        Collection<String> a = new ArrayList<>();
        a.add("a");
        a.add("ab");
        a.add("abc");
        a.add("bc");
        //筛选a开头的元素，再筛选a开头并且长度为3的元素
        //filter是过滤器，接收对象并且重写筛选规则
        a.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        a.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).forEach(System.out::println);


        // -----------------------------------------Stream----------------------------------------------------------
        //--------------------------------------Collection集合 获取流--------------------------------------------------
        ArrayList<String> List = new ArrayList<>();
        Stream<String> s = List.stream();


        //-------------------------------------------Map集合 获取流----------------------------------------------------
        Map<String,Integer> maps = new HashMap<>();
        //键流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valueStream = maps.values().stream();
        //键值对
        Stream<Map.Entry<String,Integer>> keyValuestream= maps.entrySet().stream();//返回Set类型

        //-------------------------------------------数组 获取流----------------------------------------------------
        String [] b = {"1","2","3","4"};
        //方法一
        Stream<String> name1 = Arrays.stream(b);
        //方法二
        Stream<String> name2 = Stream.of(b);

        //--------------------------------------------------API----------------------------------------------------
        // .filter 对数据流进行过滤
        // .limit(n) 获取前几个元素
        // .skip(n) 跳过后几个元素
        // .distinct 去除流中重复的元素（依赖.hashCode和.equals）
        // .concat(a,b) 合并两个流为一个流
        // 操作完后用.foreach(new Consumer)重写accept方法来对遍历到的每一个元素进行操作

    }
}
