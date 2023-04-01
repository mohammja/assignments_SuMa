package Builder;

public class BurgerDirector {
    private IBurgerBuilder burgerBuilder;
    public void setBurgerBuilder(IBurgerBuilder bb){
        this.burgerBuilder = bb;
    }

    public void constructBurger(){
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSalad();
    }
}
