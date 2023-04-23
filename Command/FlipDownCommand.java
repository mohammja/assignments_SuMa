package Command;

public class FlipDownCommand implements Command {  //ConcreteCommand

    private final Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override //Command
    public void execute() {
        light.turnOff();
    }

}
