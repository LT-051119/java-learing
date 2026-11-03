package a03polymorphism;
/*
2. 定义猫类
属性：
年龄，颜色
行为：
eat (String something) 方法 (something 表示吃的东西)
逮老鼠 catchMouse 方法 (无参数)
 */
public class Cat extends Animal {
    public Cat() {
    }
    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String somthing) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着头吃"+somthing);
    }
    public void CatchMouse(){
        System.out.println("猫抓老鼠");
    }
}
