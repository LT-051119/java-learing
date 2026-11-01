package test3;
//封装私有化
public class Girlfriendtest {
    public static void main(String[] args) {
        //创建对象
        Girlfriend g = new Girlfriend();

        //给对象属性赋值，变量名.set（）赋值
        g.setname("奶龙");
         g.setAge(18);
        g.setGender("女");

        //验证属性g.get（）打印值
        System.out.println(g.getname());
        System.out.println(g.getGender());
        System.out.println(g.getAge());

        //调用对象行为（方法）
        g.sleep();
        g.eat();
        g.Running();
    }
}
