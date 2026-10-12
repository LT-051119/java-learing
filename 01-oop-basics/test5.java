package test;

import java.util.Random;

//在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
//选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
public class test5 {
    public static void main(String[] args) {
        //分析：评委打分是随机的但是有范围，1.1先生成随机数6个，2.1可以用数组存储
        //3.1对6个随机数再进行比较，去掉最大值和最小值，4.1再来算4个数的平均数
        //1.定义一个数组
        int [] arr = new int [6];
        //1.生成6个随机数
        Random r = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = r.nextInt(101);
            System.out.println("生成的6个随机数为"+arr[i]);
        }
        //判断数组大小，去除最大和最小的值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
        } else if (min>arr[i]) {
                min=arr[i];
            }
        sum = sum + arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        sum = sum-min-max;
        System.out.println(sum);
        //求平均数
        double avg=(double)(sum/4);
        System.out.println(avg);
    }
}
