package a02polymorhism;
//子类
public class Dog extends Animal{
    @Override
    public void eat() {
        //重写方法，多态需要满足这点
        System.out.println("狗啃骨头");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
