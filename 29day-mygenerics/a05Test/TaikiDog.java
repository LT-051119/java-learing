package a05Test;

public class TaikiDog extends Dog{
    public TaikiDog() {
    }

    public TaikiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
