package test2;

import java.util.Scanner;

public class test {
    //键盘录入：
    //第一套体系：
    //nextInt(); 接收整数
    //nextDouble();接收小数
    //next();接收字符串
    //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了

    //第二套体系：
    //nextLine();接收字符串，可以读取一整行（包含空格）

    //1.创建Scanner对象
    Scanner sc = new Scanner(System.in);

    /*nextInt() 接收整数
        System.out.println("请输入一个整数：");
    int num = sc.nextInt();
        System.out.println("你输入的整数是：" + num);*/

    /*nextDouble() 接收小数
        System.out.print("请输入一个小数：");
    double d = sc.nextDouble();
        System.out.println("你输入的小数是：" + d);*/

    /*next() 接收字符串，遇到空格/回车就停止读取
        System.out.print("请输入字符串(不能带空格)：");
        String s1 = sc.next();
        System.out.println("next获取内容：" + s1);*/

    //【重点坑】nextInt/nextDouble/next读完后，缓冲区还剩回车，直接nextLine会读空
    /*nextLine() 接收一整行字符串，可以读取带空格的内容
        System.out.print("请输入一整行文字(可以带空格)：");
        String s2 = sc.nextLine();
        System.out.println("nextLine获取整行：" + s2);*/
}
