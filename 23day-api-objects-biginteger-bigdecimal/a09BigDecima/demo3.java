package a09BigDecima;

import java.math.BigDecimal;

public class demo3 {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(0.226);    // bd1: "0.226"底层存储的格式[ 48, 46, 50, 50, 54 ]
        BigDecimal bd2 = BigDecimal.valueOf(123.226);  // bd2: "123.226"[ 49, 50, 51, 46, 50, 50, 54 ]
        BigDecimal bd3 = BigDecimal.valueOf(-1.5);     // bd3: "-1.5"[ 45, 49, 46, 53 ]

    }
}
