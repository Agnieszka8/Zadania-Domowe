package Grudzien11122019ZadaniaDomowe;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("Wczytaj tekst");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Wczytaj słowo");
        Scanner scanner1 = new Scanner(System.in);
        String searched = scanner1.nextLine();

        if (text.contains(searched) == true) {
            System.out.println("Słowo znajduje się w tekście");

        } else {
            System.out.println("Slowa nie ma w tekście");
        }
    }
}