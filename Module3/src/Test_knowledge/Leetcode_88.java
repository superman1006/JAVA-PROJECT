package Test_knowledge;
// 利用 指针 和 倒序

/*
给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
(不要求返回nums1，只要求修改nums1)
输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
*/


import java.util.Arrays;

public class Leetcode_88 {
    public static void main(String[] args) {
        //     三种方法的结果
        int[]numsa1 = {1,2,3,0,0,0};
        int[]numsa2 = {2,5,6};
        merge1(numsa1,3,numsa2,3);
        System.out.println(Arrays.toString(numsa1));

        int[]numsb1 = {1,2,3,0,0,0};
        int[]numsb2 = {2,5,6};
        merge2(numsb1,3,numsb2,3);
        System.out.println(Arrays.toString(numsb1));

        int[]numsc1 = {1,2,3,0,0,0};
        int[]numsc2 = {2,5,6};
        merge3(numsc1,3,numsc2,3);
        System.out.println(Arrays.toString(numsc1));

    }
    //merge1:将nums2先合并到nums1后面，然后使用sort函数直接将nums1排序，这样O(n)会很大
    //时间复杂度较大，时间为O((n+m)*log(n+m))
    public static void merge1(int[] nums1,int m,int[] nums2,int n){
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    //merge2:三个指针，分别对应temp，nums1，nums2的开头，判断nums1和nums2中的开头元素否选择小的放到temp的开头，依次循环
    //减少了时间复杂度，时间为O(n+m)
    public static void merge2(int[] nums1,int m,int[] nums2,int n){
        int k = m + n;
        int[] temp = new int[k];
        for (int index = 0,nums1Index = 0,nums2Index = 0;index < k;index++){
            if (nums1Index >= m){/*nums1数组已经取完，完全取nums2数组即可*/
                temp[index] = nums2[nums2Index++];
            }else if (nums1Index >= n){/*nums2数组已经取完，完全取nums1数组即可*/
                temp[index] = nums2[nums2Index++];
            }else if (nums1[nums1Index] < nums2[nums2Index]){
                temp[index] = nums1[nums1Index++];
            }else {
                temp[index] = nums2[nums2Index++];
            }
        }
        for (int i = 0; i < k; i++) {
            nums1[i] = temp[i];
        }
    }

    //merge3:与merge2很相似，但是采用从后往前从大到小的添加进nums1中，减少了临时数组temp
    // 大量减少了空间复杂度
    public static void merge3(int[] nums1,int m,int[] nums2,int n){
        int k = m + n;
        for (int index = k - 1,nums1Index = m - 1,nums2Index = n - 1;index >= 0;index--){
            if (nums1Index < 0){/*nums1数组已经取完，完全取nums2数组即可*/
                nums1[index] = nums2[nums2Index--];
            }else if (nums2Index < 0){/*nums2数组已经取完，完全取nums1数组即可*/
                nums1[index] = nums1[nums1Index--];
            }else if (nums1[nums1Index] > nums2[nums2Index]){
                nums1[index] = nums1[nums1Index--];
            }else {
                nums1[index] = nums2[nums2Index--];
            }
        }
    }
}
