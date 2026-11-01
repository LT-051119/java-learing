package test3;

import java.util.Scanner;
//在进行对象创建的时候，如果是无参，需要赋值不要忘了如（c.setBrand(brand)）里面的brand，是键盘录入的，是实参
public class Cartest {
    public static void main(String[] args) {
        //定义一个数组
        Car [] arr = new Car [3];

        //键盘录入
        Scanner sc = new Scanner(System.in);

        //利用循环创建多个对象，和录入信息
        for (int i = 0; i < arr.length; i++) {
            //创建对象
            Car c = new Car();
            //接收录入
            System.out.println("请输入车的品牌");
            String brand = sc.next();
            System.out.println("请输入车的价格");
            double price = sc.nextDouble();
            System.out.println("请输入车的颜色");
            String color = sc.next();
            // 【新增的关键代码：把录入的数据赋值给对象！】
            c.setBrand(brand);
            c.setPrice(price);
            c.setColor(color);
            //添加进数组
            arr[i] = c;
        }
        //遍历打印
        for (int i = 0; i < arr.length; i++) {
            Car c=arr[i];
            System.out.println(c.getBrand()+","+c.getPrice()+","+c.getColor());
        }
    }
}
