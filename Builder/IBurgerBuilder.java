package Builder;

public interface IBurgerBuilder {
    void buildBun();
    void buildPatty();
    void buildCheese();
    void buildSalad();
    public abstract Burger getBurger();
}
