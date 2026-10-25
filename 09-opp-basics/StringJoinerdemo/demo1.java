package StringJoinerdemo;

import java.util.StringJoiner;

public class demo1 {
    public static void main(String[] args) {
        //1.创建对象，演示间隔符
        StringJoiner sj = new StringJoiner("---");
        //2.添加字符
        sj.add("aaa").add("bbb").add("ccc");
        //3.返回字符串
        String str = sj.toString();
        //4.打印
        System.out.println(str);
    }
}
