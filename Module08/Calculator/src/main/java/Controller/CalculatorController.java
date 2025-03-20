package Controller;

import Model.CalculatorModel;
import Model.Operation;
import View.CalculatorView;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.displayWelcome();
        while (true) {
            String[] operation = view.getClientOperation().split(" ");
            if (operation[0].equalsIgnoreCase("exit")) {
                break;
            }
            try {
                Operation op = Operation.getOperation(operation[0]);
                switch (op) {
                    case Operation.ADD:
                        view.displayResult(model.add(Double.parseDouble(operation[1]), Double.parseDouble(operation[2])));
                        break;
                    case Operation.SUBTRACT:
                        view.displayResult(model.subtract(Double.parseDouble(operation[1]), Double.parseDouble(operation[2])));
                        break;
                    case Operation.MULTIPLY:
                        view.displayResult(model.multiply(Double.parseDouble(operation[1]), Double.parseDouble(operation[2])));
                        break;
                    case Operation.DIVIDE:
                        view.displayResult(model.divide(Double.parseDouble(operation[1]), Double.parseDouble(operation[2])));
                        break;
                    default:
                        view.displayError("Invalid operation");
                }

            } catch (Exception e) {
                view.displayError(e.getMessage());
            }
        }
        view.close();
    }
}
