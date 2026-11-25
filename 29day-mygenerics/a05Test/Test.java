package a05Test;
/*
需求：
定义一个继承结构：
                动物
          |              |
          猫              狗
        |    |          |    |
    波斯猫  狸花猫    泰迪  哈士奇

属性：名字，年龄
行为：吃东西
波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家

测试类中定义一个方法用于饲养动物
public static void keepPet(ArrayList<???> list){
    //遍历集合，调用动物的eat方法
}

要求1：该方法能养所有品种的猫，但是不能养狗
要求2：该方法能养所有品种的狗，但是不能养猫
要求3：该方法能养所有的动物，但是不能传递其他类型
*/

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建数组
        ArrayList<persinaCat>list1 = new ArrayList<>();
        ArrayList<LiHuaCat>list2 = new ArrayList<>();
        ArrayList<TaikiDog>list3 = new ArrayList<>();
        ArrayList<HuaskyDog>list4 = new ArrayList<>();
        //创建对象，添加进数组
        list1.add(new persinaCat("波斯猫",2));
        list2.add(new LiHuaCat("狸花猫",3));
        list3.add(new TaikiDog("泰迪",4));
        list4.add(new HuaskyDog("哈士奇",5));
        //传递参数
        method3(list1);
        method3(list2);
        method3(list3);
        method3(list4);
    }
    //要求1：该方法能养所有品种的猫，但是不能养狗
    //public static void method1(ArrayList<? extends Cat>list){}
    //要求2：该方法能养所有品种的狗，但是不能养猫
    //public static void method2(ArrayList<? extends Dog>list){}
    //要求3：该方法能养所有的动物，但是不能传递其他类型
    public static void method3(ArrayList<? extends Animal >list){
        //遍历所有动物
        for(Animal a : list){
            a.eat();
        }
    }
}
