package Test_knowledge;

import java.util.ArrayList;
//利用索引，索引是唯一和1-n有联系的结构
//可以使用Hashmap实现改题目，但是为了减少空间复杂度，所以暂且不使用

/*
给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
你能在不使用 额外空间 且 时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。
*/

//以下是使用将元素变为负数的解决方法
// 除此之外还可以选择将对应索引的元素加n，最后筛选没有超过n的元素的索引
public class Leetcode_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    //由于Idea中没有List<Integer>,所以暂且改为ArrayList
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int Index = abs(nums[i]) - 1;
            if(nums[Index] > 0){
                nums[Index] = -nums[Index];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }
        return result;
    }
    public static int abs(int a){
        if(a < 0){
            return -a;
        }else{
            return a;
        }
    }
}
