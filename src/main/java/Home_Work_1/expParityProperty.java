package Home_Work_1;

public class expParityProperty {

    public static double exParPro(double num, int exp) {
        double res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res *= num;
                --exp;
            }
            num *= num;
            exp >>= 1;
        }
        return res;
    }
}
