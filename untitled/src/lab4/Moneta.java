package lab4;
import java.util.Random;
public class Moneta {
    private Random random;

    public Moneta() {
        random = new Random();
    }

    public boolean rzut() {
        int wynik = random.nextInt(2);
        return wynik == 0;
    }
}
