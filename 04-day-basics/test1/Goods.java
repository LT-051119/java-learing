package test1;

public class Goods {
/* 需求 ：定义数组存储 3 个商品对象。
商品的属性：商品的 id，名字，价格，库存。
创建三个商品对象，并把商品对象存入到数组当中，遍历打印商品信息*/
    //定义属性
    private String id;
    private String name;
    private double price;
    private int count;

    //构造参数
    public Goods() {
    }
    //全参
    public Goods(String id, String name,double price, int count) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    //定义方法
}

