package Stringdemo;

import java.util.Scanner;

/*已知正确的用户名和密码，请用程序实现模拟用户登录。
总共给三次机会，登录之后，给出相应的提示*/
public class demo4 {
    public static void main(String[] args) {
        //1.已知正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //3.总共给三次机会，登录之后
        for (int i = 0; i < 3; i++) {

            //2.请用程序实现模拟用户登录,键盘录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账户");
            String name = sc.next();
            System.out.println("请输入密码");
            String Password = sc.next();

            //4.登录之后，给出相应的提示，字符串的比较：变量1.equals(变量2)
            if (rightUsername.equals(name) && rightPassword.equals(Password) ) {
                //4.1登录成功
                System.out.println("您已登录成功");
                break;
            }else{
                //4.2登录失败，只有三次机会
                if(i == 2){
                    System.out.println("您登录失败了已锁定当前界面，请联系管理人员");
                }else{
                    System.out.println("您还有"+(2-i)+"次登录机会");
                }
            }
        }
    }
}
