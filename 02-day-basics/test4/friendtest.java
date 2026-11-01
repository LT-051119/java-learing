package test4;

public class friendtest {
    public static void main(String[] args) {
        //创建对象
        //无参的获取，虚拟机会自动给无参赋值为默认值
        //friend f = new friend();
        friend f = new friend("奶龙",18);
        System.out.println(f.getName());
        System.out.println(f.getAge());

    }
}
