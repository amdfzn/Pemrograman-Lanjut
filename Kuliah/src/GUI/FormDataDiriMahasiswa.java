package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormDataDiriMahasiswa {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;
    private JLabel labelBaris1;
    private JLabel labelBaris2;
    private JButton buttonDone;
    private JLabel labelBaris3;
    private JLabel labelBaris4;
    private JLabel labelBaris5;
    private JLabel labelBaris6;
    private JLabel labelNama;
    private JLabel labelNIM;

    public FormDataDiriMahasiswa() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Menangkap data dari field text

                String nama = textNama.getText();
                String NIM = textNIM.getText();
                //Memproses data

                DataMahasiswa TM = new DataMahasiswa();
                TM.setNama(nama);
                TM.setNIM(NIM);

                //Menampilkan data di form
                labelNama.setText("Nama = "+nama);
                labelNIM.setText("NIM = "+NIM);
                labelBaris1.setText("Tahun Masuk = "+TM.setTahunMasuk());
                labelBaris2.setText("Jenjang = "+TM.setJenjang());
                labelBaris3.setText("Fakultas = "+TM.setFakultas());
                labelBaris4.setText("Jurusan = "+TM.setJurusan());
                labelBaris5.setText("Jenis Kelamin = "+TM.setJenisKelamin());
                labelBaris6.setText("Nomor Urut = "+TM.setNomorUrutMahasiswa());
            }
        });
        buttonDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //agar form dapat di isi kembali
                textNama.setText(null);
                textNIM.setText(null);
                labelNama.setText(null);
                labelNIM.setText(null);
                labelBaris1.setText(null);
                labelBaris2.setText(null);
                labelBaris3.setText(null);
                labelBaris4.setText(null);
                labelBaris5.setText(null);
                labelBaris6.setText(null);
            }
        });
    }

    public JPanel getRootPanel() {

        return rootPanel;
    }
}
