import java.util.Scanner;

public class InputNumberOne {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Input number 1");
        if (inputNum.nextInt() == 1) System.out.println("you entered the number 1");
    }
}
