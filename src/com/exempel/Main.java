package com.exempel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in hastigheten för din Saab: ");
        String hastSaab = scan.nextLine();

        System.out.println("Skriv in hastigheten för din Volvo: ");
        String hastVolvo = scan.nextLine();

        Bil saab = new Bil("1.2", "röd",hastSaab, "1986", "2");
        Bil volvo = new Bil("1.6", "blå", hastVolvo, "2006", "4");

        System.out.println(saab.bilInfo());
        System.out.println(volvo.bilInfo());

        if (Integer.parseInt(saab.getHastighet()) > Integer.parseInt(volvo.getHastighet())){
            System.out.println("Saab är snabbast!");
        }else {
            System.out.println("Volvo är snabbast");
        }

        System.out.println("Skriv in en ny färg för din Saab: ");
        saab.setFarg(scan.nextLine());

        System.out.println("Skriv in en ny färg för din Volvo: ");
        volvo.setFarg(scan.nextLine());

        System.out.println("Din Saab har nu färgen: " + saab.getFarg());
        System.out.println("Din Volvo har nu färgen: " + volvo.getFarg());

        System.out.println("Skriv in antal dörrar för din Saab: ");
        saab.setDoor(scan.nextLine());

        System.out.println("Skriv in antal dörrar för din Volvo: ");
        volvo.setDoor(scan.nextLine());

        System.out.println("Din Saab har nu: "  + saab.getDoor() + " dörrar");
        System.out.println("Din Volvo har nu: "  + volvo.getDoor() + " dörrar");
    }
}
