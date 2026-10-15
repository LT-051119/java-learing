package test5;

public class Girlfriendtest {
    public static void main(String[] args) {
        //定义数组
        Girlfriend[] arr = new Girlfriend[4];
        //创建对象
        Girlfriend gf1 = new Girlfriend("奶龙", 18, "女", "滑铲");
        Girlfriend gf2 = new Girlfriend("奶蛙", 21, "女", "飞踢");
        Girlfriend gf3 = new Girlfriend("奶鼠", 20, "女", "奔跑");
        Girlfriend gf4 = new Girlfriend("奶康", 19, "女", "同龄人");
        //把对象添加进数组
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        //用循环求和
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            //gf有很多个，要统一,就把gf1-gf4再赋值给gf
            Girlfriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        System.out.println(sum);
        int avg = sum/ arr.length;
        int count = 0;
        //统计和打印满足条件的信息
        for (int i = 0; i < arr.length; i++) {
            Girlfriend gf = arr[i];
            if (gf.getAge()<avg){
                count++;
                System.out.println(gf.getAge()+","+gf.getName()+","+gf.getGender()+","+gf.getHobby());
            }
        }
    }
}