package com.workintech.composition.model;
import com.workintech.composition.enums.LampType;
public class Lamp {

    private LampType style;
    private Boolean battery;
    private int globRating;

    public Lamp(LampType style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LampType getStyle() {
        return style;
    }

    public Boolean getBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Style: " + style + "\n");
        build.append("Battery: " + battery + "\n");
        build.append("Glob Rating: " + globRating + "\n");
        return build.toString();

    }
}
