package State;

public class CharmanderState implements State{
    public void attack() {
        System.out.println("Charmander uses Ember!");
    }

    public void defend() {
        System.out.println("Charmander curls up into a defensive stance.");
    }

    public void rest() {
        System.out.println("Charmander takes a nap.");
    }
}
