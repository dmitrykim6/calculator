package Calculator_v1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

class Viewer{
    JTextField textField;

    Viewer(){
        Controller controller = new Controller(this);

        textField = new JTextField();
        textField.setBounds(50, 50, 300, 50);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(50, 110, 50, 50);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");


        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(110, 110, 50, 50);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(50, 170, 50, 50);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(50, 230, 50, 50);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(110, 170, 50, 50);
        buttonEquals.addActionListener(controller);
        buttonEquals.setActionCommand("Equals");

        JFrame frame = new JFrame("Calculator AUCA");
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonEquals);
        frame.setVisible(true);

    }

    public void update(String text){
        textField.setText(text);
    }
}