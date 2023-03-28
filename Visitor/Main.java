package Visitor;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // Insert a card
        atm.insertCard();

        // Check if the state should change
        atm.checkStateChange(new ATMVisitor());

        // Enter a PIN
        atm.enterPin("1234");

        // Check if the state should change
        atm.checkStateChange(new ATMVisitor());

//        // Withdraw cash
//        atm.withdrawCash(100);

        // Check if the state should change
        atm.checkStateChange(new ATMVisitor());
    }
}
