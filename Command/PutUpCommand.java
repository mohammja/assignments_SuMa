package Command;

public class PutUpCommand implements Command{

    private final Valkokangas valkokangas;

    public PutUpCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override //Command
    public void execute() {
        valkokangas.up();
    }
}
