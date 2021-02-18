public class ArrayOperations {
    public static void main(String[] args) {
        //Задайте массив из 5 любых целых чисел
        int[] numbers = {0,1,2,3,4};
        //Поменяйте местами первый и последний элемент в массиве
        int lastElement = numbers[numbers.length -1];
        int firstElement = numbers[0];
        numbers[numbers.length-1] = firstElement;
        numbers[0] = lastElement;
        //Вывести в консоль результат суммы первого и среднего элемента.
        System.out.println("Сумма первого и среднего элемента: " + (numbers[0] + numbers[numbers.length/2]));

    }
}
