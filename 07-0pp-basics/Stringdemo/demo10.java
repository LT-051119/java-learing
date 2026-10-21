package Stringdemo;

public class demo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "13112349468";
        //2.截取手机号码前面三位
        String start = phoneNumber.substring(0, 3);//包头不包尾
        System.out.println(start);//131
        //3.截取手机号码后面四位
        String end = phoneNumber.substring(7);//这个substring方法不写结束的范围，会自动截断到结尾
        System.out.println(end);//9468
        //4.拼接
        String result = start + "****" + end;
        //5.打印
        System.out.println(result);
    }
}
