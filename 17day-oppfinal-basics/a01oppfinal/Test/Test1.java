package a01oppfinal.Test;
/*
1. final 修饰方法：最终方法，不能被子类重写
2. final 修饰类：最终类，不能被继承
3. final 修饰变量：常量，只能赋值一次，赋值后不可修改
 */
public class Test1 {
    public static void main(String[] args) {
        final int a = 1;
        System.out.println(a);
        //a不能被再次赋值，被final修饰的情况下赋值变成了常量
        //int b=2 a =b;这种写法错误
    }
}
