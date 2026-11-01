package test4;
/*
需求：
1. 定义数组存储3部手机对象。
2. 手机类Phone，属性：品牌，价格，颜色。
3. 计算出三部手机的平均价格
*/
public class Phone {
    // 成员变量：品牌、价格、颜色
    private String brand;
    private double price;
    private String color;

    //无参
    public Phone() {
    }

    // 构造方法，全参
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}