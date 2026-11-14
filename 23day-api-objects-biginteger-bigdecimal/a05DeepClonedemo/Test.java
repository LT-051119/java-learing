package a05DeepClonedemo;
//类先连接Cloneable接口
//使用条件深克隆：只要是可变引用类型，浅克隆共享内层对象，原地修改内层数据就会互相干扰。
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原始数组
        int[] scoreArr = {80, 90, 100};
        // 创建原对象
        Student s1 = new Student(18, "张三", scoreArr);
        // 深克隆得到s2
        Student s2 = (Student) s1.clone();
        System.out.println("==== 修改前 ====");
        System.out.println("s1 age=" + s1.getAge() + ", name=" + s1.getName() + ", scores[0]=" + s1.getScores()[0]);
        System.out.println("s2 age=" + s2.getAge() + ", name=" + s2.getName() + ", scores[0]=" + s2.getScores()[0]);
         // 修改克隆出来的s2的数据
        s2.setAge(20);
        s2.setName("李四");
        s2.getScores()[0] = 999; // 修改s2里面数组的元素
         System.out.println("\n==== 修改s2之后（深克隆） ====");
         System.out.println("s1 age=" + s1.getAge() + ", name=" + s1.getName() + ", scores[0]=" + s1.getScores()[0]);
         System.out.println("s2 age=" + s2.getAge() + ", name=" + s2.getName() + ", scores[0]=" + s2.getScores()[0]);}
}

