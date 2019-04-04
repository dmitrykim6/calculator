import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

class Viewer{
    Viewer(){
        Controller controller = new Controller(this);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 300, 50);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(50, 110, 50, 50);

        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");


    }
}