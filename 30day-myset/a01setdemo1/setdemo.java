package a01setdemo1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class setdemo {
    /*
利用Set系列的集合，添加字符串，并使用多种方式遍历。
迭代器
增强for
Lambda表达式
*/
    public class SetTest {
        public static void main(String[] args) {
            //1.创建一个Set集合的对象
            Set<String> s = new HashSet<>();

            //2,添加元素
            //如果当前元素是第一次添加，那么可以添加成功，返回true
            //如果当前元素是第二次添加，那么添加失败，返回false
            s.add("张三");
            s.add("张三");
            s.add("李四");
            s.add("王五");

            //方式1：迭代器遍历
            System.out.println("====迭代器遍历====");
            Iterator<String> it = s.iterator();
            while (it.hasNext()) {
                String str = it.next();
                System.out.println(str);
            }

            //方式2：增强for循环遍历
            System.out.println("====增强for遍历====");
            for (String str : s) {
                System.out.println(str);
            }

            //方式3：Lambda表达式遍历（forEach）
            System.out.println("====Lambda遍历====");
            s.forEach(str -> System.out.println(str));
        }
    }
}
