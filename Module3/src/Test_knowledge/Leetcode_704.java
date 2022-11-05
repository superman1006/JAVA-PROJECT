package Test_knowledge;

// 二分查找

/*
题目704.
给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，
写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 */

public class Leetcode_704 {
    public static void main(String[] args) {
        int[]nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums,9));//4
    }
    public static int search(int[] nums, int target) {
        int Left = 0;
        int Right = nums.length - 1;
        while(Left <= Right){
            int mid = Left + (Right - Left)/2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                Right = mid - 1;
            }else{
                Left = mid + 1;
            }
        }
        return -1;
    }
}

/*
为了最大程度的减少时间复杂度O(n)，选择使用二分查找，即从中间向两端查找
*/
