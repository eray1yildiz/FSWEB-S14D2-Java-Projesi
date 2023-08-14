package com.workintech.composition.main;

import com.workintech.composition.enums.LampType;
import com.workintech.composition.enums.PaintColor;
import com.workintech.composition.model.*;
import com.workintech.composition.model.Bedroom;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("Yıldız",
                new Wall("North"),
                new Wall("South"),
                new Wall("East"),
                new Wall("West"),
                new Ceiling(3, PaintColor.BlACK),
                new Bed("Double", 1, 3, 2, 2),
                new Lamp(LampType.LED, true, 2),
                new Wardrobe(1, 2, 40),
                new Carpet(2, 4, PaintColor.BlUE));
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println(bedroom);

    }
}