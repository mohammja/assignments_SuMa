package Builder;

public class Bun {
    private String type;
    public Bun(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public String toString() {
        return type + " Bun";
    }
}
