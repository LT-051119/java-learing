package a02Systemdemo;

public class Systemdemo3 {
    public static void main(String[] args) {
//public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数) 数组拷贝
//细节：
/*1. 如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
//2. 在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
//3. 如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型（需要强转）

        int [] arr = {1,2,3,4,5,6,7,8,9};
        double [] arr1 = new double [5];
        System.arraycopy(arr,0,arr1,0,5);*/
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student [] arr = {s1,s2,s3};
        person []arr1 = new person[3];
        System.arraycopy(arr,0,arr1,0,3);
        for (int i = 0; i < arr1.length; i++) {
            //实行强转
            Student p = (Student) arr1[i];
            System.out.println(p.getName()+", "+p.getAge());
        }
    }
}
    class person{
        private String name;
        private int age;

        public person() {
        }

        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    class Student extends person{
        public Student() {
        }

        public Student(String name, int age) {
            super(name, age);
        }
}
