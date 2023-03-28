package Visitor;

public class IdleState implements State {
    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("Please insert a card first.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Please enter your PIN first.");
    }
}

