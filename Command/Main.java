package Command;

public class Main {

    public static void main(String[] args) {

        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);
        button1.push();
        button2.push();

        // Valkokangas example:
        Valkokangas kangas = new Valkokangas();
        Command kangasUp = new PutUpCommand(kangas);
        Command kangasDown = new PutDownCommand(kangas);
        WallButton button3 = new WallButton(kangasUp);
        WallButton button4 = new WallButton(kangasDown);
        button3.push();
        button4.push();
    }

}
