package a01Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class collectiondemo2 {
    public static void main(String[] args) {
        //创建集合使用多态，用Student自定义类去测试
        Collection<Student>list=new ArrayList<>();

        //创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        //添加对象进集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Student s4 = new Student("zhangsan",23);
        //判断自定义类的时候需要重写自定义类里面的equals方法
//因为contains方法在底层依赖equals方法判断对象是否一致的。
//如果存的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，而Object类中equals方法，依赖地址值进行判断。
//需求：如果同姓名和同年龄，就认为是同一个学生。
//所以，需要在自定义的Javabean类中，重写equals方法就可以了。
        System.out.println(list.contains(s4));
    }
}
