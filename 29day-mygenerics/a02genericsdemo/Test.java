package a02genericsdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa","bbb","ccc","ddd");
        System.out.println(list1);


        ArrayList<String>list2 = new ArrayList<>();
        ListUtil.addAll(list2,"卡了","神了","魔了","咕咕嘎嘎");
        System.out.println(list2);
    }
}
