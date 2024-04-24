package lab6;

public class Main1 {
    public static void main(String[] args) {
        // Testowanie rozwiązania
        Pracownik[] pracownicy = {
                new Pracownik("Jan", "Kowalski", 100),
                new Pracownik("Anna", "Nowak", 120)
        };
        Firma firma = new Firma(pracownicy);
        System.out.println("Miesięczny koszt firmy: " + firma.obliczMiesiecznyKosztFirmy());
        System.out.println("Roczny koszt firmy: " + firma.obliczRocznyKosztFirmy());
        System.out.println("Koszt firmy przez 6 miesięcy: " + firma.obliczKosztFirmy(Czas.MIESIAC, 6));
    }
}
