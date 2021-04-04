package Sololearn.MoreOnClasses;

class TestEquals{
   private int x;
   public boolean equals(Object o) {
        return ((TestEquals)o).x == this.x;
   }
   public static void main(String[ ] args)  {
    TestEquals a = new TestEquals();
    a.x = 9;
    TestEquals b = new TestEquals();
    b.x = 5;
    System.out.println(a. equals(b));
   }
}