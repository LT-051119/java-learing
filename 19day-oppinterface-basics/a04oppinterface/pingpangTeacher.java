package a04oppinterface;

public  class pingpangTeacher extends Teacher implements SpeakEnglish{
    public pingpangTeacher() {
    }

    public pingpangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球老师教学生打乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("说英文");
    }
}
