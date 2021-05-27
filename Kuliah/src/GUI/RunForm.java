package GUI;

import javax.swing.*;
import java.awt.*;

public class RunForm {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Informasi Mahasiswa Fakultas Sains Dan Teknologi");
        jFrame.setContentPane(new FormDataDiriMahasiswa().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(800,800);
        jFrame.setVisible(true);
        jFrame.setBackground(Color.getHSBColor(39,247,32));


    }
}
