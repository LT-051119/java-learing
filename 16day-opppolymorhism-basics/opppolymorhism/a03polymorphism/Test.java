package a03polymorphism;
/*
根据需求完成代码：
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

4. 定义测试类 (完成以下打印效果)：
keepPet (Dog dog,String somethind) 方法打印内容如下：
年龄为 30 岁的老王养了一只黑颜色的 2 岁的狗 对人的描述
2 岁的黑颜色的狗两只前腿死死的抱住骨头猛吃 对狗的描述

keepPet (Cat cat,String somethind) 方法打印内容如下：
年龄为 25 岁的老李养了一只灰颜色的 3 岁的猫 对人的描述
3 岁的灰颜色的猫眯着眼睛侧着头吃鱼 对猫的描述

5. 思考：
1.Dog 和 Cat 都是 Animal 的子类，以上案例中针对不同的动物，定义了不同的 keepPet 方法，过于繁琐，能否简化，并体会简化后的好处？
2.Dog 和 Cat 虽然都是 Animal 的子类，但是都有其特有方法，能否想办法在 keepPet 中调用特有方法？
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        Person p = new Person("老王",38);
        Dog d = new Dog(3,"灰色");
        Cat c = new Cat(2,"黑色");
        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");
    }
}
