package com.factory.zahlarten;

public class ZahlartEC implements IZahlart {
    
    @Override
    public void bezahlen() {
        System.out.println("Du bezahlst mit EC-Karte");
    }

}
