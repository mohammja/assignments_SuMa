package Visitor;

import java.util.Scanner;

public class ATM {
    private State currentState;
    private int availableCash = 1000;

    public ATM() {
        currentState = new IdleState();
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public State getState() {
        return currentState;
    }

    public int getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(int availableCash) {
        this.availableCash = availableCash;
    }

    // Delegate the method calls to the current state object
    public void insertCard() {
        currentState.insertCard();
    }

    public void enterPin(String pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }

    public int getAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: €");
        int amount = scanner.nextInt();
        return amount;
    }

    // Check if the state should change based on the Visitor's decision
    public void checkStateChange(Visitor visitor) {
        State nextState = visitor.getNextState(this);
        if (nextState != null) {
            setState(nextState);
        }
    }
}