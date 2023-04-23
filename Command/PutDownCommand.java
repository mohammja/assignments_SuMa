package Command;

public class PutDownCommand implements Command{

    private final Valkokangas valkokangas;

    public PutDownCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override //Command
    public void execute() {
        valkokangas.down();
    }
}
