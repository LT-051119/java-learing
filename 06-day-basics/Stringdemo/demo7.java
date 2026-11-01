package Stringdemo;
/*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
例如：
数组为 int [] arr = {1,2,3};
执行方法后的输出结果为：[1, 2, 3]*/

public class demo7 {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        Tostring(arr);
    }
    //定义一个方法
    public static String Tostring(int[]arr){
        //如果arr数组是空值
        if (arr == null) {
            return "";
        }

        //如果是空数组
        if (arr.length == 0) {
            return "[]";
        }

        //数组正常，执行方法后的输出结果为：[1, 2, 3]
        String str = "[";
        String result = "]";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1 ) {
                str = str + arr[i];
            }else {
                str = str + arr[i] + " , ";
            }
        }
        result = str + result;
        System.out.println(result);
    return "";
    }
}
