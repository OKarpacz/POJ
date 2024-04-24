package lab6;

class Samochod {
    int predkosc;
    String kolor;
    String marka;
    int rocznik;

    public Samochod(String kolor, String marka, int rocznik) {
        this.predkosc = 0;
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    public void przyspiesz() {
        if (predkosc < 140) {
            predkosc += 20;
        }
    }

    @Override
    public String toString() {
        return kolor + " " + marka + " rocznik " + rocznik;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Samochod samochod = (Samochod) obj;
        return rocznik == samochod.rocznik &&
                kolor.equals(samochod.kolor) &&
                marka.equals(samochod.marka);
    }
}

// Podklasa SzybkiSamochod
class SzybkiSamochod extends Samochod {
    public SzybkiSamochod(String kolor, String marka, int rocznik) {
        super(kolor, marka, rocznik);
    }

    @Override
    public void przyspiesz() {
        if (predkosc < 200) {
            predkosc += 20;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return true;
    }
}
