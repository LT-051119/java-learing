package a04oppinterface;

public class Test {
    public static void main(String[] args) {
        //创建对象
        pingpangspoter pps = new pingpangspoter("马龙",20);
        System.out.println(pps.getName()+", "+pps.getAge());
        pps.Speak();
        pps.Study();

        basketballTeacher bbt = new basketballTeacher("张国粱",30);
        System.out.println(bbt.getName()+", "+bbt.getAge());
        bbt.teach();
    }
}
