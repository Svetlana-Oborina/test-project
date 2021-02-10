import java.util.Scanner;

public class BitwiseOperations {

    public static void main(String[] args) {
        /*
        Ввести с консоли число в бинарном формате.
        Перевести его в десятичный формат, записать в переменную int и вывести на экран.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String inBinaryNum = input.nextLine();
        int binaryNum = Integer.parseInt(inBinaryNum, 2);
        System.out.println(binaryNum);

    }
}
