package Visitor;

public class ATMVisitor implements Visitor {
    public State getNextState(ATM atm) {
        int availableCash = atm.getAvailableCash();
        State currentState = atm.getState();

        if (availableCash == 0) {
            System.out.println("No cash available. Please try again later.");
            return new IdleState();
        }

        if (currentState instanceof IdleState) {
            return new PinState();
        }

        if (currentState instanceof PinState) {
            return new WithdrawState();
        }

        if (currentState instanceof WithdrawState) {
            int amount = atm.getAmount();
            if (amount > availableCash) {
                System.out.println("Insufficient funds. Please try a smaller amount.");
                return new WithdrawState();
            } else {
                atm.setAvailableCash(availableCash - amount);
                atm.withdrawCash(amount);
                return new IdleState();
            }
        }

        return null;
    }
}
