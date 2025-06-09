package com.factory.zahlarten;

public class ZahlartUeberweisung implements IZahlart {

    @Override
    public void bezahlen() {
        System.out.println("Du bezahlst per Ueberweisung");
    }

}
