package test;

import java.util.ArrayList;
import java.util.Scanner;

//键盘录入创建学生对象，最再遍历
public class test5 {
    public static void main(String[] args) {
        //1.创建数组
        ArrayList<Student>list = new ArrayList<>();
        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        //这里的i<3,不用list.size(),是因为刚开始没有数组元素填充，会默认为0的长度，导致键盘元素存不进去
        for (int i = 0; i <3; i++) {
            Student s = new Student();
            System.out.println("请输入姓名");
            String name =sc.next();
            System.out.println("请输入年龄");
            int  age = sc.nextInt();
            //存进对象里面
            s.setName(name);
            s.setAge(age);
            //存进数组中
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            //list.get(i)获取元素
            Student stu = list.get(i);
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }
}
