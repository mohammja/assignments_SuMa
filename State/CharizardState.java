package State;

public class CharizardState implements State{
    public void attack() {
        System.out.println("Charizard uses Fire Blast!");
    }

    public void defend() {
        System.out.println("Charizard spreads its wings to deflect incoming attacks.");
    }

    public void rest() {
        System.out.println("Charizard takes a moment to cool off.");
    }
}
