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

        ListConverter converter;

        converter = new Strategy1();
        String result = converter.listToString(colours);
        System.out.println("Strategy1:");
        System.out.println(result);

        converter = new Strategy2();
        result = converter.listToString(colours);
        System.out.println("Strategy2:");
        System.out.println(result);

        converter = new Strategy3();
        result = converter.listToString(colours);
        System.out.println("Strategy3:");
        System.out.println(result);
    }
}
