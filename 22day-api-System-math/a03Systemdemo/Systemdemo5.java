package a03Systemdemo;

public class Systemdemo5 {
    public static void main(String[] args) {
        /*public boolean equals(Object obj)    比较两个对象是否相等*/

        //由于是new出来的两个参数，地址值不一样，比较里面的属性需要使用object重写的方法
        //由于Student没有继承的对象，会默认的继承object,object里面的方法可以比较new类型（） 这种引用数据类型里面的属性
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);
        System.out.println(s1.equals(s2));
    }
}
