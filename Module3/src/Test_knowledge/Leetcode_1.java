package Test_knowledge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// HashMap

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
*/

public class Leetcode_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 4)));
    }
    // 采用HashMap实现存储已经扫描过的数据，若在HashMap中存在互补数字，那么就返回，不存在则添加进入HashMap
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> storesNums = new HashMap<>(nums.length,1);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            Integer anotherIndex = storesNums.get(another);
            if (null == anotherIndex){
                storesNums.put(nums[i],i);
            }else {
                result[0] = i;
                result[1] = anotherIndex;
                break;
            }
        }
        return result;
    }
}
