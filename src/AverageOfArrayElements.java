import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        //Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Scanner inputSizeArray = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArray = inputSizeArray.nextInt();
        Scanner inputElements = new Scanner(System.in);
        double [] array = new double[sizeArray];
         for (int i = 0; i <sizeArray; i++ ) {
             System.out.println("Введите " + (i+1) + " элемент массива");
             double element = inputElements.nextDouble();
             array [i] = element;
         }

        //Посчитайте среднее арифметическое элементов массива
        double sum = 0;
        for (double element: array
             ) {
            sum += element;
        }
        double average = sum/sizeArray;

        //После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        System.out.println("Массив элементов умноженных на среднее арифметическое: ");
        for (double element: array
             ) {
            System.out.printf("%.3f \n", element*average);
        }

    }
}
