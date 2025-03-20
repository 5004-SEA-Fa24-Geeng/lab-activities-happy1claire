package View;

import Controller.CalculatorController;
import Model.Operation;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CalculatorView {
    private String welcomeMsg;
    private Scanner IN = new Scanner(System.in);
    private CalculatorController controller;
    private static final Console console = System.console();
    private static final String PROMPT = "> ";
    private static final String ERROR = "Error: ";


    public void start() {
        welcome();
        while (true) {
            String input = IN.next();
            System.out.println("Next");

            if (input.equals("exit")) {
                break;
            }
        }
        System.exit(0);
    }

    public void welcome() {
        System.out.println("Welcome to Calculator\n Allowed operations: + - * /\n" +
                "Type exit to close calculator.");
    }

    public void displayWelcome() {
        console.printf("Welcome to the calculator\n");
        console.printf("Allowed operations: " + Arrays.asList(Operation.values()).stream()
                .map(Operation::getSymbol).collect(Collectors.joining(" ")) + "\n");
        console.printf("Type exit to close calculator.\n");
    }

    public void displayError(String message) {
        console.printf(ERROR + message + "\n");
    }

    public void displayResult(Number result) {
        console.printf("%s\n", result.toString());
    }

    public String getClientOperation() {
        console.printf(PROMPT);
        return console.readLine();
    }

    public void close() {
        console.printf("Goodbye!\n");
    }

}
