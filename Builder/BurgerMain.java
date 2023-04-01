package Builder;

public class BurgerMain {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        IBurgerBuilder hesburger = new HesburgerBuilder();

        director.setBurgerBuilder(hesburger);
        director.constructBurger();

        System.out.println(hesburger.getBurger());

        IBurgerBuilder mcdonald = new McDonaldsBuilder();

        director.setBurgerBuilder(mcdonald);
        director.constructBurger();

        System.out.println(mcdonald.getBurger());

    }
}
