package a02oppinnerclass;

public class Test {
    /*
编写成员内部类的注意点：
1.成员内部类可以被一些修饰符所修饰，比如： private，默认，protected
2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静

获取成员内部类对象的两种方式：
方式一：外部类编写方法，对外提供内部类对象
方式二：直接创建
格式：外部类名.内部类名 对象名 = 外部类对象.new 内部类对象;
范例：Outer.Inner oi = new Outer().new Inner();
*/

//创建对象的方式：
//类名 对象名 = new 类名（）;
//Student s = new Student();

//我要创建的是谁的对象？
//内部类的对象

// Outer.Inner oi = new Outer().new Inner();
//当内部类是private私有化 不能直接创建对象去调用，要么修改内部类的privat
    //或者在外部类创建一个方法去调用方法
    Outer o = new Outer();
    Object oi = o.getInstance();
}
