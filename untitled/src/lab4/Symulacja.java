package lab4;

import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość prób: ");
        int iloscProb = scanner.nextInt();

        Moneta moneta = new Moneta();
        int iloscOrzel = 0;

        for (int i = 0; i < iloscProb; i++) {
            if (moneta.rzut()) {
                iloscOrzel++;
            }
        }

        int iloscReszka = iloscProb - iloscOrzel;

        double procentOrzel = ((double) iloscOrzel / iloscProb) * 100;
        double procentReszka = ((double) iloscReszka / iloscProb) * 100;

        System.out.printf("%.2f%% orzeł | %.2f%% reszka dla %d rzutów.\n", procentOrzel, procentReszka, iloscProb);
    }
}
