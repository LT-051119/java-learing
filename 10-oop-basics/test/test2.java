package test;
//需求：定义一个集合，添加数字，并进行遍历
//遍历格式参照：[元素1，元素2，元素3]。
import java.util.ArrayList;

//基本数据类型创建数组，不能直接使用 int这种类型，需要包装，int->Integer ,char->Character,其他的类型把首字母换成大写就行
public class test2 {
    public static void main(String[] args) {
        //1.创建对象
        ArrayList<Integer>list = new ArrayList<>();
        //2.添加数字
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //list.get(i)为获取元素
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
