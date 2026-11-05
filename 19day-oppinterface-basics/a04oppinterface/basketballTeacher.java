package a04oppinterface;

public  class basketballTeacher extends Teacher{
    public basketballTeacher() {
    }

    public basketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球老师教打篮球");
    }
}
