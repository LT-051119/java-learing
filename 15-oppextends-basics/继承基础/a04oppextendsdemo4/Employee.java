package a04oppextendsdemo4;
//父类
public class Employee {
    //定义共有变量
    private String id;
    private String name;
    private double money;

    //空参
    public Employee() {
    }

    public Employee(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    //定义两个共性方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void work(){
        System.out.println("在工作");
    }
}
