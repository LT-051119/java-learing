package Stringdemo;

import java.util.Scanner;

/*定义一个方法，实现字符串反转。
键盘录入一个字符串，调用该方法后，在控制台输出结果
例如，键盘录入 abc，输出结果 cba*/
public class demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        resever(str);
    }
    //1.定义一个方法
    public static void resever(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            char str1 = str.charAt(i);
            result = result +str1;
        }
        System.out.println(result);
    }

}
