package a01treesetdemo1;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {

        //创建集合
        TreeSet<Integer> ts = new TreeSet<>();
        //添加元素
        ts.add(3);
        ts.add(4);
        ts.add(1);
        ts.add(2);
        ts.add(5);
        //遍历集合
        System.out.println(ts);
        //迭代器
        //创建一个指针
        Iterator<Integer>it= ts.iterator();
        //it.hasNext()判断
        while (it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        //增强for
        for(int i : ts){
            System.out.println(i);
        }
        //lambda
        ts.forEach(i-> {System.out.println(i);});
    }
}
