package a05oppinterface;

public class inter implements InterA,InterB{
    //抽象类方法强制重写
    @Override
    public void method() {

    }
    //由于show是默认方法可重写可以不重写
    //但如果使用两个接口，使用接口的方法一样，就必须重写，不然会报错
    @Override
    public void show() {
        System.out.println("默认重写方法");
    }
}
