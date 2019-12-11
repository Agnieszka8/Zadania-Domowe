package Grudzien11122019ZadaniaDomowe;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        //podpunkt a
        System.out.println("Podaj tekst:");
        Scanner slowo = new Scanner(System.in);
        String tekst = slowo.nextLine();
        if (tekst.contains("ania") == true) {
            System.out.println("Podane słowo jest prawidłowe");
        } else {
            System.out.println("To nie jest to słowo");
        }
//podpunkt b
        if (tekst.startsWith("ania") == true) {
            System.out.println("Tekst zaczyna się prawidłowo");
        } else {
            System.out.println("Tekst  nie zaczyna się od słowa ania");
        }
        //podpunkt c
        if (tekst.endsWith("ania") == true) {
            System.out.println("Tekst kończy się prawidłowo");
        } else {
            System.out.println("Tekst  nie kończy się od słowa ania");
        }
        //podpunkt d

        if (tekst.equals("ania")) {
            System.out.println("Podane słowo jest prawidłowe");
        } else {
            System.out.println("To nie jest to słowo");
        }
        //podpunkt e
        if (tekst.toLowerCase().contains("ania")) {
            System.out.println("ok");
        } else {
            System.out.println("Nie ok");
        }
//podpunkt f

        int indeks = tekst.indexOf("ania");
        System.out.println(indeks);

    }


}
