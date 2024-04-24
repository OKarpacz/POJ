package lab6;

class Czas {
    int godziny;
    int minuty;

    public Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    @Override
    public String toString() {
        return godziny + "h " + minuty + " min";
    }

    public Czas dodaj(Czas t) {
        int noweMinuty = this.minuty + t.minuty;
        int dodatkoweGodziny = noweMinuty / 60;
        int noweGodziny = this.godziny + t.godziny + dodatkoweGodziny;
        noweMinuty %= 60;
        return new Czas(noweGodziny, noweMinuty);
    }

    public Czas odejmij(Czas t) {
        int roznicaMinut = (this.godziny * 60 + this.minuty) - (t.godziny * 60 + t.minuty);
        int noweGodziny = roznicaMinut / 60;
        int noweMinuty = roznicaMinut % 60;
        return new Czas(noweGodziny, noweMinuty);
    }

    public Czas pomnóż(int krotnosc) {
        int noweMinuty = this.godziny * 60 * krotnosc + this.minuty * krotnosc;
        int noweGodziny = noweMinuty / 60;
        noweMinuty %= 60;
        return new Czas(noweGodziny, noweMinuty);
    }
}

