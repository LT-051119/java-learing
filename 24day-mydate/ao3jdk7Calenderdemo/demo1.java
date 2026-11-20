package ao3jdk7Calenderdemo;
import java.util.Calendar;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        /*
        public static Calendar getInstance()        获取当前时间的日历对象
        public final Date getTime()                  获取日期对象
        public final setTime(Date date)             给日历设置日期对象
        public long getTimeInMillis()                拿到时间毫秒值
        public void setTimeInMillis(long millis)    给日历设置时间毫秒值
        public int get(int field)                   取日期中的某个字段信息
        public void set(int field,int value)         修改日历的某个字段信息
        public void add(int field,int amount)        为某个字段增加/减少指定的值
        */

        // 1.获取当前时间的日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println("原始日历：" + cal);

        // 2.getTime()：把Calendar转成Date日期对象
        Date date = cal.getTime();
        System.out.println("getTime得到Date：" + date);

        // 3.setTime(Date date)：用Date对象设置日历时间
        Date newDate = new Date(0L);
        cal.setTime(newDate);
        System.out.println("setTime之后日历：" + cal.getTime());

        // 4.getTimeInMillis()：获取日历对应的毫秒值
        long millis = cal.getTimeInMillis();
        System.out.println("getTimeInMillis毫秒值：" + millis);

        // 5.setTimeInMillis(long millis)：用毫秒值设置日历
        cal.setTimeInMillis(1000L * 60 * 60 * 24);
        System.out.println("setTimeInMillis之后：" + cal.getTime());

        // 6.get(int field)：获取单独字段（注意：月份从0开始！0代表1月）
        cal = Calendar.getInstance(); // 重置回当前时间
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // +1才是我们正常看到的月份
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("get获取：" + year + "年" + month + "月" + day + "日");

        // 7.set(int field,int value)：单独修改某个字段
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, 10); // 10代表11月
        cal.set(Calendar.DAY_OF_MONTH, 11);
        System.out.println("set修改后：" + cal.getTime());

        // 8.add(int field,int amount)：增减字段，自动进位
        cal.add(Calendar.YEAR, 2); // 年份+2
        cal.add(Calendar.DAY_OF_MONTH, -5); // 日期-5
        System.out.println("add增减之后：" + cal.getTime());
    }
}
