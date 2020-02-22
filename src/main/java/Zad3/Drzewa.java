package Zad3;

import java.util.LinkedList;

public class Drzewa {
    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    int wartosc;

    public Drzewa getL() {
        return l;
    }

    public void setL(Drzewa l) {
        this.l = l;
    }

    Drzewa l;

    public Drzewa getP() {
        return p;
    }

    public void setP(Drzewa p) {
        this.p = p;
    }

    Drzewa p;

    public Drzewa(int wartosc, Drzewa l, Drzewa p) {
        this.wartosc = wartosc;
        this.l = l;
        this.p = p;
    }
}
