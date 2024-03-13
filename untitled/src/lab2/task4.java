package lab2;
import java.util.Scanner;
public class task4 {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Podaj ilość kolumn:");
       int columns = scanner.nextInt();

       System.out.println("Podaj ilość rzędów:");
       int rows = scanner.nextInt();

       int[][] matrix = new int[columns][rows];

       for(int i = 0; i < columns; i++){
           for(int j = 0; j < rows; j++){
               System.out.println("Podaj wartość dla komórki [" + i+ "]["+j+"]:");
               matrix[i][j] = scanner.nextInt();
           }
       }
    System.out.println("Zawartość tablicy to:");

       for(int i = 0; i < columns;i++){
           System.out.print("[");
           for(int j = 0; j < rows; j++){
               System.out.print(" "+matrix[i][j]+ " ");
           }
           System.out.println("]");
       }
scanner.close();
    }
}
