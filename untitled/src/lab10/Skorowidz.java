package lab10;
import java.util.*;

public class Skorowidz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Napisz słowo: ");
        String tekst = scanner.nextLine();
        Map<String, Set<Integer>> skorowidz = skorowidzLiterowy(tekst);
        System.out.println("Skorowidz literowy: " + skorowidz);
    }

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        Map<String, Set<Integer>> skorowidz = new HashMap<>();

        for (int i = 0; i < tekst.length(); i++) {
            String litera = String.valueOf(tekst.charAt(i)).toLowerCase();
            if (!skorowidz.containsKey(litera)) {
                skorowidz.put(litera, new HashSet<>());
            }
            skorowidz.get(litera).add(i);
        }

        return skorowidz;
    }
}