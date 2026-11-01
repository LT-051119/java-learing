package test;

import java.util.ArrayList;

//需求：把三个对象存进数组，定义一个方法将低于价格3000的品牌手机信息返回
public class test9 {
    public static void main(String[] args) {
        //创建数组
        ArrayList<Phone>list = new ArrayList<>();
        //创建对象
        Phone p1 = new Phone("苹果",5000);
        Phone p2 = new Phone("小米",2000);
        Phone p3 = new Phone("oppo",1000);
        //存进数组
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //调用方法
        ArrayList<Phone>list1 = getphone(list);
        //遍历验证
        for (int i = 0; i < list1.size(); i++) {
            Phone p = list1.get(i);
            //获取手机信息
            System.out.println(p.getBrand()+", "+p.getPrice()+"元 ");
        }
    }
    //定义方法去判断数组里面手机价格有低于3000
    //需要 ： 数组
    public static ArrayList<Phone> getphone(ArrayList<Phone>list){
        //返回的数据有多个，创建一个新数组去装，返回新数组
        ArrayList<Phone>list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if (p.getPrice()<= 3000) {
                list1.add(p);
            }
        }
    return list1;
    }
}
