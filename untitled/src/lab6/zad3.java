package lab6;

class MojaData {
    int dzien;
    int miesiac;
    int rok;

    public MojaData(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    @Override
    public String toString() {
        // Wersja a: "1.11.2011"
        // return dzien + "." + miesiac + "." + rok;

        // Wersja b: "01.11.2011"
        // return String.format("%02d.%02d.%04d", dzien, miesiac, rok);

        // Wersja c: "1 lis 2011"
        String[] miesiace = {"", "sty", "lut", "mar", "kwi", "maj", "cze", "lip", "sie", "wrz", "paz", "lis", "gru"};
        return dzien + " " + miesiace[miesiac] + " " + rok;
    }

    public static void main(String[] args) {

        MojaData data = new MojaData(1, 11, 2011);
        System.out.println(data.toString());
    }
}
