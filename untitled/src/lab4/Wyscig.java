package lab4;

public class Wyscig {
    //Poprawienie tutaj tego i dodanie Scanner dla lepszego uzytkowania
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Adam", 5, 10);
        Zawodnik zawodnik2 = new Zawodnik("Bartek", 6, 11);
        Zawodnik zawodnik3 = new Zawodnik("Cezary", 7, 12);

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
