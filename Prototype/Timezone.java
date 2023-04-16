package Prototype;

public class Timezone implements Cloneable {
    private String timezone;

    public Timezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public Timezone clone() {
        try {
            return (Timezone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
