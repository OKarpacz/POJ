package lab6;

public class Main2 {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajPozycje(new Pozycja("Chleb", 2, 2.00));
        zamowienie.dodajPozycje(new Pozycja("Banany", 1, 6.00));
        System.out.println(zamowienie);
    }
}
