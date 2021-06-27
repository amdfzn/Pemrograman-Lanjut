package UAS;

import GUI.FormDataDiriMahasiswa;

import javax.swing.*;
import java.awt.*;

public class RunFactorialForm {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("UAS");
        jFrame.setContentPane(new FactorialForm().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,200);
        jFrame.setVisible(true);
        jFrame.setBackground(Color.getHSBColor(39,247,32));

    }
}
