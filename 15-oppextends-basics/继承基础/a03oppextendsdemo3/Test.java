package a03oppextendsdemo3;
//子类调用父类的空参和有参，在子类访问父类方法时，都会先访问父类的空参去进行初始化
public class Test {
    public static void main(String[] args) {
        //创建对象
        zi z = new zi("zhangsan",18);
    }
}
