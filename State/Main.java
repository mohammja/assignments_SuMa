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
                switch (i) {
                    case 2:
                        charmander.setState(new CharmeleonState());
                        System.out.println("Charmander has evolved into Charmeleon!");
                        break;
                    case 5:
                        charmander.setState(new CharizardState());
                        System.out.println("Charmeleon has evolved into Charizard!");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}




