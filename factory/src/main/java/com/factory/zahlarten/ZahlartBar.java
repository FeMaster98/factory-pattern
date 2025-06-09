package com.factory.zahlarten;

public class ZahlartBar implements IZahlart {

    @Override
    public void bezahlen() {
        System.out.println("Du bezahlst in Bar");
    }

}
