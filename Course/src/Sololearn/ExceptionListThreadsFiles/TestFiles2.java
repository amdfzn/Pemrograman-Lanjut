package Sololearn.ExceptionListThreadsFiles;

import java.io.*;
import java.util.*;
class TestFiles2 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\USER\\Documents\\Tes.txt");
            Scanner sc = new Scanner (f);
            while (sc.hasNext()) {
                String a = sc.next();
                String b = sc.next();
                System.out.println(a + " " + b);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

}
