package lab2;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
       int [] tablica = {1,2,3,4,5};
       int[] tablicaSec = {6,7,8,9,10};

       if(tablica.length != tablicaSec.length){
           System.out.println("Te tablice nie są tej samej wielkości!");
       }else{
           System.out.println("Suma tych tablic to:");
           for(int i = 0; i<tablicaSec.length; i++){
               int sumTab = tablica[i] + tablicaSec[i];
               System.out.print("["+sumTab+"]");
           }
       }
    }
}
