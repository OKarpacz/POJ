package lab10;
import java.util.*;
public class ZliczanieSłów {

        public static void main(String[] args) {
            String tekst = "Ala ma kota, kot ma Alę";

            Map<String, Integer> wystapieniaSlow = zliczWystapieniaSlow(tekst);
            System.out.println("Wystąpienia słów: " + wystapieniaSlow);
        }

        public static Map<String, Integer> zliczWystapieniaSlow(String tekst) {
            String[] slowa = tekst.split("\\s+");
            Map<String, Integer> wystapienia = new HashMap<>();

            for (String slowo : slowa) {
                wystapienia.put(slowo, wystapienia.getOrDefault(slowo, 0) + 1);
            }

            return wystapienia;
        }
    }
