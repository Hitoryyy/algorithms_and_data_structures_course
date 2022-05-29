package Home_Work_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        double numb = scanner.nextDouble();

        System.out.println("Введите степень числа: ");
        int exp = scanner.nextInt();

        System.out.println("Введите кол-во элементов ряда: ");
        int row = scanner.nextInt();

        System.out.println("Число " + numb + " в степени: " + exp + " = " + exponent.expp(numb,exp));
        System.out.println("Число " + numb + " в степени: " + exp + " = " + expParityProperty.exParPro(numb,exp));
        System.out.println("Сумма " + row + " элементов: " + rowSumm.rowSum(numb,row));
    }
}
