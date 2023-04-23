package Command;

public class FlipUpCommand implements Command {  //ConcreteCommand

    private final Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override //Command
    public void execute() {
        light.turnOn();
    }
}

