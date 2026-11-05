package a05oppinterface;

public interface InterB {
    //默认重写方法
    public default void show(){
        System.out.println("InterB的默认方法");
    }
}
