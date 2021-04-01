package Sololearn.ClassesAndObject;
import java.util.Scanner;

//your code goes here

public class BinaryOperator {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}

class Converter {
    public static String toBinary(int num) {
        String binary = "";
        while(num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}