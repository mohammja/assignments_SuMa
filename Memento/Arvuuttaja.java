package Memento;

public class Arvuuttaja {

    private int randomNum;

    public Memento liityPeliin() {
        randomNum = (int) (Math.random() * 30) + 1;
        return new Memento(randomNum);
    }

    public boolean arvaa(Memento memento, int arvaus) {
        int tallennettuLuku = memento.getNum();
        if (arvaus == tallennettuLuku) {
            System.out.println("Arvasit oikein!");
            return true;
        } else if (arvaus < tallennettuLuku) {
            System.out.println("Arvattu luku on suurempi.");
            return false;
        } else {
            System.out.println("Arvattu luku on pienempi.");
            return false;
        }

    }
}
