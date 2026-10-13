package test2;

public class Girlfriendtest {
    public static void main(String[] args) {
        //创建对象
        Girlfriend g = new Girlfriend();

        //给对象属性赋值
        g.name = "奶龙";
        g.gender = "耍起";
        g.age = 2000;

        //验证属性
        System.out.println(g.name);
        System.out.println(g.gender);
        System.out.println(g.age);

        //调用对象行为（方法）
        g.sleep();
        g.eat();
        g.Running();
    }
}
