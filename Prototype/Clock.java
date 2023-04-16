package Prototype;

public class Clock implements Cloneable {

    private Time time;
    private Timezone timezone;

    public Clock(Time time, Timezone timezone) {
        this.time = time;
        this.timezone = timezone;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }


    public void tick() {
        time.tick();
    }

    public String toString() {
        return time.toString() + " " + timezone.getTimezone();
    }


    @Override
    public Clock clone() {
        try {
            Clock cloned = (Clock) super.clone();
            cloned.time = this.time.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}

