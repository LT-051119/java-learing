package Stringdemo;

import java.util.Scanner;

//需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
public class demo6 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //统计分别的大写，小写，数字字符
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //循环来统计
        for (int i = 0; i < str.length(); i++) {
            //获取索引 把i转换为字符
            char c = str.charAt(i);
            //判断大写
            if (c > 'A' && c < 'Z') {
                bigCount++;
            } else if (c > 'a' && c < 'z') {
                smallCount++;
            } else if (c > '0' && c < '9') {
                numberCount++;
            }
        }
        System.out.println("字符串大写字母有"+ bigCount+"个");
        System.out.println("字符串大写字母有"+ smallCount+"个");
        System.out.println("字符串大写字母有"+ numberCount+"个");
    }
}
