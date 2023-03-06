package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("blue");
        colours.add("yellow");
        colours.add("green");
        colours.add("white");
        colours.add("black");

        ListConverter strategy1 = new Strategy1();
        ListConverter strategy2 = new Strategy2();
        ListConverter strategy3 = new Strategy3();


        System.out.println("Strategy1:");
        System.out.println(strategy1.listToString(colours));

        System.out.println("Strategy2:");
        System.out.println(strategy2.listToString(colours));

        System.out.println("Strategy3:");
        System.out.println(strategy3.listToString(colours));
    }
}
