package com.factory;

import java.io.EOFException;
import java.io.IOException;

import com.factory.zahlarten.IZahlart;
import com.factory.zahlarten.ZahlartBar;
import com.factory.zahlarten.ZahlartEC;
import com.factory.zahlarten.ZahlartUeberweisung;

public class ZahlartFactory {
    public static IZahlart getInstance(String zahlart) throws IOException {
        if (zahlart.equals("Bar"))
            return new ZahlartBar();
        else if (zahlart.equals("Ueberweisung"))
            return new ZahlartUeberweisung();
        else if (zahlart.equals("EC-Karte"))
            return new ZahlartEC();
        else
            throw new EOFException();
    }
}
