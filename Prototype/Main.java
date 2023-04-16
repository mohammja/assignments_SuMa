package Prototype;

public class Main {
    public static void main(String[] args) {

        // create a clock object with a mutable timezone object
        Timezone timezone = new Timezone("GMT +1");
        Time time = new Time(12, 0, 0);
        Clock clock = new Clock(time, timezone);

        Clock deepCopy = clock.clone();
        Clock shallowCopy = clock;  //shallow copy

        for (int i = 0; i < 10; i++) {
            clock.tick();
        }

        clock.setTimezone(new Timezone("GMT +2"));

        System.out.println("Original clock: " + clock);
        System.out.println("Deep copy: " + deepCopy);
        System.out.println("Shallow copy: " + shallowCopy);


        //deepCopy is a deep copy of clock, so changing the timezone of clock does not affect deepCopy
        //shallowCopy is a shallow copy of clock, so changing the timezone of clock does affect shallowCopy
    }
}

