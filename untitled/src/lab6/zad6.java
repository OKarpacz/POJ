package lab6;
public class zad6 {
    public static void main(String[] args) {
        // Testowanie rozwiązania
        String[] slowa = {"Ala", "nie", "ma", "test", "kota", "i", "psa", "papugę"};
        System.out.println(usunElementy(slowa, 2)); // Oczekiwany wynik: "Ala ma kota i papugę"
    }

    public static String usunElementy(String[] slowa, int coN) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < slowa.length; i++) {
            if ((i + 1) % coN != 0) {
                sb.append(slowa[i]).append(" ");
            }
        }
        // Usuń dodatkową spację na końcu
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}