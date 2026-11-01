package Stringdemo;
//金额转换
import java.util.Scanner;

//2135 （转为中文）-- 贰壹叁伍（补零） -- 零零零贰壹叁伍（插入单位） -- 零佰零拾零万贰仟壹佰叁拾伍元
public class demo9 {
    public static void main(String[] args) {
        //1.输入校检数字要有效
        int money;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入数字");
            money = sc.nextInt();
            if (money >= 1 && money <= 9999999) {
                break;
            } else {
                System.out.println("数字无效，请重新输入");
            }
        }
        //2.获取数字，转换为中文
        String [] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String result = "";
        int count = 0;
        while (true){
            //2.1获取数字
            //获取个位
            int ge = money % 10;
            //拼接中文
            result = arr[ge] + result;
            //去除个位
            money = money /10;
            count++;
            if(money % 10 == 0){
                break;
            }
        }
        System.out.println(result);
        //System.out.println(count);
        //3.补零
        int count1 = 7 - count;
        for (int i = 0; i < count1; i++) {
            result = arr[0] + result;
        }
        System.out.println(result);
        //4.插入单位
        String str = "";
        String [] arr1 = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < 7; i++) {
            //获取刚才拼接中文的索引
            char str1 = result.charAt(i);
            str =  str + str1 + arr1[i];
        }
        System.out.println(str);
    }
}
