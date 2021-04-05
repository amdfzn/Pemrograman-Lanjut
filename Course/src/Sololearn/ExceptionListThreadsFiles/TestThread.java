package Sololearn.ExceptionListThreadsFiles;
class TestThread extends Thread {
    public void run() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        TestThread object = new TestThread();
        object.start();
    }
}
