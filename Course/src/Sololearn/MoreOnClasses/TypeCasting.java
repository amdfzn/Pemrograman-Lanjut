package Sololearn.MoreOnClasses;

class TypeCasting{
    public void print() {
        System.out.println("A");
    }
}
class B extends TypeCasting {
    public void print() {
        System.out.println("B");
    }
    public static void main(String[ ] args) {
        TypeCasting object = new B();
        B b = (B) object;
        b.print();
    }
}