package Home_Work_5;

public class Main {

    //----------------------------МЕТОД ВОЗВЕДЕНИЯ В СТЕПЕНЬ------------------------------------//
    private static double recPower(double a, int b) {
        return (b == 0) ? 1 : recPower(a, b - 1) * a;
    }

    //----------------------------ОБХОД ШАХМАТНОЙ ДОСКИ КОНЁМ------------------------------------//
    private static int[][] moves = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

    private static boolean isPossible(int[][] desk, int x, int y) {
        return x >= 0 && x < desk[0].length && y >= 0 && y < desk.length && desk[y][x] == 0;
    }

    private static boolean knight(int[][] desk, int x, int y, int move) {
        desk[y][x] = move;

        if (move > desk.length * desk[0].length - 1) {
            return true;
        }

        int nextx;
        int nexty;
        for (int i = 0; i < moves.length - 1; i++) {
            nextx = x + moves[i][0];
            nexty = y + moves[i][1];
            if (isPossible(desk, nextx, nexty) && knight(desk, nextx, nexty, move + 1)) {
                return true;
            }
        }
        desk[y][x] = 0;
        return false;
    }
    //-------------------------------------------------------------------------------------------//

    private static void displayDesk(int[][] desk) {
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk.length; j++) {
                System.out.printf("%3d", desk[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println(recPower(4.2, 2));

        int[][] desk = new int[8][8];
        knight(desk, 0, 1, 1);
        displayDesk(desk);
    }
}
