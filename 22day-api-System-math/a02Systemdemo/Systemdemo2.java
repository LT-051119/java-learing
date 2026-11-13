package a02Systemdemo;

public class Systemdemo2 {
    public static void main(String[] args) {
        //2. public static long currentTimeMillis()      返回当前系统的时间毫秒值形式
        //计数
        long start = System.currentTimeMillis();
        //遍历输出速度
        for (int i = 1; i <= 100000; i++) {
            boolean flag = isPrime2(i);
            if(flag){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //之前的方法624 628 627
        //改进的方法 28 28 27
    }
    //之前的方式
    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //改进之后的方式 --- 效率快
    public static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
