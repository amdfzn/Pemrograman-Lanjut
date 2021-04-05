package Sololearn.ExceptionListThreadsFiles;

class Module6Quiz1 {
    public static void main(String[] args) {
        myFunc(3,1);
    }
    static void myFunc(int a, int b) {
        try
        {
            System.out.println(a/b);
        }
        catch
        (Exception e) {
            System.out.println("Error");
        }
    }
}
