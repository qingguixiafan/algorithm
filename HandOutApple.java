import java.util.Scanner;

/**
 * 题目描述
 n 只奶牛坐在一排，每个奶牛拥有 ai 个苹果，现在你要在它们之间转移苹果，使得最后所有奶牛拥有的苹果数都相同，每一次，你只能从一只奶牛身上拿走恰好两个苹果到另一个奶牛上，问最少需要移动多少次可以平分苹果，如果方案不存在输出 -1。
 输入描述:
 每个输入包含一个测试用例。每个测试用例的第一行包含一个整数 n（1 <= n <= 100），接下来的一行包含 n 个整数 ai（1 <= ai <= 100）。
 输出描述:
 输出一行表示最少需要移动多少次可以平分苹果，如果方案不存在则输出 -1。
 示例1
 输入
 4
 7 15 9 5
 输出
 3
 * @author mudu
 * @date 2018/2/2
 */
public class HandOutApple {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
            sum += arr[i];
        }
        if (sum%n!=0) {
            System.out.println(-1);
            return;
        }
        int avg = sum/n;
        if (avg%2==0) {
            for (int i = 0; i < n; i++) {
                if(arr[i]%2!=0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i]%2==0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        int avgSum = 0;
        for (int i = 0; i < n; i++) {
            avgSum += Math.abs(avg-arr[i]);
        }
        System.out.println(avgSum/4);
    }
}
