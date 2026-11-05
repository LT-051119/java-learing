package a01oppinterface;
//接口的练习
public class Test {
    public static void main(String[] args) {
        //创建对象
        frog f = new frog("小青",1);
        System.out.println(f.getName()+", "+f.getAge());
        f.eat();
        f.swing();

        Robbit r = new Robbit("小白",2);
        System.out.println(r.getName()+", "+r.getAge());
        r.eat();
    }
}
