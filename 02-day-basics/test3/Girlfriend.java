package test3;
//1.封装私有化
//定义一个类
//2.this.name 代表的是最上面的String name这个成员变量
//不要this。name,下面的方法输出会采用就近原则，使用离他进的name方法里面的，也就是局部变量name
public class Girlfriend {
    //对象属性私有化
    private String name;
    private String gender;
    private int age;

    //针对每一个私有化的成员变量，都要提供set方法和set方法
    //set方法去判断赋值
    //get方法去获取值
    //set赋值,
    // 对name,String n ,这个n是设置的变量,viod,是在赋值setname(String),String是getname()
    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    //对age
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
    //对gender
    public void setGender(String g){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    //定义对象行为
    public void sleep() {
        System.out.println("会睡觉");
    }

    public void eat() {
        System.out.println("会吃饭");
    }

    public void Running() {
        System.out.println("下雨了会跑回家");
    }
}

