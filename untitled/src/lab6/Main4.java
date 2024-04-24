package lab6;

public class Main4 {
        public static void main(String[] args) {
            Czas czas1 = new Czas(10, 30);
            Czas czas2 = new Czas(4, 45);

            System.out.println("Czas 1: " + czas1);
            System.out.println("Czas 2: " + czas2);

            Czas suma = czas1.dodaj(czas2);
            System.out.println("Suma czasów: " + suma);

            Czas roznica = czas1.odejmij(czas2);
            System.out.println("Różnica czasów: " + roznica);

            Czas pomnozony = czas1.pomnóż(2);
            System.out.println("Czas pomnożony przez 2: " + pomnozony);
        }
    }
