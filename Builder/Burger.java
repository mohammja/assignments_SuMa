package Builder;

public class Burger {       //product class
    private String bun;
    private String patty;
    private String cheese;
    private String salad;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return "Your burger: "+bun + ", " + patty + ", " + cheese + ", " + salad;
    }
}
