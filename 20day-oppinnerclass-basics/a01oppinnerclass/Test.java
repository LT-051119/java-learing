package a01oppinnerclass;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //调用内部类需要创建对象
        Car c = new Car();
        c.brand="宾利";
        c.CarAge=10;
        c.color="Red";
        c.show1();
        //调用内部类
        Car.Engine e = c.new Engine();
        e.EngineBrand="xiaomi";
        e.show2();
    }
}
