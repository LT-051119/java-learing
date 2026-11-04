package a01oppabstract;
//抽象类不能创建对象
//抽象类中不一定有抽象方法，有抽象方法的一定是抽象类
//抽象类可以有构造方法
//抽象类的子类：一般是重写抽象类中的的所有抽象方法
public class Test {
    public static void main(String[] args) {
        //创建对象，使用子类
        Student s = new Student("zhangsan",20);
        //打印
        System.out.println(s.getName()+", "+s.getAge());
    }
}
