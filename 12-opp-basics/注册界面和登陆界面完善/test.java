import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        getcode();
    }
    public static String getcode() {
        //验证码
        //Character -> char
        //1.添加英文大小写
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));//每次计算'a'+0=数字，需要强转
            list.add((char)('A'+i));
        }
        //2.随机拼接英文大小写
        //StringBuilder创建这个方法为了拼接字符串
        StringBuilder sb = new StringBuilder();
        //抽取list中4个随机元素
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
           //获取随机索引
           int Index = r.nextInt(list.size());
           //通过生成的随机索引去list里面获取相对应的元素
           char c = list.get(Index);
           //拼接字符串
           sb.append(c);
        }
        //3.添加数字
        //获取随机数
        int c = r.nextInt(10);
        //添加到最后一位索引
        sb.append(c);
        System.out.println(sb);
        //4.让数字可以出现到任意位置
        //思路：让5位索引去填充4位索引，填充的4个索引只要数字索引进入，就可以实现数字任意位置
        //修改字符串内容，要重新创建一个字符新数组
        char [] arr = sb.toString().toCharArray();
        //把随机索引去替换
        int RandomIndex = r.nextInt(arr.length);
        //记录随机索引
        //拿最后一位索引跟随机索引交换位置
        char temp = arr[RandomIndex];
        arr[RandomIndex] = arr[ arr.length - 1 ];
        arr[arr.length -1] = temp;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    return new String(arr);
    }
}
