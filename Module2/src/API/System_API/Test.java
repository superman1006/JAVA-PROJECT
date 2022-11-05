package API.System_API;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0 +"s");



        //复制数组
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        System.arraycopy(arr1,0,arr2,2,3);
        /*
            1,被复制的数组
            2，从哪一个索引开始复制
            3，复制到哪一个数组
            4，从哪一个索引开始放入复制的内容
            5，复制的元素的个数
        */
        System.out.println(Arrays.toString(arr2));


    }
}
