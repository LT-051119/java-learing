package test6;
/* 定义一个长度为 3 的数组，数组存储 1~3 名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求 1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求 2：添加完毕之后，遍历所有学生信息。*/
public class test2 {
    public static void main(String[] args) {
        //1.定义数组
        Student [] arr = new Student[3];
        //1.2创建对象
        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);

        //1.3添加对象进数组
        arr[0]= stu1;
        arr[1]= stu2;

        //2.再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //2.1因为我要添加一个学生对象有不确定性，先判断是不是数组里面有这个元素，还有数组会不会已经满了。
        Student stu4 = new Student(4,"liliu",26);
        boolean flag = contians(arr,stu4.getId());
        //判断我元素里面有没有这个元素
        if(flag){
            //已存在不用添加
            System.out.println("数组里面有这个id元素，请重新添加");
            //没有这个元素，再来判断这个数组有多少，有没有装满
        } else{
            int count = getnumber(arr);
            //装满了新数组 =arr.length + 1
            if( count == arr.length){
                Student [] newarr = newarr(arr);
                newarr[count] = stu4;
                //要求 2：添加完毕之后，遍历所有学生信息
                printarr(newarr);
            }else {
                //没有装满，直接添加就行，count总数就是索引数
                arr[count] = stu4;
                //要求 2：添加完毕之后，遍历所有学生信息
                printarr(arr);
            }
        }
        //要求 2：添加完毕之后，遍历所有学生信息

    }
    //方法判断数组数组里面有没有这个元素，需要知道我要判断什么，需要id和数组
    public  static boolean contians(Student []arr,int id) {
        //判断老数组有没有这个元素
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if(sid==id){
                    return true;
                }
            }
        }
        return false;
    }
    //再用方法来进行判断数组里面的元素数量
    public static int getnumber(Student[]arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != null) {
                count++;
            }
        }
        return count;
    }
    //假如数组已经满员了，添加一个新数组 = 老数组 + 1
    public static Student [] newarr(Student[]arr){
        Student [] newarr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newarr[i]=arr[i];
        }
        return newarr;
    }
    //数组数量有两种状态，需要两次打印信息
    public static void printarr(Student[]arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            System.out.println(stu.getAge()+","+ stu.getId()+","+stu.getName());
        }
    }
}
