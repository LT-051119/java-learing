package a02Systemdemo;

public class Systemdemo1 {
    public static void main(String[] args) {

    /*都是静态类型的方法，直接System.方法就可以直接调用了
1. public static void exit(int status)        终止当前运行的 Java 虚拟机
//状态码：
//0：表示当前虚拟机是正常停止
//非0：表示当前虚拟机异常停止
        System.exit(0);
2. public static long currentTimeMillis()      返回当前系统的时间毫秒值形式
3. public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)    数组拷贝
*/
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,0,5);//[1,2,3,4,5,0,0,0,0,0]
        for (int i = 0; i < arr2.length; i++) {
             System.out.print(arr2[i]+ " ");
        }
        //打印指定的格式0 0 0 0 1 2 3 0
        int [] arr3 = new int[8];
        System.arraycopy(arr1,0,arr3,4,3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]+ " ");
        }
    }

}