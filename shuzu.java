package cn.gary.mr;

public class shuzu{
    public static void main(String[] args) {
        int[] arr = {84, 75, 90, 96, 80, 82}; // ��������
        // 1. ������� max, ������ʾ���ֵ����ʼֵΪ��һ��Ԫ��
        int max = arr[0];
        // 2. ͨ��forѭ����������, ��ȡ��ÿһ������
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];

            }
        }

        // 3.����һ��󣬼�¼�ľ������ֵ, ��ӡ����
        System.out.println("�����е����Ԫ��Ϊ: " + max);
    }
}