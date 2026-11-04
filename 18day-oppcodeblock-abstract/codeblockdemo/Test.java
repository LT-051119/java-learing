package codeblockdemo;
//静态构造：使用时机在数据初始化之前
//例如可以在学生管理系统中提前添加一个人员
//ArrayList<Student>list = new ArrayList<>();
//list.add(Student s = new Student(人员属性具体信息))
public class Test {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();

        Student s2 = new Student("zhangsan",20);
    }
}
