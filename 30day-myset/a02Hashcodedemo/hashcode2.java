package a02Hashcodedemo;

import java.util.HashSet;

/* 需求：创建一个存储学生对象的集合，存储多个学生对象。
使用程序实现在控制台遍历该集合。
要求：学生对象的成员变量值相同，我们就认为是同一个对象

String        Integer
*/
public class hashcode2 {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student("zhangsan",11);
        Student s2 = new Student("lisi",12);
        Student s3 = new Student("wangwu",13);
        Student s4 = new Student("zhangsan",11);

        //创建集合
        HashSet<Student>hs = new HashSet<>();
        //添加元素
       System.out.println(hs.add(s1));
       System.out.println(hs.add(s2));
       System.out.println(hs.add(s3));
       System.out.println(hs.add(s4));
       //遍历集合
        System.out.println(hs);
    }
}
