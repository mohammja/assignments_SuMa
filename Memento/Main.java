package Memento;

public class Main {
    public static void main(String[] args) {

        int numOfPelaajat = 3;

        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Pelaaja[] pelaajat = new Pelaaja[numOfPelaajat];

        for (int i = 0; i < numOfPelaajat; i++) {
            pelaajat[i] = new Pelaaja(arvuuttaja, arvuuttaja.liityPeliin());
        }

        for (Pelaaja pelaaja : pelaajat) {
            Thread pelaaja1 = new Thread(pelaaja);
            pelaaja1.start();
        }
    }
}
