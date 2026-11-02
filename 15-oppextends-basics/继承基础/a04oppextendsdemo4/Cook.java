package a04oppextendsdemo4;

//子类
public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, double money) {
        super(id, name, money);
    }

    //由于有继承的父类，get/set方法就可以省略

    //重写方法

    @Override
    public void work() {
        //super.work();不需要复用就注释掉
        System.out.println("工作是炒菜");
    }
}
