package a03MyArrayListdemo;

public class Test {
    /*
泛型接口的两种使用方式：
1.实现类给出具体的类型
2.实现类延续泛型，创建实现类对象时再确定类型
*/
    public static void main(String[] args) {
        //1.实现类给出具体的类型,由于泛型类接口，先定义了类型，使用MyArraylist只能使用String.
        MyArrayList1 list =  new  MyArrayList1();
        list.add("aaa");
        //2.实现类延续泛型，创建实现类对象时再确定类型,只有我来使用这个MyArrayList2,由我自己去定义，接口也会跟着变化
        MyArrayList2<Integer>list2 = new MyArrayList2<>();
        list2.add(111);
    }
}
