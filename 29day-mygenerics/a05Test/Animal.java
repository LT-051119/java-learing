package a05Test;

public abstract class Animal {
    private String name;
    private int Age;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public Animal(String name, int age) {
        this.name = name;
        Age = age;

    }
    //因为子类的吃东西都不一样，需要都进行重写
    public abstract void eat();
}
