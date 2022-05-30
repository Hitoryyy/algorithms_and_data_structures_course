package Home_Work_1;

import java.util.Scanner;

public class exponent {
    public static double expp(double numb, int exp) {
        double result = 1;
        while (exp > 0) {
            result *= numb;
            --exp;
        }
        return result;
    }
}
