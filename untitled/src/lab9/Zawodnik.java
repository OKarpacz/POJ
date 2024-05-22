package lab9;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Zawodnik {
    private String imie;
    private String nazwisko;
    private int numer;
    private int predkoscMax;

    public Zawodnik(String imie, String nazwisko, int numer, int predkoscMax) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.predkoscMax = predkoscMax;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumer() {
        return numer;
    }

    public int getPredkoscMax() {
        return predkoscMax;
    }

    public static class ImieComparator implements Comparator<Zawodnik> {
        @Override
        public int compare(Zawodnik z1, Zawodnik z2) {
            return z1.getImie().compareTo(z2.getImie());
        }
    }

    public static class NumerComparator implements Comparator<Zawodnik> {
        @Override
        public int compare(Zawodnik z1, Zawodnik z2) {
            return Integer.compare(z1.getNumer(), z2.getNumer());
        }
    }

    public static class PredkoscMaxComparator implements Comparator<Zawodnik> {
        @Override
        public int compare(Zawodnik z1, Zawodnik z2) {
            return Integer.compare(z1.getPredkoscMax(), z2.getPredkoscMax());
        }
    }

    // Przykładowe testy
    public static void main(String[] args) {
        List<Zawodnik> zawodnicy = new ArrayList<>();
        zawodnicy.add(new Zawodnik("Adam", "Kowalski", 10, 100));
        zawodnicy.add(new Zawodnik("Zbigniew", "Nowak", 5, 95));
        zawodnicy.add(new Zawodnik("Karol", "Lewandowski", 3, 110));
        Collections.sort(zawodnicy, new ImieComparator());
        for (Zawodnik z : zawodnicy) {
            System.out.println(z.getImie());
        }

        Collections.sort(zawodnicy, new NumerComparator());
        for (Zawodnik z : zawodnicy) {
            System.out.println(z.getNumer());
        }

        Collections.sort(zawodnicy, new PredkoscMaxComparator());
        for (Zawodnik z : zawodnicy) {
            System.out.println(z.getPredkoscMax());
        }
    }
}