package Visitor;

public class WithdrawState implements State {
    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("PIN already entered.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Withdrawing " + amount + " euros...");
    }
}
