package a01polymorphism;
//多态：需要满足继承关系也就是父子类，子类还需要重写方法
public class Test {
    public static void main(String[] args) {
        //创建对象
        //学生
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);
        //老师
        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(28);
        //管理员
        Administrator adm = new Administrator();
        adm.setName("wangwu");
        adm.setAge(28);
        //上传给方法,也就是子类对象去替换父类使用show()方法
        register(s);
        register(t);
        register(adm);

    }
    //定义方法，上传的对象是父类，才能满足这些子类都可以使用一个方法
    //使用父类对象为参数，可以接收所有子类对象
    public static void register(Person p){
        p.show();
    }
}
