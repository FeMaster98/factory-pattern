package com.factory;

import java.io.IOException;
import java.util.Scanner;

import com.factory.zahlarten.IZahlart;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deine gewuenschte Zahlart ein:");
        String input = scanner.nextLine();

        IZahlart zahlart =  ZahlartFactory.getInstance(input);
        zahlart.bezahlen();
        scanner.close();
    }
}