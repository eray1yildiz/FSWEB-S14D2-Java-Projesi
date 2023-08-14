package com.workintech.composition.model;

import com.workintech.composition.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintColor;

    public Ceiling(int height, PaintColor paintColor) {
        this.height = height;
        this.paintColor = paintColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintColor() {
        return paintColor;
    }

    public void create(){
        System.out.println("Height: " + height + "Paint Color: " + paintColor);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Height: " + height + "\n");
        build.append("Painted Color: " + paintColor + "\n");
        return build.toString();
        //return "height: " + height + ", paintedColor: " + paintedColor;
    }
}
