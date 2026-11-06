package a01oppinnerclass;
/*
需求：写一个 Javabean 类描述汽车。
属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限。

内部类的访问特点：
内部类可以直接访问外部类的成员，包括私有
外部类要访问内部类的成员，必须创建对象
 */
public class Car {
     String brand;
     int CarAge;
     String color;
     //private String brand;
    public void show1(){
        System.out.println(brand);
        //在外部类创建对象
        //Engine e = new Engine();
        //System.out.println(e.EngineBrand);
    }

     public class Engine{
         String EngineBrand;
         int EngineAge;
         public void show2(){
             System.out.println(color);
             //内部类方法可以直接调用外部类成员，不管是不是private私有类
             //System.out.println(brand);
             System.out.println(EngineBrand);

         }
     }
}
