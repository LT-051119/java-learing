package a04oppinterface;

public abstract class Study extends Person {
    public Study() {
    }

    public Study(String name, int age) {
        super(name, age);
    }

    public abstract void Study();
}
