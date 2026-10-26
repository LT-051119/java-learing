package test;
//需求：定义一个集合，添加字符串，并进行遍历
//遍历格式参照：[元素1，元素2，元素3]。
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //1.创建一个数组
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("点赞了吗？");
        list.add("收藏了吗？");
        list.add("投币了吗？");
        list.add("转发了吗？");
        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //i为索引
            //list.get(i)
            if (i == list.size()-1) {
                String s = list.get(i);
                System.out.print(s);
            }else {
                String s = list.get(i);
                System.out.print(s + ", ");
            }
        }
        System.out.println("]");
    }
}
