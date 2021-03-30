package Sololearn.Array;


public class enhancedForLoop {
    public static void main(String[] args) {
        int []arr = {2,4,6,8};
        int total = 0;

        for(int x : arr) {
            total += x;
            System.out.println(total);
        }
    }
}
