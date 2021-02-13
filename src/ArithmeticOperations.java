import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        // 1. Ввод трех чисел с клавиатуры x, y, z
        Scanner inputX = new Scanner(System.in);
        System.out.println("Input x");
        double x = inputX.nextDouble();
        Scanner inputY = new Scanner(System.in);
        System.out.println("Input y");
        double y = inputY.nextDouble();
        Scanner inputZ = new Scanner(System.in);
        System.out.println("Input z");
        double z = inputZ.nextDouble();

        //2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
        double average = (x+y+z)/2;
        System.out.println("Average is " + average);

        //3. Деление среднего арифметического на 2 без остатка
        int intAverage = (int)(x+y+z)/2;
        System.out.println("IntAverage is " + intAverage);

        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (intAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
