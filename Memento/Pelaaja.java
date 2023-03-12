package Memento;

public class Pelaaja implements Runnable {

    private final Arvuuttaja arvuuttaja;
    private final Memento memento;



    public Pelaaja(Arvuuttaja arvuuttaja1, Memento memento1) {
        this.arvuuttaja = arvuuttaja1;
        this.memento = memento1;
    }

    @Override
    public void run() {
        int arvaus = 0;
        while (!arvuuttaja.arvaa(memento, arvaus)) {
            arvaus = arvaus();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int arvaus() {
        return ((int) (Math.random() * 30) + 1);
    }
}
