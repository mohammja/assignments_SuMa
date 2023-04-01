package Builder;

public class Patty {
    private String type;
    public Patty(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public String toString() {
        return type + " Patty";
    }
}
