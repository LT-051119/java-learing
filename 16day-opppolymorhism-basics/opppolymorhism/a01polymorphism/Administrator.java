package a01polymorphism;
//子类
public class Administrator extends Person{
    @Override
    public void show() {
        //重写方法多态的条件
        System.out.println("管理员的信息："+getName()+", "+getAge());
    }
}
