package a02searchTest;

public class Test {
    public static void main(String[] args) {
        //二分查找/折半查找
//核心:
//每次排除一半的查找范围

//需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
//数据如下：{7，23，79，81，103，127，131，147}
        int [] arr = {7,23,79,81,103,127,131,147};
        System.out.println(SearchGet(arr,147));
    }
    public static int SearchGet(int []arr,int number){
        int max = arr.length-1;
        int min = 0;
        int mid = (max + min) /2;
        while (true) {
            if (min > max) {
                //该数字不存在
                return -1;
            } else if (arr[mid] > number) {
                //1.mid在number右边，max = mid-1
                max = mid - 1;
                mid = (max + min)/2;
            } else if (arr[mid] < number) {
                //2.mid在number左边，min = mid +1
                min = mid + 1;
                mid = (max + min)/2;
            }
            //3.arr[mid] = number
            else {
                return mid;
            }
        }
    }
}
