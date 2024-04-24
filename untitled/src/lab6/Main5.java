package lab6;

public class Main5 {

        public static void main(String[] args) {
            Samochod samochod1 = new Samochod("Czerwony", "BMW", 2000);
            Samochod samochod2 = new Samochod("Czerwony", "BMW", 2000);
            SzybkiSamochod szybkiSamochod = new SzybkiSamochod("Czerwony", "BMW", 2000);

            samochod1.przyspiesz();
            szybkiSamochod.przyspiesz();

            System.out.println("Opis samochodu: " + samochod1);
            System.out.println("Opis szybkiego samochodu: " + szybkiSamochod);

            System.out.println("Czy samochód 1 jest taki sam jak samochód 2? " + samochod1.equals(samochod2));
            System.out.println("Czy samochód 1 jest taki sam jak szybki samochód? " + samochod1.equals(szybkiSamochod));
            System.out.println("Czy szybki samochód jest taki sam jak samochód 2? " + szybkiSamochod.equals(samochod2));
        }
    }

