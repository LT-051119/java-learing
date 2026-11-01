package Stringdemo;
//id.substring(6,10);不能这样直接调用，需要一个变量去接收
public class demo11 {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "32128120200111234";
        //2.截断获取年月日
        String year = id.substring(6,10);
        String moth = id.substring(10,12);
        String day = id.substring(12,14);
        //打印
        //System.out.println('0')//48,可以通过打印字符去得到整数
        System.out.println("出生在"+year+"年"+moth+"月"+day+"日");
        char gender = id.charAt(16);//id.charAt()可以获取字符串索引
        int sum = gender - 48;
        if(sum % 2 == 0){
            System.out.println("性别为女");
        }else {
            System.out.println("性别为男");

        }
    }
}
