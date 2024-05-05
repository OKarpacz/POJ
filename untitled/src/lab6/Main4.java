package lab6;

public class Main4 {
    public static void main(String[] args) {
        Time time1 = new Time(10, 30);
        Time time2 = new Time(4, 45);

        System.out.println("Czas 1: " + time1);
        System.out.println("Czas 2: " + time2);

        Time suma = time1.dodaj(time2);
        System.out.println("Suma czasów: " + suma);

        Time roznica = time1.odejmij(time2);
        System.out.println("Różnica czasów: " + roznica);

        Time pomnozony = time1.pomnóż(2);
        System.out.println("Czas pomnożony przez 2: " + pomnozony);
    }
}
