package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.CalculatorModel;
import vista.CalculatorView;

public class CalculatorController implements ActionListener {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.addCalculateListener(this);
        view.addSubtractListener(this);
        view.addMultiplyListener(this);
        view.addDivideListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = view.getNumber1();
            int num2 = view.getNumber2();
            String result = "";

            if (e.getSource() == view.getAddButton()) {
                int sum = model.add(num1, num2);
                result = Integer.toString(sum);
            } else if (e.getSource() == view.getSubtractButton()) {
                int difference = model.subtract(num1, num2);
                result = Integer.toString(difference);
            } else if (e.getSource() == view.getMultiplyButton()) {
                int product = model.multiply(num1, num2);
                result = Integer.toString(product);
            } else if (e.getSource() == view.getDivideButton()) {
                double quotient = model.divide(num1, num2);
                result = Double.toString(quotient);
            }

            view.setResult(result);
        } catch (NumberFormatException ex) {
            view.setResult("Invalid input");
        } catch (ArithmeticException ex) {
            view.setResult("Cannot divide by zero");
        }
    }
}
