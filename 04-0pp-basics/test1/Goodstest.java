package test1;

public class Goodstest {
    public static void main(String[] args) {
        //定义一个动态数组
        Goods[] arr = new Goods [3];

        //创建对象
        Goods g1 = new Goods("001","小米",1999.9,100);
        Goods g2 = new Goods("002","保温杯",200.5,50);
        Goods g3 = new Goods("003","苹果",9999.9,1000);

        //把对象存储进数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods =arr[i];
            System.out.println(goods.getId()+" "+goods.getName()+" "+goods.getPrice()+" "+goods.getCount());
        }
    }
}
