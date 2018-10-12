import javax.swing.*;

public class MainForm extends JFrame {
    MainForm(){
        setSize(800,800);

        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new ActionForm());
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainForm();
    }

}
