package Builder;

public class Cheese {
    private String type;
    public Cheese(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public String toString() {
        return type + " Cheese";
    }
}
