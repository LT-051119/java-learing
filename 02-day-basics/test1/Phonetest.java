package test1;

public class Phonetest {
    public static void main(String[] args) {
        //创建手机对象
        //类名 对象名 = new 类名();
        Phone p = new Phone();

        //给对象属性赋值(对象名.对象属性=p.brand)
        p.brand = "小米";
        p.price = 1999.9;

        //验证赋值的结果
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用对象的行为（方法）
        //对象名.方法名=p.Playgame();
        p.Playgame();
        p.call();

        System.out.println("---------------");
        //定义第二个手机
        Phone p2 = new Phone();

        p2.brand = "苹果";
        p2.price = 8999;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.Playgame();
        p2.call();
    }
}
