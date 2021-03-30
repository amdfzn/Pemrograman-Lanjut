package Sololearn.ClassesAndObject;

public class Static {
    public static void main(String[] args) {

    }
class Person {
        public static int pCount;
        public static void main(String[ ] args) {
            Person.pCount = 1;
            Person.pCount++;
            System.out.println(Person.pCount);
        }
    }
}
