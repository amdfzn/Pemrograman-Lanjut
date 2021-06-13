package GUISorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormNumberSorting {
    private JPanel rootPanel;
    private JTextField textInput;
    private JTable tableOutput;
    private JButton buttonAscending;
    private JButton buttonDecending;
    private JButton buttonClear;
    private DefaultTableModel tableModel;
    private boolean add = false;

    public JPanel getRootPanel() {
        return rootPanel;
    }
    public FormNumberSorting() {

        this.initComponents();
        buttonAscending.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil inputan angka menjadi array
                DefaultTableModel tableModel = (DefaultTableModel) tableOutput.getModel();
                String[] num = textInput.getText().split( ", *" );
                //Menampilkan pesan error
                if(textInput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Invalid or Missing Input",
                            "Ouch",
                            JOptionPane.WARNING_MESSAGE);
                }
                //Memasukkan kedalam tabel
                if (!add) {
                    for (int i = 0; i < num.length; i++) {
                        tableModel.addRow(new Object[]{});
                    }
                    add = true;
                }
                //Mengambil data yang telah di sorting secara ascending
                int ascending = 0;
                for (int i : NumberSorting.getAscending(num, num.length)){
                    tableModel.setValueAt(i, ascending, 0);
                    ascending++;
                }
            }
        });

        buttonDecending.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil inputan angka menjadi array
                DefaultTableModel tableModel = (DefaultTableModel) tableOutput.getModel();
                String[] num = textInput.getText().split( ", *" );
                //Menampilkan pesan error
                if(textInput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum diisi",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                //Memasukkan kedalam tabel
                if (!add) {
                    for (int i = 0; i < num.length; i++) {
                        tableModel.addRow(new Object[]{});
                    }
                    add = true;
                }
                //Mengambil data yang telah di sorting secara descending
                int descending = 0;
                for (int i : NumberSorting.getDescending(num, num.length)) {
                    tableModel.setValueAt(i, descending, 0);
                    descending++;
                }
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengosongkan textflied Input
                textInput.setText("");
            }
        });
    }
    private void initComponents() {
        Object[] tableColumn = {
                "Your Numbers Have Been Sorted!"
        };
        Object[][] initData = {
        };
        //set table model
        tableModel = new DefaultTableModel(initData, tableColumn);
        tableOutput.setModel(tableModel);
    }
}