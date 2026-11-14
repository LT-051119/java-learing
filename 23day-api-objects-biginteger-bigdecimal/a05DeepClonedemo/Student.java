package a05DeepClonedemo;

import java.util.Arrays;

// 学生类，实现Cloneable接口
class Student implements Cloneable {
    // 私有成员：基本类型、String、数组（不再额外自定义Address类）
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
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    /*
     * 重写clone实现深克隆
     * 1. super.clone() 先造出外层Student新对象（浅克隆基础）
     * 2. 手动对里面的引用类型数组单独复制，开辟新数组空间
     * String不用手动复制，因为它不可变
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 先克隆外层Student对象
        Student newStudent = (Student) super.clone();
        // 数组是可变引用类型，手动拷贝一份全新数组，实现深拷贝
        newStudent.scores = Arrays.copyOf(this.scores, this.scores.length);
        return newStudent;
    }
}
