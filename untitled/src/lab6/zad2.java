package lab6;

class Pozycja {
    String nazwaTowaru;
    int iloscSztuk;
    double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return iloscSztuk * cenaSztuki;
    }

    @Override
    public String toString() {
        return nazwaTowaru + " " + cenaSztuki + " zł " + iloscSztuk + " szt. " + obliczWartosc() + " zł";
    }
}


class Zamowienie {
    Pozycja[] pozycje;
    int maksRozmiar;

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        this.pozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie() {
        this(10);
    }

    public void dodajPozycje(Pozycja pozycja) {
        if (pozycje.length < maksRozmiar) {
            pozycje[pozycje.length] = pozycja;
        } else {
            System.out.println("Nie można dodać pozycji, osiągnięto maksymalny rozmiar zamówienia.");
        }
    }

    public double obliczWartosc() {
        double suma = 0;
        for (Pozycja pozycja : pozycje) {
            if (pozycja != null) {
                suma += pozycja.obliczWartosc();
            }
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zamówienie:\n");
        for (Pozycja pozycja : pozycje) {
            if (pozycja != null) {
                sb.append(pozycja).append("\n");
            }
        }
        sb.append("Razem: ").append(obliczWartosc()).append(" zł");
        return sb.toString();
    }
}

