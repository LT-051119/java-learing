package a06oppinnerclass;

/*匿名内部类，整个整体为一个对象{}里面的为没名字的类
     new swim/或者类名(){
     重写的方法
     };
 */
public class Test {
    public static void main(String[] args) {
        //是接口的话，后面{}里面的内容和new swim()是实现关系
        new swim(){
            @Override
            public void show() {
            System.out.println("重写游泳方法");
            }
        };
        //是类名，{}里面和new Animal是继承关系
        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写吃东西方法");
            }
        };

        //在以前使用新类，要重新定义一个类，现在可以使用匿名内部类
        //把new Animal(){}当作参数，同时也成为了Animal的子类对象了。
        //{}里面的内容和new Animal 是继承关系，
         method(
                 new Animal() {
                     @Override
                     public void eat() {
                         System.out.println("狗啃骨头");
                     }
                 }
        );
    }
    public static void method(Animal a){ //Animal a = 子类对象为多态了
        a.eat();//编译看左边，运行看右边
    }
}
