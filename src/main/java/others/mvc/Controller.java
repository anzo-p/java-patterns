package others.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            int a, b = 0;

            try {
                a = view.getFirstNumber();
                b = view.getSecondNumber();

                model.addTwoNumbers(a, b);

                view.setCalculationResult(model.getCalculationValue());

            } catch (Exception ex) {
                view.showErrorMessage(ex.toString());
            }
        }
    }

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        this.view.addCalculationListener(new CalculateListener());
    }
}
