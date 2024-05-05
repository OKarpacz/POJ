package lab7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lokal {
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private Integer numerDomu;
    private Integer numerLokalu;

    public Lokal(String nazwaLokalu, String adres) {
        this.nazwaLokalu = nazwaLokalu;

        Pattern pattern = Pattern.compile("(.*), (\\d{2}-\\d{3}) (\\w+), ul\\. (.*?), (\\d+)(?:/(\\d+))?");
        Matcher matcher = pattern.matcher(adres);
        if (matcher.matches()) {
            this.miejscowosc = matcher.group(3);
            this.kodPocztowy = matcher.group(2);
            this.ulica = matcher.group(4);
            this.numerDomu = Integer.parseInt(matcher.group(5));
            if (matcher.group(6) != null) {
                this.numerLokalu = Integer.parseInt(matcher.group(6));
            }
        } else {
            System.out.println("Niepoprawny format adresu: " + adres);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazwaLokalu).append("\n");
        sb.append("Miasto: ").append(miejscowosc).append("\n");
        sb.append("Ulica: ").append(ulica).append("\n");
        sb.append("Numer domu/lokalu: ").append(numerDomu);
        if (numerLokalu != null) {
            sb.append("/").append(numerLokalu);
        }
        sb.append("\n");
        sb.append("Kod pocztowy: ").append(kodPocztowy);
        return sb.toString();
    }

    public static void main(String[] args) {
        Lokal lokal = new Lokal("Mąka i Kawa", "Jana Kilińskiego 4, 80-452 Gdańsk");
        System.out.println(lokal.toString());
    }
}

