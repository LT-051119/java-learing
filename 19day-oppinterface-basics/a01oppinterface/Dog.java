package a01oppinterface;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swing() {
        System.out.println("狗刨");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
