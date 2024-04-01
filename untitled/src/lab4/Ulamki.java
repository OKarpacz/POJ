package lab4;
import java.util.Scanner;

public class Ulamki{
    int licznikOne;
    int mianownikOne;
    int licznikTwo;
    int mianownikTwo;

    public String mnozenie(){
        return licznikOne*licznikTwo + "/" + mianownikOne*mianownikTwo;
    }
    public String dzielenie(){
        return licznikOne*mianownikTwo + "/" + mianownikOne * licznikTwo;
    }
    public String dodawanie() {
        if (mianownikOne == mianownikTwo) {
            return (licznikOne + licznikTwo) + "/" + mianownikOne;
        } else {
            return( (licznikOne * mianownikTwo) + (licznikTwo * mianownikOne) + "/" + (mianownikOne * mianownikTwo));
        }
    }

    public String odejmowanie(){
        if(mianownikOne == mianownikTwo){
            return (licznikOne - licznikTwo)+ "/" + mianownikOne;
        }else {
            return (licznikOne * mianownikTwo - licznikTwo * mianownikOne) + "/" + (mianownikOne * mianownikTwo);
        }
    }
    public String show(){
        return "Pierwszy ulamek: "+licznikOne+"/"+mianownikOne +
                "\n" + "Drugi ulamek: " + licznikTwo +"/"+mianownikTwo;

    }


    public static void main (String[] args){
        Ulamki ulamki = new Ulamki();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj iloczyn pierwszego ułamka: ");
            ulamki.licznikOne = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            ulamki.mianownikOne = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka");
            ulamki.licznikTwo = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka");
            ulamki.mianownikTwo = scanner.nextInt();
            System.out.println("Kalkulator");
            System.out.println("1.Dodawanie");
            System.out.println("2.Odejmowanie");
            System.out.println("3.Mnozenie");
            System.out.println("4.Dzielenie");
            System.out.println("5.Wyswietl ulamki");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(ulamki.dodawanie());
                    break;
                case 2:
                    System.out.println(ulamki.odejmowanie());
                    break;
                case 3:
                    System.out.println(ulamki.mnozenie());
                    break;
                case 4:
                    System.out.println(ulamki.dzielenie());
                    break;
                case 5:
                    System.out.println(ulamki.show());
                    break;
                default:
                    System.out.println("Cos poszlo nie tak :(");

        }
      }
    }
}