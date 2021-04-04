package Sololearn.MoreOnClasses;

class TestOverloading {
    public void doSomething() {
        System.out.println("A");
    }
    public void doSomething(String str) {
        System.out.println(str);
    }
}
class Overloading {
    public static void main(String[ ] args) {
        TestOverloading object = new TestOverloading();
        object.doSomething("B");
    }
}