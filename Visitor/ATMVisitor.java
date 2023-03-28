package Visitor;

public class ATMVisitor implements Visitor{
    public State getNextState(ATM atm) {
        State nextState = null;
        if (atm.getAvailableCash() == 0) {
            System.out.println("No cash available. Please try again later.");
            nextState = new IdleState();
        } else if (atm.getState() instanceof IdleState) {
            nextState = new PinState();
        } else if (atm.getState() instanceof PinState) {
            nextState = new WithdrawState();
        } else if (atm.getState() instanceof WithdrawState) {
            int amount = atm.getAmount();
            if (amount > atm.getAvailableCash()) {
                System.out.println("Insufficient funds. Please try a smaller amount.");
                nextState = new WithdrawState();
            } else {
                // Update the available cash and return to the IdleState
                atm.setAvailableCash(atm.getAvailableCash() - amount);
                atm.withdrawCash(amount);
                nextState = new IdleState();
            }
        }
        return nextState;
    }
}
