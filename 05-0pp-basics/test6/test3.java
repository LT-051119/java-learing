package test6;
/* 定义一个长度为 3 的数组，数组存储 1~3 名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求 3：通过 id 删除学生信息
如果存在，则删除，如果不存在，则提示删除失败。
要求 4：删除完毕之后，遍历所有学生信息。
要求 5：查询数组 id 为 “heima002” 的学生，如果存在，则将他的年龄 + 1 岁 */
public class test3 {
    public static void main(String[] args) {
        //定义数组
        Student [] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);
        Student stu3 = new Student(3,"wangwu",25);
        //添加数组
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
        //要求 3：通过 id 删除学生信息
        //先获取数组索引
        int Index = Index(arr,2);
        System.out.println(Index);
        //如果存在，则删除，如果不存在，则提示删除失败。
        if (Index >= 0) {
            arr[Index] = null;
            printarr(arr);
        }else{
            //不存在，则提示
            System.out.println("该id不存在，删除失败");
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
