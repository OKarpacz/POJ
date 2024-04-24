package lab6;

enum Czas {
    DZIEN, MIESIAC(20), ROK;

    private final int dni;

    Czas() {
        this.dni = 1;
    }

    Czas(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }
}

class Pracownik {
    String imie;
    String nazwisko;
    double dzienneWynagrodzenie;

    public Pracownik(String imie, String nazwisko, double dzienneWynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzienneWynagrodzenie = dzienneWynagrodzenie;
    }
}

 class Firma {
    Pracownik[] pracownicy;

    public Firma(Pracownik[] pracownicy) {
        this.pracownicy = pracownicy;
    }

    public double obliczMiesiecznyKosztFirmy() {
        double koszt = 0;
        for (Pracownik pracownik : pracownicy) {
            koszt += pracownik.dzienneWynagrodzenie * Czas.MIESIAC.getDni();
        }
        return koszt;
    }

    public double obliczRocznyKosztFirmy() {
        double koszt = 0;
        for (Pracownik pracownik : pracownicy) {
            koszt += pracownik.dzienneWynagrodzenie * Czas.ROK.getDni();
        }
        return koszt;
    }

    public double obliczKosztFirmy(Czas czas, int krotnosc) {
        double koszt = 0;
        for (Pracownik pracownik : pracownicy) {
            koszt += pracownik.dzienneWynagrodzenie * czas.getDni() * krotnosc;
        }
        return koszt;
    }
}


