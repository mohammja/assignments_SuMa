package State;

public class CharmeleonState implements State{
    public void attack() {
        System.out.println("Charmeleon uses Flamethrower!");
    }

    public void defend() {
        System.out.println("Charmeleon deflects attacks with its scaly skin.");
    }

    public void rest() {
        System.out.println("Charmeleon takes a rest, preparing for the next battle.");
    }
}
