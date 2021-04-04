package Sololearn.MoreOnClasses;

class TestEnum2 {
    public enum Color  {
        RED,
        BLUE,
        GREEN;
    }
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color) {
            case BLUE:
                System.out.println("1");
                break;
            case GREEN:
                System.out.println("2");
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}
