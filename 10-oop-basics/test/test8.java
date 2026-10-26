package test;

import java.util.ArrayList;

/*需求：合并test6和test7的需求
1，main方法中定义一个集合，存入三个用户对象。
用户属性为：id，username，password
2，要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回索引
如果不存在，返回-1
如果存在，返回true
如果不存在，返回false*/
public class test8 {
    public static void main(String[] args) {
        //创建一个数组
        ArrayList<User> list = new ArrayList<>();
        //创建三个对象
        User u1 = new User("heima001","zhangsan","18");
        User u2 = new User("heima002","lisi","19");
        User u3 = new User("heima003","wangwu","20");
        //把对象加入数组
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //调用方法
        int number = getIndex(list,"heima001");
        System.out.println(number);
        boolean flag =getUser(list,"heima001");
        System.out.println(flag);
    }
    //定义方法，需要知道id，数组，还要返回值
    public static boolean getUser(ArrayList<User>list,String id){
        /*for (int i = 0; i < list.size(); i++) {
            //获取索引
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, id)>=0;
    }
    //定义方法，需要id,数组，还要返回索引
    public static int getIndex(ArrayList<User>list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
