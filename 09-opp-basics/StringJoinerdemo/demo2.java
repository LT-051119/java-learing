package StringJoinerdemo;

import java.util.StringJoiner;

public class demo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");
        //2.添加对象
        sj.add("a").add("b").add("c");
        //3.返回字符串
        String str = sj.toString();
        //4.打印
        System.out.println(str);
    }
}
