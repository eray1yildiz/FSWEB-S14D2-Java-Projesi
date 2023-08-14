package com.workintech.composition.model;

import com.workintech.composition.enums.PaintColor;

public class Carpet {

    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");

    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Width: " + width + "\n");
        build.append("Height: " + height + "\n");
        build.append("Color: " + color + "\n");
        return build.toString();

    }
}
