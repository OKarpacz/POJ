package lab4;
import java.util.Scanner;

public class Wyscig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię pierwszego zawodnika:");
        String imie1 = scanner.nextLine();
        System.out.println("Podaj minimalną prędkość pierwszego zawodnika:");
        int predkoscMin1 = scanner.nextInt();
        System.out.println("Podaj maksymalną prędkość pierwszego zawodnika:");
        int predkoscMax1 = scanner.nextInt();

        System.out.println("Podaj imię drugiego zawodnika:");
        String imie2 = scanner.next();
        System.out.println("Podaj minimalną prędkość drugiego zawodnika:");
        int predkoscMin2 = scanner.nextInt();
        System.out.println("Podaj maksymalną prędkość drugiego zawodnika:");
        int predkoscMax2 = scanner.nextInt();

        System.out.println("Podaj imię trzeciego zawodnika:");
        String imie3 = scanner.next();
        System.out.println("Podaj minimalną prędkość trzeciego zawodnika:");
        int predkoscMin3 = scanner.nextInt();
        System.out.println("Podaj maksymalną prędkość trzeciego zawodnika:");
        int predkoscMax3 = scanner.nextInt();

        Zawodnik zawodnik1 = new Zawodnik(imie1, predkoscMin1, predkoscMax1, 10);
        Zawodnik zawodnik2 = new Zawodnik(imie2, predkoscMin2, predkoscMax2, 11);
        Zawodnik zawodnik3 = new Zawodnik(imie3, predkoscMin3, predkoscMax3, 12);

        scanner.close();

        while (true) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();

            if (zawodnik1.getPokonanaOdleglosc() >= 50) {
                System.out.println(zawodnik1.getImie() + " zwyciężył!");
                break;
            } else if (zawodnik2.getPokonanaOdleglosc() >= 50) {
                System.out.println(zawodnik2.getImie() + " zwyciężył!");
                break;
            } else if (zawodnik3.getPokonanaOdleglosc() >= 50) {
                System.out.println(zawodnik3.getImie() + " zwyciężył!");
                break;
            }
        }
    }
}
