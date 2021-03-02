import java.util.Scanner;

public class OutputOfTheMatrix {
    public static void main(String[] args) {
        //Пользователь вводит размерность матрицы
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк в матрице");
        int line = scanner.nextInt();
        System.out.println("Введите число столбцов в матрице");
        int column = scanner.nextInt();

        //Пользователь вводит матрицу
        System.out.println("Введите все элемены матрицы через enter");
        double[] matrix = new double[column * line];
        for (int i = 0; i < column * line; i++) {
            matrix[i] = scanner.nextDouble();
        }


        // Вывод первой строки матрицы на экран, где каждый элемент умножается на 3

        System.out.println("Вывод первой строки матрицы, где каждый элемент умножен на 3: ");
        for (int i = 0; i < column; i++) {
            System.out.print(matrix[i] * 3 + "    ");
        }


    }
}
