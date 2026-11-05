package a04oppinterface;

public class basketballspoter extends Study {
    public basketballspoter() {
    }

    public basketballspoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("学生学打篮球");
    }
}
