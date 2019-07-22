package com.example.a8;

public class Bottle {

    private String nimi;
    private String valmistaja;
    private double energiaMaara;
    private double koko;
    private double hinta;

    public Bottle() {
        nimi = "Pepsi Max";
        valmistaja = "Pepsi";
        energiaMaara = 0.3;
        koko = 0.5;
        hinta = 1.80;
    }

    public Bottle (String _nimi, String _valmistaja, double _energiaMaara, double _koko, double _hinta ) {
        nimi = _nimi;
        valmistaja = _valmistaja;
        energiaMaara = _energiaMaara;
        koko = _koko;
        hinta = _hinta;

    }

    public String getNimi() {
        return nimi;
    }

    public double getHinta() {
        return hinta;
    }

    public double getKoko(){
        return koko;
    }
}
