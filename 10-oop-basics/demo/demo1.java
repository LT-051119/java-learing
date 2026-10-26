package demo;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        //1.创建一个数组
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3.删除删除,删除成功返回true
        /*boolean result1 =list.remove("aaa");
        System.out.println(result1);
        boolean result2 = list.remove("bbb");
        System.out.println(result2);
        //删除指定的索引，并返回删除的值
        String str = list.remove(2);
        System.out.println(str);*/

        //4.修改元素,修改指定元素的值，用新的值替换,还会返回被替换的值
        /*String str = list.set(1,"ddd");
        System.out.println(str);*/
        //查询元素,用索引查询返回被查询的值
        String s = list.get(0);
        System.out.println(s);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 为索引
            //list.get(i)获取元素
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println(list);
    }
}
