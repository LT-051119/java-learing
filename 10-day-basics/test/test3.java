package test;

import java.util.ArrayList;

//需求：定义一个集合，添加字符，并进行遍历
//遍历格式参照：[元素1，元素2，元素3]。
public class test3 {
    public static void main(String[] args) {
        //1.创建对象
        ArrayList<Character>list = new ArrayList<>();
        //2.添加字符
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        //3.打印
        System.out.println(list);
    }

}
