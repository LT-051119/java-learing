package a01polymorphism;
//子类
public class Teacher extends Person{
    @Override
    public void show() {
        //使用多态需要重写方法
        System.out.println("老师的信息为："+getName()+", "+getAge());
    }
}
