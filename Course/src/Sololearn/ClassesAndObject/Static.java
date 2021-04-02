package Sololearn.ClassesAndObject;

class Static {
    public static void main(String[] args) {

    }
class Person {
    private int pCount;
    public void pCount(){
         Person.this.pCount = 1;
         Person.this.pCount = Person.this.pCount + 1;
         System.out.println(Person.this.pCount);
     }

    }
}
