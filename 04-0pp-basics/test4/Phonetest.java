package test4;
public class Phonetest{
    public static void main(String[] args) {
        // 定义数组，存储3个Phone对象
        Phone[]arr = new Phone[3];
        // 创建手机对象
        Phone p1 = new Phone("华为", 4999, "黑色");
        Phone p2= new Phone("小米", 3299, "蓝色");
        Phone p3= new Phone("苹果", 5999, "白色");
        //放入数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //循环求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = (int)(sum + phone.getPrice());
        }
        int avg = sum/ arr.length;
        System.out.println(avg);
    }
}
