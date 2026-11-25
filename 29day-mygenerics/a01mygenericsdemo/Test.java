package a01mygenericsdemo;

public class Test {
    public static void main(String[] args) {
        //String传参给E
        MyArrayList<String>list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String str= list.get(0);
        System.out.println(str);
        System.out.println(list);
    }
}
