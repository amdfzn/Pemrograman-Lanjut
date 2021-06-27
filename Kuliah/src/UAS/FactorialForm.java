package UAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialForm {
    private JPanel rootPanel;
    private JTextField inputField;
    private JButton generateButton;
    private JButton clearButton;
    private JTextField resultField;

    public FactorialForm() {
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil inputan dan merubahnya ke tipedata long
                long num = Long.valueOf(inputField.getText());
                //membuat object dari kelas Factorial dan mengolah data
                Factorial fc = new Factorial();
                fc.setNum(num);
                //memanggil data di kelas Factorial dan merubahnya kedalam tipedata string
                resultField.setText(String.valueOf(fc.rekursif(num)));

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //membuat field menjadi kosong
                inputField.setText("");
                resultField.setText("");
            }
        });
    }
    /*
    public int num;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    private int rekursif(int num) {
        if(num == 0 || num == 1){
            return 1;
        }else{
            return num * rekursif(num-1);
        }
    }
    */
    public JPanel getRootPanel() {
        return rootPanel;
    }
}
