package a01oppabstract;
//抽象类的子类，重写抽象类所有抽象方法
public class Student extends Person{
    @Override
    public void work() {
        System.out.println("学生在写作业");
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

}
