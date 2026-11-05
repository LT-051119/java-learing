package a01oppinterface;
//使用接口的时候，也要重写接口中的方法
public class frog extends Animal implements Swim{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swing() {
        System.out.println("青蛙会游泳");
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃昆虫");
    }
}
