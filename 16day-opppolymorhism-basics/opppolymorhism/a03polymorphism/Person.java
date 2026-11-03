package a03polymorphism;

/*
3. 定义 Person 类 // 饲养员
属性：
姓名，年龄
行为：
keepPet (Dog dog,String something) 方法
功能：喂养宠物狗，something 表示喂养的东西
行为：
keepPet (Cat cat,String something) 方法
功能：喂养宠物猫，something 表示喂养的东西
生成空参有参构造，set 和 get 方法
 */
public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
    行为：
    keepPet (Dog dog,String somet功能：喂养宠物狗，something 表示喂养的东西
    //public void keepPet(Dog dog,String something){
        System.out.println("年龄为 "+getAge()+" 岁的"+getName()+"养了一只"+dog.getColor()+"颜色的 "+dog.getAge()+"岁的狗");
    }
    */
    /*行为：
    keepPet (Cat cat,String something) 方法
    功能：喂养宠物猫，something 表示喂养的东西
    生成空参有参构造，set 和 get 方法
     */
    /*public void keepPet(Cat cat,String something){
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
    }*/
    //多态
    public void keepPet(Animal a ,String something){
        if(a instanceof Cat c){
            System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");
            c.eat(something);
        }else if(a instanceof Dog d){
            System.out.println("年龄为 "+getAge()+" 岁的"+getName()+"养了一只"+a.getColor()+"颜色的 "+a.getAge()+"岁的狗");
            d.eat(something);
        }
    }
}
