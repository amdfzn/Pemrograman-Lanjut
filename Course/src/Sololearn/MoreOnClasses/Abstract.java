package Sololearn.MoreOnClasses;

abstract class Human {
    public int age;
    public abstract int printAge();
}

class Fauzan extends Human {

    public int printAge() {
        return age;
    }
}
class TestAbstract {
    public static void main(String[] args) {

    }
}