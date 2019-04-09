import java.awt.*;
import javax.swing.*;

public class Aplikasi{
    static JTextField txtNim;
    static JTextField txtNama;
    static JTextField txtKelas;

    public static void main(String[] args){
        JFrame app = new JFrame("Test Jendela");


        app.getContentPane().add(panel, BorderLayout.CENTER);
        app.getContentPane().add(btn, BorderLayout.SOUTH);

        app.setSize(300,200);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static class BtnClick implements ActionListener{

        public void actionPerformed(ActionEvnet event){
            JOptionPane.showMessageDialog(null, "Selamat Datang, info uang diisikan adlaah \n +" +
                    txtNim.getText() + "-" + txtNama.getText() + "-" + txtKelas.getText());
        }
    }
}