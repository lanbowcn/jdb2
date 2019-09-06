package SwordtoOffer;

/**
 * @Author：lanbow
 * @Date:2019/8/27 15:05
 * @Version 1.0
 */
public class Pow {
    public double Power(double base, int exponent) {
        double res = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            res = res*base;
        }
        if (exponent>0)
            return res;
        else
            return 1/res;
    }
}
