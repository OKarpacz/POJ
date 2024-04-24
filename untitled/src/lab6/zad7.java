package lab6;


public class zad7 {
    public static void main(String[] args) {
        // Testowanie rozwiązania
        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {4, 5, 6, 7};
        System.out.println(sumujTablice(tablica1, tablica2)); // Oczekiwany wynik: 28
    }

    public static int sumujTablice(int[]... tablice) {
        int suma = 0;
        for (int[] tablica : tablice) {
            for (int liczba : tablica) {
                suma += liczba;
            }
        }
        return suma;
    }
}
