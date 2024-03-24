package lab3;
import java.util.Random;
import java.util.Scanner;

class Gracz {
    private String imie;
    private int punktyZycia;
    private int bron;
    private int zbroja;

    public Gracz(String imie, int punktyZycia, int bron, int zbroja) {
        this.imie = imie;
        this.punktyZycia = punktyZycia;
        this.bron = bron;
        this.zbroja = zbroja;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public int getBron() {
        return bron;
    }

    public int getZbroja() {
        return zbroja;
    }

    public String getImie(){
        return imie;
    }
    public void obronPrzedAtakiem(int obrazenia) {
        this.punktyZycia -= obrazenia;
    }

    public void atakuj(Przeciwnik przeciwnik) {
        Random rand = new Random();
        int obrazenia = rand.nextInt(this.bron) + 1;
        if (obrazenia > przeciwnik.getZbroja()) {
            int otrzymaneObrazenia = obrazenia - przeciwnik.getZbroja();
            przeciwnik.obronPrzedAtakiem(otrzymaneObrazenia);
            System.out.println(this.imie + " zadaje " + otrzymaneObrazenia + " punktów obrażeń " + przeciwnik.getImie() + ".");
        } else {
            System.out.println(this.imie + " nie zadaje żadnych obrażeń " + przeciwnik.getImie() + ".");
        }
    }
}