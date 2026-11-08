package a03oppinnerclass;
//成员内部类
//出现调用变量重复名时
public class Test {
    public static void main(String[] args) {
        Outer.Inner oi =new Outer().new Inner();
        oi.show();
    }
}
