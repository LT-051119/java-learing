package a03oppinnerclass;
//当出现调用名重复时
public class Outer {
    private int a = 10;
    class Inner {
        private int a = 20;
        public void show(){
            //在调用时，Outer.this这个地址值是直接存在于内部类的
            System.out.println(Outer.this.a);//10
            //this调用当前类的变量（内部类）
            System.out.println(this.a);//20
            //直接调用遵循就近原则
            System.out.println(a);//30
        }
    }
}
