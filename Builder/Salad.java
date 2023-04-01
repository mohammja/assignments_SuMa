package Builder;

public class Salad {
    private String type;
    public Salad(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public String toString() {
        return type + " Salad";
    }
}
