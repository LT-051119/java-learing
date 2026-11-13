package a01Mathdemo;

public class MathDemo1 {
        public static void main(String[] args){
       /*
public static int        abs(int a)            获取参数绝对值
public static double     ceil(double a)        向上取整
public static double     floor(double a)       向下取整
public static int        round(float a)        四舍五入
public static int        max(int a,int b)       获取两个int值中的较大值
public static double     pow(double a,double b)返回a的b次幂的值
public static double     sqrt(double a)        返回a的平方根
public static double     cbrt(double a)        返回a的立方根
public static double     random()              返回值为double的随机值，范围[0.0,1.0)
*/
            // abs 绝对值
            System.out.println("abs(-5) = " + Math.abs(-5));

            // ceil 向上取整
            System.out.println("ceil(3.2) = " + Math.ceil(3.2));//向正无穷方向进一 4.0
            System.out.println("ceil(3.2) = " + Math.ceil(-3.2));//向正无穷方向进一 -3.0
            // floor 向下取整
            System.out.println("floor(3.8) = " + Math.floor(3.8));//向负无穷方向进一 3.0
            System.out.println("floor(3.8) = " + Math.floor(-3.8));//向负无穷方向进一 -4.0

            // round 四舍五入
            System.out.println("round(3.5f) = " + Math.round(3.5));//4

            // max 取较大值
            System.out.println("max(10,20) = " + Math.max(10, 20));//20
            System.out.println("max(10,20) = " + Math.min(10, 20));//10

            // pow a的b次幂
            System.out.println("pow(2,3) = " + Math.pow(2, 3));//2的3次方

            // sqrt 平方根
            System.out.println("sqrt(16) = " + Math.sqrt(16));//4.0

            // cbrt 立方根
            System.out.println("cbrt(8) = " + Math.cbrt(8));//2.0

            // random 随机数 [0.0,1.0)
            System.out.println("random = " + Math.random());//在[0,1)之间取
            //[0,100)取10个随机数
            for (int i = 0; i < 10; i++) {
                System.out.println("random = " + Math.random() * 100);
            }
        }
}
