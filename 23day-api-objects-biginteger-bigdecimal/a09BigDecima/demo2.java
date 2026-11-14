package a09BigDecima;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class demo2 {
    public static void main(String[] args) {
        /*
public BigDecimal add(BigDecimal val)                    加法
public BigDecimal subtract(BigDecimal val)              减法
public BigDecimal multiply(BigDecimal val)               乘法
public BigDecimal divide(BigDecimal val)                 除法
public BigDecimal divide(BigDecimal val, 精确几位, 舍入模式) 除法
*/
        // 定义两个小数
        BigDecimal a = new BigDecimal("10.0");
        BigDecimal b = new BigDecimal("3.0");

        // 加法
        BigDecimal addRes = a.add(b);
        System.out.println("加法：" + addRes);

        // 减法
        BigDecimal subRes = a.subtract(b);
        System.out.println("减法：" + subRes);

        // 乘法
        BigDecimal mulRes = a.multiply(b);
        System.out.println("乘法：" + mulRes);

        // 除法（不推荐，除不尽会报错）
        // BigDecimal divRes1 = a.divide(b);

        // 除法：保留2位小数，四舍五入（对小数进行四舍五入）
        BigDecimal divRes2 = a.divide(b, 2, RoundingMode.HALF_UP);
        System.out.println("除法，保留2位，四舍五入：" + divRes2);
    }
}
