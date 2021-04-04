package Sololearn.MoreOnClasses;

public class TestEnum1 {
    public enum Color  {
        RED,
        BLUE,
        GREEN;
    }

    public static void main(String[] args) {
        Color a = Color.GREEN;
        switch (a) {
            case GREEN:
                System.out.println("I'm Green");
            break;
            case RED:
                System.out.println("I'm Red");
            break;
            case BLUE:
                System.out.println("I'm Blue");
            default:
        }
    }
}
