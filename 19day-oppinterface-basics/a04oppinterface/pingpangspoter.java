package a04oppinterface;

public  class pingpangspoter extends Study implements SpeakEnglish{
    public pingpangspoter() {
    }

    public pingpangspoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("学生学打乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("说英文");
    }
}
