package Sololearn.ExceptionListThreadsFiles;

import java.util.*;
public class TestSorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
