package a01jdkdatedemo1;
import java.util.Date;
import java.util.Random;

public class dateTest {
    public static void main(String[] args) {
        // 需求1：打印时间原点开始一年之后的时间
        printOneYearAfterOrigin();

        // 需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        compareTwoDate();
    }

    /*
     * 打印时间原点（1970-01-01）往后一年的时间
     */
    public static void printOneYearAfterOrigin() {
        // 1.创建对象，表示时间原点
        Date d1 = new Date(0L);
        // 2.获取d1时间的毫秒值
        long time = d1.getTime();
        // 3.增加一年的毫秒值（不考虑闰年）
        time = time + 1000L * 60 * 60 * 24 * 365;
        // 4.把计算后的毫秒值设置回d1
        d1.setTime(time);
        // 5.打印
        System.out.println("时间原点一年后：" + d1);
    }

    /*
     * 随机生成两个Date，比较时间先后
     */
    public static void compareTwoDate() {
        Random r = new Random();
        // 创建两个时间对象
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if (time1 > time2) {
            System.out.println("第一个时间在后面，第二个时间在前面");
        } else if (time1 < time2) {
            System.out.println("第二个时间在后面，第一个时间在前面");
        } else {
            System.out.println("两个时间一样");
        }
    }
}

