import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Toolkit;



class Viewer {
    JTextField textField; //

    Viewer(){

        Controller controller = new Controller(this); // create object by class Controller

        textField = new JTextField(); // Создаем новый слой

        Font fontTextField = new Font("SansSerif", Font.PLAIN, 20);
        Font fontButton = new Font("SansSerif", Font.PLAIN, 10);
        Font fontButtonDigit = new Font("SansSerif", Font.PLAIN, 18);

        textField.setBounds(18,24,293,75);
        textField.setFont(fontTextField);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        // first row
        JButton buttonMC = new JButton("MC");
        buttonMC.setFont(fontButton);
        buttonMC.setBounds(18,130,50,40);
        buttonMC.addActionListener(controller);
        buttonMC.setActionCommand("MC");

        JButton buttonMR = new JButton("MR");
        buttonMR.setFont(fontButton);
        buttonMR.setBounds(78,130,50,40);
        buttonMR.addActionListener(controller);
        buttonMR.setActionCommand("MR");

        JButton buttonMS = new JButton("MS");
        buttonMS.setFont(fontButton);
        buttonMS.setBounds(138,130,50,40);
        buttonMS.addActionListener(controller);
        buttonMS.setActionCommand("MS");

        JButton buttonMPlus = new JButton("M+");
        buttonMPlus.setFont(fontButton);
        buttonMPlus.setBounds(198,130,50,40);
        buttonMPlus.addActionListener(controller);
        buttonMPlus.setActionCommand("M+");

        JButton buttonMMinus = new JButton("M-");
        buttonMMinus.setFont(fontButton);
        buttonMMinus.setBounds(258,130,50,40);
        buttonMMinus.addActionListener(controller);
        buttonMMinus.setActionCommand("M-");

        // Second row
        JButton buttonBackspace = new JButton("←"); // alt + 27
        buttonBackspace.setFont(fontButtonDigit);
        buttonBackspace.setBounds(18,180,50,40);
        buttonBackspace.addActionListener(controller);
        buttonBackspace.setActionCommand("Backspace");

        JButton buttonCE = new JButton("CE");
        buttonCE.setFont(fontButton);
        buttonCE.setBounds(78,180,50,40);
        buttonCE.addActionListener(controller);
        buttonCE.setActionCommand("CE");

        JButton buttonC = new JButton("C");
        buttonC.setFont(fontButton);
        buttonC.setBounds(138,180,50,40);
        buttonC.addActionListener(controller);
        buttonC.setActionCommand("C");

        JButton buttonPlusMinus = new JButton("±"); //alt + 0177
        buttonPlusMinus.setFont(fontButton);
        buttonPlusMinus.setBounds(198,180,50,40);
        buttonPlusMinus.addActionListener(controller);
        buttonPlusMinus.setActionCommand("PlusMinus");

        JButton buttonQRoot = new JButton("√"); // alt + 251
        buttonQRoot.setFont(fontButtonDigit);
        buttonQRoot.setBounds(258,180,50,40);
        buttonQRoot.addActionListener(controller);
        buttonQRoot.setActionCommand("Qroot");

        // Third row
        JButton buttonSeven = new JButton("7");
        buttonSeven.setFont(fontButtonDigit);
        buttonSeven.setBounds(18,230,50,40);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");

        JButton buttonEight = new JButton("8");
        buttonEight.setFont(fontButtonDigit);
        buttonEight.setBounds(78,230,50,40);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");

        JButton buttonNine = new JButton("9");
        buttonNine.setFont(fontButtonDigit);
        buttonNine.setBounds(138,230,50,40);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");

        JButton buttonDivide = new JButton("/");
        buttonDivide.setFont(fontButtonDigit);
        buttonDivide.setBounds(198,230,50,40);
        buttonDivide.addActionListener(controller);
        buttonDivide.setActionCommand("Divide");

        JButton buttonPercent = new JButton("%");
        buttonPercent.setFont(fontButtonDigit);
        buttonPercent.setBounds(258,230,50,40);
        buttonPercent.addActionListener(controller);
        buttonPercent.setActionCommand("Percent");

        // Four row
        JButton buttonFour = new JButton("4");
        buttonFour.setFont(fontButtonDigit);
        buttonFour.setBounds(18,280,50,40);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");

        JButton buttonFive = new JButton("5");
        buttonFive.setFont(fontButtonDigit);
        buttonFive.setBounds(78,280,50,40);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");

        JButton buttonSix = new JButton("6");
        buttonSix.setFont(fontButtonDigit);
        buttonSix.setBounds(138,280,50,40);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setFont(fontButtonDigit);
        buttonMultiply.setBounds(198,280,50,40);
        buttonMultiply.addActionListener(controller);
        buttonMultiply.setActionCommand("Multiply");

        JButton buttonFraction = new JButton("1/x");
        buttonFraction.setFont(fontButton);
        buttonFraction.setBounds(258,280,50,40);
        buttonFraction.addActionListener(controller);
        buttonFraction.setActionCommand("1/x");

        // Five row
        JButton buttonOne = new JButton("1");
        buttonOne.setFont(fontButtonDigit);
        buttonOne.setBounds(18,330,50,40);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setFont(fontButtonDigit);
        buttonTwo.setBounds(78,330,50,40);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");

        JButton buttonThree = new JButton("3");
        buttonThree.setFont(fontButtonDigit);
        buttonThree.setBounds(138,330,50,40);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setFont(fontButtonDigit);
        buttonMinus.setBounds(198,330,50,40);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");

        JButton buttonEqual = new JButton("=");
        buttonEqual.setFont(fontButtonDigit);
        buttonEqual.setBounds(258,330,50,90);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        // Six row
        JButton buttonZero = new JButton("0");
        buttonZero.setFont(fontButtonDigit);
        buttonZero.setBounds(18,380,110,40);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");

        JButton buttonPoint = new JButton(",");
        buttonPoint.setFont(fontButton);
        buttonPoint.setBounds(138,380,50,40);
        buttonPoint.addActionListener(controller);
        buttonPoint.setActionCommand("Point");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setFont(fontButtonDigit);
        buttonPlus.setBounds(198,380,50,40);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");


        // -------------------------------------------------------------------------------
        JFrame frame = new JFrame("Calculator AUCA"); // Create parent window
        frame.setSize(340, 480); // window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program after exit
        frame.setLayout(null); // position absolute for all elements
        frame.setResizable(false); //Запрет на изменение размера
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calc_ico.jpg")));

        // add components
        frame.add(textField);
        frame.add(buttonMC);
        frame.add(buttonMR);
        frame.add(buttonMS);
        frame.add(buttonMPlus);
        frame.add(buttonMMinus);
        frame.add(buttonBackspace);
        frame.add(buttonCE);
        frame.add(buttonC);
        frame.add(buttonPlusMinus);
        frame.add(buttonQRoot);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonDivide);
        frame.add(buttonPercent);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonMultiply);
        frame.add(buttonFraction);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonMinus);
        frame.add(buttonEqual);
        frame.add(buttonZero);
        frame.add(buttonPoint);
        frame.add(buttonPlus);

        frame.setVisible(true);


    }

    public void update(String text){  // метод update для обновления информации на экране
        textField.setText(text);
    }
}
