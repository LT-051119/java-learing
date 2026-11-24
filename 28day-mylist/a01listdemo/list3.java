package a01listdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
迭代器遍历：在遍历的过程中需要删除元素，请使用迭代器。
列表迭代器：在遍历的过程中需要添加元素，请使用列表迭代器。
增强for遍历：仅仅想遍历，那么使用增强for或Lambda表达式。
Lambda表达式：仅仅想遍历，那么使用增强for或Lambda表达式。
普通for：如果遍历的时候想操作索引，可以用普通for。
*/
public class list3 {
    public static void main(String[] args) {
        /*
List系列集合的五种遍历方式：
    1.迭代器
    2.列表迭代器
    3.增强for
    4.Lambda表达式
    5.普通for循环
*/
        //创建集合
        List<String>list=new ArrayList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        /*1.迭代器
        Iterator<String> it =list.iterator();//创建一个指针
        //it.hasnext()对当前位置进行判断，值是否存在
        while (it.hasNext()){
            String str = it.next();//返回遍历的值
            System.out.println(str);
        }
        */
        /*2.增强for
        for (String s : list) {
            System.out.println(s);
        }*/
        /*3.Lambda
        list.forEach( s-> System.out.println(s));//s为遍历的元素)*/
        /*4.普通for循环
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }*/
        //5.列表迭代器
        ListIterator<String> it =list.listIterator();
        while (it.hasNext()){
            String str = it.next();
            if ("ccc".equals(str)) {
                it.add("ddd");
            }
        }
        System.out.println(list);
    }
}
