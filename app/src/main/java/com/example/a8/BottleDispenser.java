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
    public double getRahaa() {
        return rahaa;
    }

    public void lisaaRahaa(int maara) {
        rahaa += maara;
    }

    public boolean ostaPullo(int lkm) {
        Bottle pullo = pullo_list.get(lkm);
        if(rahaa >= pullo.getHinta()){
            System.out.println("KACHUNK! " + pullo.getNimi() + " tipahti masiinasta!");
            rahaa -= pullo.getHinta();
            pullolkm -= 1;
            //pullo_list.remove(lkm);
            return true;
        } else {
            System.out.println("Syötä rahaa ensin!");
            return false;
        }
    }

    public void palautaRahat() {
        System.out.printf("Klink klink. Sinne menivät rahat! Rahaa tuli ulos %.2f€\n", rahaa);
        rahaa = 0;
    }

    public ArrayList<Bottle> getPullo_list() {
        return pullo_list;
    }



}
