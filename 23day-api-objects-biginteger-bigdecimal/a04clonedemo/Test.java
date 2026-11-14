package a04clonedemo;
//浅克隆：1. 基本数据类型（int、String 等）：浅克隆直接复制值，互不影响
//2. 引用类型（自定义对象、数组）：浅克隆只复制地址，指向同一个对象，一改全改
//浅克隆：只复制对象本身，对象里面的引用类型成员，共用同一个对象
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原始数组
        int[] scoreArr = {80, 90, 100};
        // 创建原始学生对象s1
        Student s1 = new Student(18, "张三", scoreArr);

        // 调用clone，浅克隆得到s2
        Student s2 = (Student) s1.clone();

        System.out.println("==== 修改前 ====");
        System.out.println("s1 age=" + s1.getAge() + ", name=" + s1.getName() + ", scores[0]=" + s1.getScores()[0] );
        System.out.println("s2 age=" + s2.getAge() + ", name=" + s2.getName() + ", scores[0]=" + s2.getScores()[0] );

        // 修改s2里面的数据，观察浅克隆现象
        s2.setAge(20);                // 修改基本类型age：age是值拷贝，互不影响
        s2.setName("李四");           // 修改String：String不可变，会指向新字符串，s1不受影响
        s2.getScores()[0] = 999;     // 修改数组元素：数组是同一个引用！s1的数组也跟着变

        System.out.println("\n==== 修改s2之后（浅克隆） ====");
        System.out.println("s1 age=" + s1.getAge() + ", name=" + s1.getName() + ", scores[0]=" + s1.getScores()[0] );
        System.out.println("s2 age=" + s2.getAge() + ", name=" + s2.getName() + ", scores[0]=" + s2.getScores()[0] );
    }
}
