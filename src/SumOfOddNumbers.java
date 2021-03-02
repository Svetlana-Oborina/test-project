import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        //Пользователь вводит любое целое положительное число n
        Scanner inputN = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int n = inputN.nextInt();


        // Cуммирование всех нечетные числа от 1 до введенного пользователем числа n.
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {

            sum += i;
        }

        if (n > 0) {
            System.out.println("Сумма нечетных чисел " + sum);
        } else {
            System.out.println("Введено не положительное число");
        }

    }
}
