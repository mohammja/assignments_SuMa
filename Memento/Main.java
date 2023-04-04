package Memento;

public class Main {
    public static void main(String[] args) {

        int numOfPelaajat = 3;

        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Pelaaja[] pelaajat = new Pelaaja[numOfPelaajat];

        for (int i = 0; i < numOfPelaajat; i++) {
            pelaajat[i] = new Pelaaja(arvuuttaja);
        }

        for (Pelaaja pelaaja : pelaajat) {
            Thread pelaajaThread = new Thread(pelaaja);
            pelaajaThread.start();
        }
    }
}
