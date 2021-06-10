package Gui2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pengurutan {
    private JTextField textAngka1;
    private JTextField textAngka2;
    private JButton urutkanAngkaButton;
    private JTable tablehasil;
    private JPanel rootPanel1;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getrootPanel1() {
        return rootPanel1;
    }
    public Pengurutan() {
        this.initComponents();
        urutkanAngkaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel)
                        tablehasil.getModel();
                String jumlah2 = textAngka2.getText();
                int jumlah = Integer.parseInt(textAngka1.getText());
                String angka = textAngka2.getText();

                if (textAngka2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel1,
                            "jumlah angka tidak diketahui",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (angka.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel1,
                            "Angka belum diinput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                } else {
                    model.addRow(new Object[]{jumlah2, angka});
                    //clear textfield
                    textAngka1.setText("");
                    textAngka2.setText("");
                }
                int a = 0;
                for (int i : Urutan.getascen(angka, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Urutan.getdescen(angka, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tablehasil.setModel(tableModel);
        //menampilkan sorting di setiap kolom
        tablehasil.setAutoCreateRowSorter(true);
        //hidupkan single selection
        tablehasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
