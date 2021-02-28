import java.util.Scanner;

public class ComparisonOfArrayElements {
    public static void main(String[] args) {
        //Пользователь вводит размер массива
        Scanner inputSizeArray = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = inputSizeArray.nextInt();


        //Пользователь вводит данные с клавиатуры в массив
        Scanner inputElementOfArray = new Scanner(System.in);
        double[] array = new double[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива ");
            double elementOfArray = inputElementOfArray.nextDouble();
            array[i] = elementOfArray;

        }


        //Сравнить элементы массива с заранее заданными константами x, y, z.
        final double x = 1.0;
        final double y = 2;
        final double z = 3.8;

        for (int i = 0; i < sizeArray; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                //Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}


