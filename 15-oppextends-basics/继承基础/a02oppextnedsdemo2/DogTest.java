package a02oppextnedsdemo2;

public class DogTest {
    public static void main(String[] args) {
        //创建对象
        Husky h = new Husky();
        h.eat();
        h.water();
        h.LookHome();
        h.BreakHome();

        //中华田园犬
        Chinisedog cd = new Chinisedog();
        cd.eat();
        cd.LookHome();
        cd.water();
    }
}
