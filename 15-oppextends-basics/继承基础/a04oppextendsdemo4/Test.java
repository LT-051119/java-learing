package a04oppextendsdemo4;

public class Test {
    public static void main(String[] args) {
        //创建对象管理员
        Manager m = new Manager("018","zhangsan",8000.8,2000.1);
        m.work();
        m.eat();
        System.out.println(m.getId()+", "+m.getName()+", "+m.getMoney()+", "+m.getReward());
        //厨师
        Cook c = new Cook();
        c.setId("099");
        c.setName("lisi");
        c.setMoney(5000.1);
        c.work();
        c.eat();
        System.out.println(c.getId()+", "+c.getName()+", "+c.getMoney());
    }
}
