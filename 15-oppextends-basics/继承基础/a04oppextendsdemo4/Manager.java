package a04oppextendsdemo4;
//子类
public class Manager extends Employee {
    //子类可以继承父类的变量，就不需要再写
    private double reward;
    //

    public Manager() {
    }

    //调用父类
    public Manager(String id, String name, double money, double reward) {
        super(id, name, money);
        this.reward = reward;
    }
    //调用set/get父类
    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }
    //父类的工作方法不满足子类，需要重写，满足子类需要的，可以直接继承调用
    @Override
    public void work() {
        //super.work();由于不需要复用父类的方法，不需要super去调用父类的方法
        System.out.println("工作是管理其他人");
    }
}
