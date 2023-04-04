package Memento;

public class Pelaaja implements Runnable {
    private final Arvuuttaja arvuuttaja;

    public Pelaaja(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        int arvaus = 0;
        while (!arvuuttaja.arvaa(arvaus)) {
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
