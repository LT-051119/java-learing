package a01polymorphism;
//子类
public class Student extends Person{
    @Override
    public void show() {
        //多态需要重写父类的方法
        System.out.println("学生的信息为："+getName()+", "+getAge());
    }
}
