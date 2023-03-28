package Visitor;

public interface State {
    void insertCard();
    void enterPin(String pin);
    void withdrawCash(int amount);
}