package a02oppextnedsdemo2;

public class Shapi extends Dog{
    @Override
    public void eat() {
        super.eat();//当前需求有父类方法，就直接super调用
        System.out.println("沙皮狗在啃骨头");
    }
}
