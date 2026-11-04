package a02oppfinal.Tset2;
/*
final 修改基本数据类型：记录的值不能发生改变
final 修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的

核心：
    常量记录的数据是不能发生改变的。

字符串是不可变的
*/

public class Test {
    public static void main(String[] args) {
        //被final修饰的全部字母大写
        final double PI = 3.14;

        //创建对象
        final Student S = new Student("zhangsan",20);
        //记录的地址值不能发生改变，内部的属性可以发生改变
        //S = new Student();用S重新new一个对象改变了地址值
        //可以修改里面的属性
        S.setName("lisi");
        S.setAge(18);
        System.out.println(S.getName()+", "+S.getAge());

        //数组，数组是引用数据类型，不能修改地址值
        final int [] ARR = {1,2,3,4,5};
        ARR[0]=10;
        ARR[3]=20;
        //遍历验证
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
