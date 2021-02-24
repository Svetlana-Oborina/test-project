package OldTask;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
        Использовать циклы запрещено
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        double num = input.nextDouble();
        System.out.printf(" %.2f*0 = %.2f\n %.2f*1 = %.2f\n %.2f*2 = %.2f\n %.2f*3 = %.2f\n %.2f*4 = %.2f\n %.2f*5 = %.2f\n %.2f*6 = %.2f\n %.2f*7 = %.2f\n %.2f*8 = %.2f\n %.2f*9 = %.2f\n %.2f*10 = %.2f\n",
                num, num*0, num, num*1, num, num*2, num, num*3, num, num*4, num, num*5, num, num*6, num, num*7, num, num*8, num, num*9, num, num*10);

    }
}
