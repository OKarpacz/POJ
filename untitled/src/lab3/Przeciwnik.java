package lab3;

import java.util.Random;
import java.util.Scanner;

class Przeciwnik {
    private String imie;
    private int punktyZycia;
    private int bron;
    private int zbroja;

    public Przeciwnik(String imie, int punktyZycia, int bron, int zbroja) {
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

    public void obronPrzedAtakiem(int obrazenia) {
        this.punktyZycia -= obrazenia;
    }

    public String getImie() {
        return imie;
    }

    public void atakuj(Gracz gracz) {
        Random rand = new Random();
        int minDamage = 1;
        int maxDamage = this.bron * 2;
        int obrazenia = rand.nextInt(maxDamage - minDamage + 1) + minDamage;

        int effectiveDamage = Math.max(0, obrazenia - gracz.getZbroja());

        if (effectiveDamage > 0) {
            gracz.obronPrzedAtakiem(effectiveDamage);
            System.out.println(this.imie + " zadaje " + effectiveDamage + " punktów obrażeń " + gracz.getImie() + ".");
        } else {
            System.out.println(this.imie + " nie zadaje żadnych obrażeń " + gracz.getImie() + ".");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tworzenie gracza:");
        System.out.print("Podaj imię gracza: ");
        String imieGracza = scanner.nextLine();
        System.out.print("Podaj punkty życia gracza: ");
        int punktyZyciaGracza = scanner.nextInt();
        System.out.print("Wybierz broń gracza (1 - miecz, 2 - łuk, 3 - topór): ");
        int bronGracza = scanner.nextInt();
        System.out.print("Wybierz zbroję gracza (1 - skóra, 2 - metal, 3 - płytowy): ");
        int zbrojaGracza = scanner.nextInt();

        Gracz gracz = new Gracz(imieGracza, punktyZyciaGracza, bronGracza, zbrojaGracza);

        System.out.println("\nTworzenie przeciwnika:");
        System.out.print("Podaj imię przeciwnika: ");
        String imiePrzeciwnika = scanner.next();
        System.out.print("Podaj punkty życia przeciwnika: ");
        int punktyZyciaPrzeciwnika = scanner.nextInt();
        System.out.print("Wybierz broń przeciwnika (1 - miecz, 2 - łuk, 3 - topór): ");
        int bronPrzeciwnika = scanner.nextInt();
        System.out.print("Wybierz zbroję przeciwnika (1 - skóra, 2 - metal, 3 - płytowy): ");
        int zbrojaPrzeciwnika = scanner.nextInt();

        Przeciwnik przeciwnik = new Przeciwnik(imiePrzeciwnika, punktyZyciaPrzeciwnika, bronPrzeciwnika, zbrojaPrzeciwnika);

        scanner.close();

        System.out.println("\nRozpoczyna się walka między " + gracz.getImie() + " a " + przeciwnik.getImie() + "!");
        System.out.println("--------------------------------------");

        while (gracz.getPunktyZycia() > 0 && przeciwnik.getPunktyZycia() > 0) {
            gracz.atakuj(przeciwnik);
            if (przeciwnik.getPunktyZycia() <= 0) {
                System.out.println(przeciwnik.getImie() + " został pokonany!");
                break;
            }
            przeciwnik.atakuj(gracz);
            if (gracz.getPunktyZycia() <= 0) {
                System.out.println(gracz.getImie() + " został pokonany!");
                break;
            }

            if (gracz.getPunktyZycia() <= 0) {
                System.out.println(gracz.getImie() + " został pokonany!");
                break;
            } else if (przeciwnik.getPunktyZycia() <= 0) {
                System.out.println(przeciwnik.getImie() + " został pokonany!");
                break;
            }

            System.out.println("--------------------------------------");
        }
    }
}