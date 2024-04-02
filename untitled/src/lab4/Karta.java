package lab4;
import lab4.Kolor;
import lab4.Figura;
public class Karta {
    private final Kolor kolor;
    private final Figura figura;

    public Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    public String toString() {
        return figura + " " + kolor;
    }

    public static void main(String[] args) {
        for (Kolor kolor : Kolor.values()) {
            for (Figura figura : Figura.values()) {
                Karta karta = new Karta(kolor, figura);
                System.out.println(karta);
            }
        }
    }
}
