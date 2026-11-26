package a02Hashcodedemo;

import java.util.LinkedHashSet;
//LinkHashset,存储有序，无索引，无重复
public class LinkedHashcode {
    public static void main(String[] args) {
        //1.创建4个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        //2.创建集合
        LinkedHashSet<Student>lhs = new LinkedHashSet<>();
        //添加元素/返回值是boolean
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //遍历
        System.out.println(lhs);
    }
}
