package Test_knowledge;

import java.util.Arrays;

// 双指针
//使用两个元素交换的话，会导致O(n)较大，所以这题选择先将非0数排在前面，然后在后面再补0
/*
给定一个数组 nums 编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意必须在不复制数组的情况下原地对数组进行操作。
*/
public class Leetcode_283 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        if (nums == null){
            return;
        }
        int j = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for (int i = j;i < nums.length;i++){
            nums[i] = 0;
        }
    }
}
