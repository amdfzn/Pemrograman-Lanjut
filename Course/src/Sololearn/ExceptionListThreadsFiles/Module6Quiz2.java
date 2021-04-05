package Sololearn.ExceptionListThreadsFiles;

class Module6Quiz2 {
    public static void main(String[] args) {
        myFunc(-1);
    }
    static void myFunc(int arg) throws IllegalArgumentException {
        if (arg < 0){
            throw new IllegalArgumentException();
        }
    }
}
