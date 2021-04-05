package Sololearn.ExceptionListThreadsFiles;

import java.io.*;
class TestFiles {
    public static void main(String args[ ]) {

        File file = new File("C:\\Users\\USER\\Documents\\Tes.txt");
        if(file.exists()) {
            System.out.println("Yes");
        }else {
            System.out.println("Error");
        }
    }
}