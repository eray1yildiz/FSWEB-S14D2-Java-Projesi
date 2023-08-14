package com.workintech.composition.model;

public class Bedroom extends Room{

    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, ceiling);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }


    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Bedroom:" + "\n");
        build.append("\n" + "Name: " + getName() + "\n");
        build.append("Wall1: " + getWall1() + "\n");
        build.append("Wall2: " + getWall2() + "\n");
        build.append("Wall3: " + getWall3() + "\n");
        build.append("Wall4: " + getWall4() + "\n");
        build.append("Ceiling: " + getCeiling() + "\n");
        build.append("Bed: " + bed + "\n");
        build.append("Lamp: " + lamp + "\n");
        build.append("Wardrobe: " + wardrobe + "\n");
        build.append("Carpet: " + carpet + "\n");
        return build.toString();
    }
}
