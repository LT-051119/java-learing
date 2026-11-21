package a01searchTest;
//基本查找/顺序查找
public class Test {
    public static void main(String[] args) {
        int [] arr={1,11,23,45,67,89,192,234,45};
        boolean flag=insert(arr,111);
        System.out.println(flag);
    }
    public static boolean insert(int[]arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
