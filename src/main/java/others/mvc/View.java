package others.mvc;

import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame {

    private JTextField firstNumber = new JTextField(10);

    private JLabel additionLabel = new JLabel("+");

    private JTextField secondNumber = new JTextField(10);

    private JButton calculateButton = new JButton("Calculate");

    private JTextField calculationResult = new JTextField(10);

    public View() {
        JPanel panel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        panel.add(firstNumber);
        panel.add(additionLabel);
        panel.add(secondNumber);
        panel.add(calculateButton);
        panel.add(calculationResult);

        this.add(panel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalculationResult() {
        return Integer.parseInt(calculationResult.getText());
    }

    public void setCalculationResult(int solution) {
        calculationResult.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener e) {
        calculateButton.addActionListener(e);
    }

    void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
