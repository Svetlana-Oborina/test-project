import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        Scanner inputFirstNum = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNum = inputFirstNum.nextDouble();
        Scanner inputSecondNum = new Scanner(System.in);
        System.out.println("Введите второе число");
        double secondNum = inputSecondNum.nextDouble();
        Scanner inputMathChar = new Scanner(System.in);
        System.out.println("Введите математический");
        char mathChar = inputMathChar.next().charAt(0);

        //В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        switch (mathChar) {
            case '*':
                System.out.println(firstNum + "*" + secondNum + "=" + firstNum * secondNum);
                break;
            case '/':
                System.out.println(secondNum != 0 ? firstNum + "/" + secondNum + "=" + firstNum / secondNum : "Деление на ноль");
                break;
            case '+':
                System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
                break;
            case '-':
                System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
                break;
            default:
                System.out.println("Введен не математический оператор");





        }


    }
}
