package Test_knowledge;
// 递归

/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
*/

public class Leetcode_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs1(5));
        System.out.println(climbStairs2(5));
    }
    // 可以采用递归的方法:n个台阶，那么climbStairs1(n-1)和climbStairs1(n-2)就分别代表开头选择走一步的数量和走两步的数量
    // 但是当 n 较大时，程序会多次计算已经计算过的数值，导致时间复杂度过高
    // (所以可以使用HashMap来储存已经计算的数据//https://leetcode.cn/problems/climbing-stairs/solution/yuan-lai-hui-pa-lou-ti-de-zheng-que-zi-s-pjez/)
    public static int climbStairs1(int n) {
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            return climbStairs1(n-1) + climbStairs1(n-2);
        }
    }

    //上面的方法是自顶向下依次递归，而方法二采用自下向上依次求出climbStairs2(3)和climbStairs2(4)等，直到求到climbStairs2(n)
    public static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }else {
            //创建prepre和pre指针
            int prepre = 1;
            int pre = 2;
            int result = 0;
            for (int i = 3; i <= n; i++) {
                result = prepre +pre;
                prepre = pre;
                pre = result;
            }
            return result;
        }
    }
}
