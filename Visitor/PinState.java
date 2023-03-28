package Visitor;

public class PinState implements State {
    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("PIN entered: " + pin);
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Please select an amount to withdraw first.");
    }
}
