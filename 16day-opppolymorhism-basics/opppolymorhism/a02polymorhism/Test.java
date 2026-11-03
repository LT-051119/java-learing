package a02polymorhism;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //多态的优点，new Dog();想调用子类的时候只需要修改后面的类型，就能调用相应的子类的继承方法
        Animal a = new Dog();
        a.eat();

        //多态的缺点：不能直接调用子类的特异的方法(也就是没有继承父类的方法，子类自己的方法)
        //不能直接这样去调用，a.lookhome();需要进行转换为Dog类，才能调用子类的方法
        //Dog d = (Dog) a;
        //还不能转换调用与创建对象不一样的方法，也就是Cat c = (Cat)a,要调用猫要，new Dog()->new Cat()
        //但是如果不知道刚开始转换的，需要进行判断
        if(a instanceof Dog d ){
            //()里面表示判断a是不是和D创建的对象，后面半段表示，a 直接强转为Dog d
            d.lookHome();
        }else if(a instanceof Cat c){
            c.CatchMouse();
        }else{
            System.out.println("没有这个类型");
        }
    }
}
