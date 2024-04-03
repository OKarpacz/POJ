package lab4;

import java.util.Random;
public class Zawodnik {
String imie;
int predkoscMinimalna;
int predkoscMaksymalna;
int pokonanaOdleglosc;

public Zawodnik(String imie, int predkoscMinimalna,int predkoscMaksymalna, int pokanaOdleglosc){
    this.imie = imie;
    this.predkoscMinimalna = predkoscMinimalna;
    this.predkoscMaksymalna= predkoscMaksymalna;
    this.pokonanaOdleglosc = 0;
}

public void przedstawSie(){
    System.out.println("Jestem " + imie + " i biegam z predkoscia " + predkoscMinimalna + "-" + predkoscMaksymalna + "km/h");
}

public void biegnij(){
    Random rand = new Random();
    int predkosc = rand.nextInt(predkoscMaksymalna - predkoscMinimalna + 1) + predkoscMinimalna;
    pokonanaOdleglosc += predkosc;
    System.out.println(imie + " przebiegł " + predkosc + " km. Pokonana odległość: " + pokonanaOdleglosc + " km.");
}
    public int getPokonanaOdleglosc() {
        return pokonanaOdleglosc;
    }

    public String getImie() {
        return imie;
    }

}
