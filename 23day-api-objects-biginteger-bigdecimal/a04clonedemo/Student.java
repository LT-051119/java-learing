package a04clonedemo;
// 学生类，实现Cloneable接口才允许调用clone()进行克隆
class Student implements Cloneable {
    // 全部私有化成员变量
    private int age;
    private String name;
    private int[] scores;

    // 构造方法
    public Student(int age, String name, int[] scores) {
        this.age = age;
        this.name = name;
        this.scores = scores;
    }

    // getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 直接拿到原数组引用
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // 默认super.clone() → 浅克隆
    /*
     * 重写clone方法
     * super.clone() 是Object原生方法，默认就是【浅克隆】
     * 只会复制当前Student对象里各个成员的值
     * 0 引用类型（数组、Address）只复制内存地址，不新建对象
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}