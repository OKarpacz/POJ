package lab7;
import java.util.regex.Pattern;
public class TransformacjaString {
    public static String usunZnaki(String tekst, Znak znak) {
        String pattern = "";
        switch (znak) {
            case SPOLGLOSKA:
                pattern = "[^aeiouAEIOU]";
                break;
            case SAMOGLOSKA:
                pattern = "[aeiouAEIOU]";
                break;
            case SPACJA:
                pattern = "[\\s]";
                break;
            case LICZBA:
                pattern = "[^0-9]";
                break;
            case ZNAK_SPECJALNY:
                pattern = "[^a-zA-Z0-9\\s]";
                break;
        }
        return tekst.replaceAll(pattern, "");
    }

    public static String podmienZnaki(String tekst, Znak znak, String podmien) {
        String pattern = "";
        switch (znak) {
            case SPOLGLOSKA:
                pattern = "[^aeiouAEIOU]";
                break;
            case SAMOGLOSKA:
                pattern = "[aeiouAEIOU]";
                break;
            case SPACJA:
                pattern = "[\\s]";
                break;
            case LICZBA:
                pattern = "[^0-9]";
                break;
            case ZNAK_SPECJALNY:
                pattern = "[^a-zA-Z0-9\\s]";
                break;
        }
        String escapedPodmien = Pattern.quote(podmien);
        return tekst.replaceAll(pattern, escapedPodmien);
    }

    public static String pozostawZnaki(String tekst, Znak znak) {
        String pattern = "";
        switch (znak) {
            case SPOLGLOSKA:
                pattern = "[aeiouAEIOU]";
                break;
            case SAMOGLOSKA:
                pattern = "[^aeiouAEIOU]";
                break;
            case SPACJA:
                pattern = "[^\\s]";
                break;
            case LICZBA:
                pattern = "[0-9]";
                break;
            case ZNAK_SPECJALNY:
                pattern = "[a-zA-Z0-9\\s]";
                break;
        }
        return tekst.replaceAll(pattern, "");
    }

    public static void main(String[] args) {
        String tekst = "123Test";
        System.out.println("Tekst pozbawiony liczb: " + usunZnaki(tekst, Znak.LICZBA));
        System.out.println("Tekst z podmienionymi liczbami: " + podmienZnaki(tekst, Znak.LICZBA, "$"));
        System.out.println("Tylko liczby z tekstu: " + pozostawZnaki(tekst, Znak.LICZBA));
    }
}
