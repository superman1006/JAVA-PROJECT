package Test_knowledge;

/**
 *   ^ 是异或！！
 *   使用   a = a^b;  可以交换 a 和 b的值
 *         b = a^b;
 *         a = a^b;
 *   但是要注意如果要交换的是数组里面的两个元素，则作为方法提供的两个索引i 和 j 不能相同，否则会都为 0
* */
public class SWAP {
    public static void main(String[] args) {
        int a = 17;
        int b = 23;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);

    }
}
