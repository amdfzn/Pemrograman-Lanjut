package Sololearn.ExceptionListThreadsFiles;

class TestThread2 implements Runnable {
    public void run() {
        System.out.println("Bye");
    }
    public static void main(String[ ] args) {
        Thread ob = new Thread(new TestThread2());
        ob.start();
    }
    private void start() {
        System.out.println("3....2....1");
    }
}
