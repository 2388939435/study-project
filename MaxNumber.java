package cn.gary.mr;
import java.util.Scanner;
public class MaxNumber{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入第一个数：");
         int num1 = sc.nextInt();
         System.out.println("请输入第二个数：");
         int num2 = sc.nextInt();
         System.out.println("请输入第三个数：");
         int num3 = sc.nextInt();
         
         int Maxnum = getMax(num1,num2,num3);
         System.out.println("最大的数为：" + Maxnum);
         
    }

	public static int getMax(int a, int b, int c) {
        int temp = a > b ? a : b; 
        // 使用三元运算符求两个数的较大值
        int max = temp > c ? temp : c; 
        // 再用一次三元运算符，将前面的较大值和最后一个值比较，获取最大值
        return max;
        }
}