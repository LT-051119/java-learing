package a08BigerInteger;

import java.math.BigInteger;

public class demo1 {
    public static void main(String[] args) {
         // 定义两个大数
        BigInteger a = BigInteger.valueOf(20);
        BigInteger b = BigInteger.valueOf(6);

        // 加法 add
        BigInteger addRes = a.add(b);
        System.out.println("加法结果：" + addRes);

        // 减法 subtract
        BigInteger subRes = a.subtract(b);
        System.out.println("减法结果：" + subRes);

        // 乘法 multiply
        BigInteger mulRes = a.multiply(b);
        System.out.println("乘法结果：" + mulRes);

        // 除法 divide（只拿商，不拿余数）
        BigInteger divRes = a.divide(b);
        System.out.println("除法商：" + divRes);

        // divideAndRemainder：数组第0位是商，第1位是余数
        BigInteger[] dr = a.divideAndRemainder(b);
        System.out.println("商：" + dr[0] + "，余数：" + dr[1]);

        // equals 比较数值是否相等，不要用 ==
        boolean isSame = a.equals(b);
        System.out.println("a和b数值相等？" + isSame);

        // pow 次方，参数是int类型指数
        BigInteger powRes = a.pow(2);
        System.out.println("a的2次方：" + powRes);

        // max 获取较大值
        BigInteger big = a.max(b);
        System.out.println("较大值：" + big);
        // min 获取较小值
        BigInteger small = a.min(b);
        System.out.println("较小值：" + small);

        // intValue() 转为int，数字太大溢出会出错
        int intNum = a.intValue();
        System.out.println("转int：" + intNum);
    }
}

