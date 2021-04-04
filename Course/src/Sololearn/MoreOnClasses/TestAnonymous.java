package Sololearn.MoreOnClasses;

class TestAnonymous {
    public void start(){
        System.out.println("loading...");
    }
}
class Anonymous{
    public static void main(String[] args) {
        TestAnonymous tA = new TestAnonymous() {
            @Override public void start() {
                System.out.println("Hi Anonymous");
            }
        };
        tA.start();
    }
}

