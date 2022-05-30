package Home_Work_1;

public class rowSumm {

    public static double rowSum(double num, int row) {
        double res = 0;
        while (row > 0) {
            res += num;
            --row;
        }
        return res;
    }
}
