package a02oppabstract;
//使用抽象类：当子类的行为共性，都没有统一的，各异的，使用抽象方法使用，父类的行为便于代码的编写
public class Test {
    public static void main(String[] args) {
        //创建对象
        frog f = new frog("小绿",1);
        System.out.println(f.getName()+", "+f.getAge());
        f.eat();
        f.drink();
    }
}
