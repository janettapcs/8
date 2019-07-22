package com.example.a8;

import java.util.ArrayList;

public class BottleDispenser {
    private static final BottleDispenser ourInstance = new BottleDispenser();

    public static BottleDispenser getInstance() {
        return ourInstance;
    }

    private int pullolkm;
    private double rahaa;
    private ArrayList<Bottle> pullo_list;

    private BottleDispenser() {
        pullolkm = 6;
        rahaa = 0;

        pullo_list = new ArrayList();
        pullo_list.add(new Bottle("Pepsi Max", "Pepsi", 1.0, 0.5, 1.8));
        pullo_list.add(new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        pullo_list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 1.0, 0.5, 2.0));
        pullo_list.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 1.0, 1.5, 2.5));
        pullo_list.add(new Bottle("Fanta Zero", "Coca-Cola", 1.0, 0.5, 1.95));
        pullo_list.add(new Bottle("Fanta Zero", "Coca-Cola", 1.0, 0.5, 1.95));

    }
}
