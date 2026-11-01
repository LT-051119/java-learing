package Stringdemo;
//talk.replace();不能这样直接调用，需要用一个变量去接收
public class demo12 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD";

        //2.把里面的敏感词TMD替换为***
        String result = talk.replace("TMD", "***");

        //3.打印结果
        System.out.println(result);
    }
}
