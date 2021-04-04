package Sololearn.ExceptionListThreadsFiles;

class TestThread {
    public static void main(String[] args) {
        TestThread object = new TestThread();
        object.start();
    }
    private void start() {
        System.out.println("3...2...1");
    }
class Thread extends TestThread {
        public void run() {
            System.out.println("Hello");
        }
    }
}
