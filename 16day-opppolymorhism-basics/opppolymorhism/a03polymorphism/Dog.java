package a03polymorphism;
/*1. 定义狗类
属性：
年龄，颜色
行为：
eat (String something)(
看家 lookHome 方法 (无参数)*/
//子类
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    //get/set继承父类，不用再写
    @Override
    public void eat(String something) {
        //不复用直接注释掉super.eat();
    System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
