package Gui2;
import javax.swing.*;

public class RunPengurutan01 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                UnsupportedLookAndFeelException ignored) {
        }
        //set image icon
        ImageIcon imageIcon = new ImageIcon("res/vio.png");
        JFrame jFrame = new JFrame("Form Sorting JAVA SWING");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new Pengurutan().getrootPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(390, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
