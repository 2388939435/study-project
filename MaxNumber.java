package cn.gary.mr;
import java.util.Scanner;
public class MaxNumber{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("�������һ������");
         int num1 = sc.nextInt();
         System.out.println("������ڶ�������");
         int num2 = sc.nextInt();
         System.out.println("���������������");
         int num3 = sc.nextInt();
         
         int Maxnum = getMax(num1,num2,num3);
         System.out.println("������Ϊ��" + Maxnum);
         
    }

	public static int getMax(int a, int b, int c) {
        int temp = a > b ? a : b; 
        // ʹ����Ԫ��������������Ľϴ�ֵ
        int max = temp > c ? temp : c; 
        // ����һ����Ԫ���������ǰ��Ľϴ�ֵ�����һ��ֵ�Ƚϣ���ȡ���ֵ
        return max;
        }
}