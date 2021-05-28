package GuiFormMhs;

import javax.swing.*;

public class RunFormDataMhs {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Data Mahasiswa");
        jFrame.setContentPane(new FormDataMhs().getMhsPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
    }
}
