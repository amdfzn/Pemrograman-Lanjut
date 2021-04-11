package Sololearn.ExceptionListThreadsFiles;

import java.io.IOException;

public class TestThrow {
    public static void main(String[] args){

    }
    public static void Do(int x) throws IOException {
        if (x < 0) {
            throw new IOException();
        }
    }
}

