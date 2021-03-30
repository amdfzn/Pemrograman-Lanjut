package Sololearn.Array;

import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] myArray = new double[4];
        double sum = 0.0;
        //mengisi array
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = scanner.nextDouble();
        }
        // operasi penjumlahan
        for (int x = 0; x < myArray.length; x++) {
            sum += myArray[x];
        }
        System.out.println(sum);
    }

}
