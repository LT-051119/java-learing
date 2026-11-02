package a02oppextnedsdemo2;

public class Chinisedog extends Dog {
    //需要重写一个方法，父类的方法无法满足子类
    //写出需要重写的方法名，回车就行
    //这个类只需要重新不需要复用父类方法里面的方法，就不需要super.eat。super是直接调用父类
    @Override
    public void eat() {
        System.out.println("中华田园犬吃剩饭");
    }
}
