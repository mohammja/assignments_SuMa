package Builder;

import java.util.ArrayList;

public class HesburgerBuilder implements IBurgerBuilder{

    private ArrayList<Object> components;

    public HesburgerBuilder() {
        components = new ArrayList<>();
    }

    @Override
    public void buildBun() {
        components.add(new Bun("Sesame"));
    }

    @Override
    public void buildPatty() {
        components.add(new Patty("Veg"));
    }

    @Override
    public void buildCheese() {
        components.add(new Cheese("Stilton"));
    }

    @Override
    public void buildSalad() {
        components.add(new Salad("Iceberg"));
    }

    @Override
    public Burger getBurger() {
        Burger burger = new Burger();
        burger.setBun(components.get(0).toString());
        burger.setPatty(components.get(1).toString());
        burger.setCheese(components.get(2).toString());
        burger.setSalad(components.get(3).toString());
        return burger;
    }
}
