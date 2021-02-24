package OldTask;

import java.util.Scanner;

public class ComparisonOfData {
    public static void main(String[] args) {
        // пользователю предлагается ввести с клавиатуры число в переменную number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();

        //объявление констант X, Y, Z

        final int x = 1;
        final int y = 2;
        final int z = 5;

        //сраниваем значение введеное пользователем с константами
        switch (number) {
            case x:
            case y:
            case z:
                // если number=X или Y или Z  вывести на экран сообщение "Данное значение имеется в константах"
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                //если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
                System.out.println("Такой константы нет!");
        }



    }
}
