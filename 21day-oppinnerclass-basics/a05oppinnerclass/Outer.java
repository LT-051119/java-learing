package a05oppinnerclass;
/*
局部内部类
1.将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量。
2.外界是无法直接使用局部内部类，需要在方法内部创建对象并使用。
3.该类可以直接访问外部类的成员，也可以访问方法内的局部变量。 */

//调用show方法，让代码执行

public class Outer {
    int b = 20;

    public void show() {
        int a = 10;

        //局部内部类
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }

        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();

    }
}
