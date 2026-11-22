package a02Lambdademo;

import java.util.Arrays;

public class lambdademo3 {
    public static void main(String[] args) {
        /*
定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
要求：
按照字符串的长度进行排序，短的在前面，长的在后面。
（暂时不比较字符串里面的内容）
*/
        String[]arr={"aa","aaa","aaaa","a"};

        /*使用Arrays.sort进行排序
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        //把数组转换为字符串
        System.out.println(Arrays.toString(arr));

        //Lambda完整写法
        //先检查Comparator是不是只有一个抽象方法的函数形接口
        Arrays.sort(arr, (String o1, String o2) ->{
                return o2.length() - o1.length();
            }
        );
        */
        //Lambda省略写法
        Arrays.sort(arr, ( o1,  o2) -> o2.length() - o1.length());
        //arr直接打印是地址值，通过toString方法转化为字符串可以直接打印
        System.out.println(Arrays.toString(arr));
    }
}
