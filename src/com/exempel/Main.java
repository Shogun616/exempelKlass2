package com.exempel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in hastigheten för din Saab: ");
        String hastSaab = scan.nextLine();

        System.out.println("Skriv in hastigheten för din Volvo: ");
        String hastVolvo = scan.nextLine();

        Bil saab = new Bil("1.2", "röd", hastSaab);
        Bil volvo = new Bil("1.6", "blå", hastVolvo);

        System.out.println(saab.bilInfo("Saab"));
        System.out.println(volvo.bilInfo("Volvo"));

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
    }
}
