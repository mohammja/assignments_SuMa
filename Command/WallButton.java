package Command;

public class WallButton {   //Invoker

    private Command command;

    public WallButton(Command command) {
        this.command = command;
    }

    public void push() {
        command.execute();
    }
}
