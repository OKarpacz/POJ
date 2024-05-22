package lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Slownik<K, V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[]) new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartosc) {
        int indeks = znajdzIndeks(klucz);
        if (indeks != -1) {
            wartosci[indeks] = wartosc;
            return true;
        }

        int wolnyIndeks = pierwszyWolnyIndeks();
        if (wolnyIndeks == -1) {
            return false;
        }

        klucze[wolnyIndeks] = klucz;
        wartosci[wolnyIndeks] = wartosc;
        return true;
    }

    public boolean czyZawiera(K klucz) {
        return znajdzIndeks(klucz) != -1;
    }

    private int pierwszyWolnyIndeks() {
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private int znajdzIndeks(K klucz) {
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i] != null && klucze[i].equals(klucz)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("[");
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i] != null) {
                buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
            }
        }
        if (buffer.length() > 1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file) {
        Slownik<String, String> slownik = new Slownik<>(10);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("->");
                if (parts.length == 2) {
                    String klucz = parts[0].trim();
                    String wartosc = parts[1].trim();
                    slownik.dodaj(klucz, wartosc);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return slownik;
    }

    // Przykładowe testy
    public static void main(String[] args) {
        Slownik<String, String> slownik = wczytajSlownik(new File("path/to/your/file.txt"));
        System.out.println("Slownik: " + slownik);
        System.out.println("Czy zawiera 'klucz1': " + slownik.czyZawiera("klucz1"));
        System.out.println("Czy zawiera 'klucz2': " + slownik.czyZawiera("klucz2"));
    }
}
