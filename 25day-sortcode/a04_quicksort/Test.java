package a04_quicksort;
/*快速排序：
第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
比基准数小的全部在左边，比基准数大的全部在右边。
后面以此类推。*/
public class Test {
    public static void main(String[] args) {
        int []arr = {6,1,2,7,9,3,4,5,10,8};
        quicksort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    /*
     * 参数一：我们要排序的数组
     * 参数二：要排序数组的起始索引
     * 参数三：要排序数组的结束索引
     **/
    public static void  quicksort(int[] arr, int i, int j){
        if(i > j ){
            return;
        }
        int start = i;
        int end = j;
        int basenumber = arr[i];

        while (start != end){
            //end从后面查找比基准数小的
            while (true){
                if (end <= start || arr[end]<basenumber ) {
                break;
                }else {
                end--;
                }
            }
            //start从前面查找比基准数大的
            while (true){
                if (end<=start || arr[start]>basenumber){
                    break;
                }else {
                    start++;
                }
            }
            //当end和start都找到了，刚好都停下了循环，交换互相的值
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            }
        //当全部找完之后上面这个循环才会停止，进行基准数归位
        //也就是当start=end,循环停止
        // 当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;
        quicksort(arr,i,start-1);
        quicksort(arr,start+1,j);
        }
    }
