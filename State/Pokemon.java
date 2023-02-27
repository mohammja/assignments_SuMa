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
}