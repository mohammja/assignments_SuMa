package Builder;

public class McDonaldsBuilder implements IBurgerBuilder{
    private StringBuilder components;

    public McDonaldsBuilder (){
        components = new StringBuilder();
    }

    @Override
    public void buildBun() {
        components.append("Burger Bun, ");
    }

    @Override
    public void buildPatty() {
        components.append("Beef Patty, ");
    }

    @Override
    public void buildCheese() {
        components.append("Cheddar Cheese, ");
    }

    @Override
    public void buildSalad() {
        components.append("Iceberg Salad, ");
    }

    @Override
    public Burger getBurger() {
        Burger burger = new Burger();
        String[] componentsArray = components.toString().split(", ");
        burger.setBun(componentsArray[0]);
        burger.setPatty(componentsArray[1]);
        burger.setCheese(componentsArray[2]);
        burger.setSalad(componentsArray[3]);
        return burger;
    }
}
