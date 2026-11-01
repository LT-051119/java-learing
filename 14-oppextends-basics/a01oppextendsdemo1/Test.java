package a01oppextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //定义对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.LookHome();
        h.BreakHome();

        System.out.println("------------------");

        //定义对象
        RagDoll r = new RagDoll();
        r.drink();
        r.eat();
        r.catchMouse();
    }
}
