package State;

class Pokemon {
    private State currentState;

    public Pokemon() {
        currentState = new CharmanderState();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void attack() {
        currentState.attack();
    }

    public void defend() {
        currentState.defend();
    }

    public void rest() {
        currentState.rest();
    }

    public void evolve() {
        if (currentState instanceof CharmanderState) {
            currentState = new CharmeleonState();
            System.out.println("Charmander has evolved into Charmeleon!");
        } else if (currentState instanceof CharmeleonState) {
            currentState = new CharizardState();
            System.out.println("Charmeleon has evolved into Charizard!");
        }
    }
}