package GuiFormMhs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class FormDataMhs {
    private JTextField textnama;
    private JTextField textnim;
    private JPanel mhsLabel;
    private JButton buttonCek;
    private JButton buttonKeluar;
    private JLabel hasil1;
    private JLabel hasil2;
    private JLabel hasil3;
    private JLabel hasil4;
    private JLabel hasil5;
    private JLabel hasil6;
    private JLabel hasil7;
    private JLabel hasil8;


    public FormDataMhs() {
        buttonCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = textnama.getText();
                String NIM = textnim.getText();

                // PROSES
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNIM(NIM);
                hasil1.setText("Nama : " + mhs.getNama());
                hasil2.setText("NIM : " + mhs.getNIM());
                hasil3.setText("Jenjang Pendidikan : " + mhs.getJenjang());
                hasil4.setText("Tahun Masuk :" + mhs.getTahun());
                hasil5.setText("Fakultas : " + mhs.getFakultas());
                hasil6.setText("Jurusan :" + mhs.getJurusan());
                hasil7.setText("Jenis Kelamin :" + mhs.getJenisKelamin());
                hasil8.setText("Nomor Urut : " + mhs.getNomorurut());
            }
        });
        buttonKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getMhsPanel() {

        return mhsLabel;
    }
}
