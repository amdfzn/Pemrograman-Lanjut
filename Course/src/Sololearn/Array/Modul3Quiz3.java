package Sololearn.Array;

import java.util.*;
public class Modul3Quiz3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int []arr = new int[4];
        int res = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int el : arr) {
            res += el;
            System.out.println(res);

        }
    }
}
