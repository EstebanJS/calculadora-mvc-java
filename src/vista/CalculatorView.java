package vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorView {

    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;

    public CalculatorView() {
        // Inicializar la ventana
        frame = new JFrame("Calculadora");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel para el primer campo de texto
        JLabel label1 = new JLabel("Número 1:");
        label1.setBounds(50, 50, 100, 25);
        frame.add(label1);

        // JTextField para el primer campo de texto
        textField1 = new JTextField();
        textField1.setBounds(150, 50, 100, 25);
        frame.add(textField1);

        // JLabel para el segundo campo de texto
        JLabel label2 = new JLabel("Número 2:");
        label2.setBounds(50, 100, 100, 25);
        frame.add(label2);

        // JTextField para el segundo campo de texto
        textField2 = new JTextField();
        textField2.setBounds(150, 100, 100, 25);
        frame.add(textField2);

        // JButton para la operación de suma
        addButton = new JButton("+");
        addButton.setBounds(50, 150, 50, 25);
        frame.add(addButton);

        // JButton para la operación de resta
        subtractButton = new JButton("-");
        subtractButton.setBounds(120, 150, 50, 25);
        frame.add(subtractButton);

        // JButton para la operación de multiplicación
        multiplyButton = new JButton("*");
        multiplyButton.setBounds(190, 150, 50, 25);
        frame.add(multiplyButton);

        // JButton para la operación de división
        divideButton = new JButton("/");
        divideButton.setBounds(260, 150, 50, 25);
        frame.add(divideButton);

        // JLabel para imprimir el resultado
        resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(150, 175, 100, 25);
        frame.add(resultLabel);

        // Actualizar la ventana
        frame.setVisible(true);
    }

    public int getNumber1() {
        return Integer.parseInt(textField1.getText());
    }

    public int getNumber2() {
        return Integer.parseInt(textField2.getText());
    }

    public void setResult(String result) {
        resultLabel.setText("Resultado: " + result);
    }

    public void addCalculateListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void addSubtractListener(ActionListener listener) {
        subtractButton.addActionListener(listener);
    }

    public void addMultiplyListener(ActionListener listener) {
        multiplyButton.addActionListener(listener);
    }

    public void addDivideListener(ActionListener listener) {
        divideButton.addActionListener(listener);
    }

    public JButton getAddButton() {
        return addButton;
    }
    
    public JButton getSubtractButton() {
        return subtractButton;
    }
    
    public JButton getMultiplyButton() {
        return multiplyButton;
    }
    
    public JButton getDivideButton() {
        return divideButton;
    }
}
