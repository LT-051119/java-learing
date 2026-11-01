package test4;
//构造方法
public class friend {
    //定义属性
    private String name;
    private int age;
    //无参，
    /*public friend(){
        System.out.println("看看我打印了吗？");
    }*/
    //有参
    public friend (String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
