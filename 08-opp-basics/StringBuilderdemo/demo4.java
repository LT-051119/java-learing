package StringBuilderdemo;

import java.util.Scanner;

/*需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
对称字符串：123321、111
非对称字符串：123123*/
public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //使用StringBuilder方法
        /*StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String STR =sb.toString();*/
        //链式方法
        String STR =new StringBuilder().append(str).reverse().toString();
        System.out.println(STR);
        //判断是不是对称字符串
        if (STR.equals(str)) {
            System.out.println("该字符串是对称字符串");
        }else{
            System.out.println("该字符串不是对称字符串");
        }
    }
}
