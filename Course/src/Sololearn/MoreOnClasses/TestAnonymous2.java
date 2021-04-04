package Sololearn.MoreOnClasses;

class TestAnonymous2 {
    public void hello() {
        System.out.println("A");
    }
}
class SayHello {
    public static void main(String[ ] args) {
        TestAnonymous2 object = new TestAnonymous2() {
            @Override public void hello() {
                System.out.println("hello");
            }
        };
        object.hello();
    }
}