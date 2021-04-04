package Sololearn.MoreOnClasses;

class Compare {
    private int x;
    public static void main(String[] args) {
        Compare a = new Compare();
        a.x = 5;
        Compare b = new Compare();
        b.x = 5;
        System.out.println(a == b);
    }
}