package State;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon();

        for (int i = 0; i < 9; i++) {
            charmander.attack();
            charmander.defend();
            charmander.rest();
            System.out.println();

            if ((i + 1) % 3 == 0) {
               charmander.evolve();
                }
            }
        }
    }





