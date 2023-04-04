package Memento;

public class Arvuuttaja {
    private final Memento memento;
    private int randomNum;

    public Arvuuttaja() {
        randomNum = (int) (Math.random() * 30) + 1;
        memento = new Memento(randomNum);
    }

    public boolean arvaa(int arvaus) {
        if (arvaus == randomNum) {
            System.out.println("Arvasit oikein!");
            return true;
        } else if (arvaus < randomNum) {
            System.out.println("Arvattu luku on suurempi.");
            return false;
        } else {
            System.out.println("Arvattu luku on pienempi.");
            return false;
        }
    }
}
