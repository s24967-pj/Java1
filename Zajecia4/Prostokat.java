package com.company;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc {
    public int b;
    public int p;
    public boolean kwadrat;
    public boolean prostokat;

    public Prostokat(int i) {
        this.b = i;
        this.p = i;
        this.kwadrat = true;
    }

    public Prostokat(int i, int j) {
        this.b = i;
        this.p = j;
        this.prostokat = true;
    }

    @Override
    public double bok() {
        return b;
    }

    @Override
    public double podstawa() {
        return p;
    }

    @Override
    public double katNachylenia() {
        return Math.PI / 2;
    }

    @Override
    public double przekatna() {
        return Math.sqrt((b * b) +(p * p));
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return this.przekatna() * v;
    }

    @Override
    public int wielokrotnoscPrzekatnej(int v) {
        return (int) (this.przekatna() * v);
    }

    @Override
    public double wysokosc() {
        return b;
    }

    @Override
    public String toString() {


        if(kwadrat) {
            return "kwadrat";
        }
        else if (prostokat) {
            return "prostokat";
        }
        return "blad";
    }

    @Override
    public boolean equals(Object o) {

        if(o.getClass() == Kwadrat.class)
        {
            return true;
        }

        return o instanceof MaWlasnosciRownolegloboku;
    }
}
