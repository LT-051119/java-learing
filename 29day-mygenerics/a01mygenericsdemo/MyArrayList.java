package a01mygenericsdemo;

import java.util.Arrays;

//泛型类
public class MyArrayList <E>{
    /*
     当我在编写一个类的时候，如果不确定类型，那么这个类就可以定义泛型类
     */
    Object [] obj = new Object[10];
    int size;
    /*
    E : 表示是不确定的类型。该类型在类名后面已经定义过了。
    e: 形参的名字，变量
    * */
    public boolean add(E e){
        //添加元素，size默认为0，也就是从0开始添加
        obj[size]=e;
        size++;
        return true;
    }
    //获取元素索引
    public E get(int index){
        return (E)obj[index];
    }
    //返回字符串
    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
