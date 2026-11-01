package demo;

import java.util.Scanner;

public class Scannerdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double number = sc.nextDouble();
        System.out.println(number);
    }
}
