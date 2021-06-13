package GUISorting;

import javax.swing.*;

public class RunFormNumberSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        JFrame jFrame = new JFrame("Number Sorting");
        jFrame.setContentPane(new FormNumberSorting().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}