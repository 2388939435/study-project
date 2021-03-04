package cn.gary.mr;

public class shuzu{
    public static void main(String[] args) {
        int[] arr = {84, 75, 90, 96, 80, 82}; // 给定数组
        // 1. 定义变量 max, 用来表示最大值，初始值为第一个元素
        int max = arr[0];
        // 2. 通过for循环遍历数组, 获取到每一个数据
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];

            }
        }

        // 3.遍历一遍后，记录的就是最大值, 打印即可
        System.out.println("数组中的最大元素为: " + max);
    }
}