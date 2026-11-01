package test6;

//要求 5：查询数组 id 为 “2” 的学生，如果存在，则将他的年龄 + 1 岁 */
public class test4 {
    public static void main(String[] args) {
        //定义数组
        Student[] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);
        //添加数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //要求 5：查询数组 id 为 “2” 的学生，如果存在，则将他的年龄 + 1 岁
        //先获取数组索引
        int Index = Index(arr, 2);
        //存在这个id
        if (Index >= 0){
            //获取该索引的信息
            Student stu = arr[Index];
            //获取age +1
            int newAge = stu.getAge() + 1;
            //修改之后存储回去
            stu.setAge(newAge);
            //遍历
            printarr(arr);
        }else {
            //不存在这个id
            System.out.println("不存在这个id，修改失败");
        }
    }
    //获取数组索引需要知道 数组 id
    public static int Index (Student[]arr , int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu =arr[i];
            if (stu != null && stu.getId() == id) {
                return  i;
            }
        }
        return -1;
    }
    public static void printarr(Student[]arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getAge()+","+ stu.getId()+","+stu.getName());
            }
        }
    }
}