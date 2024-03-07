package lab1;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę studentów: ");
        int numberStudents = scanner.nextInt();
        scanner.nextLine();
        String bestStudentName = "";
        int bestStudentPoints = 0;

        for (int i = 0; i <= numberStudents-1; i++) {
            System.out.print("Podaj imie studenta " + (i+1) + ": ");
            String studentName = scanner.nextLine();

            System.out.print("Podaj liczbę punktów studenta " + (i + 1) + ": ");
            int studentPoints = scanner.nextInt();
            scanner.nextLine();


            if(studentPoints > bestStudentPoints){
                bestStudentName = studentName;
                bestStudentPoints = studentPoints;
            }
        }
    System.out.println("Najlepszy student to: " + bestStudentName + "\n" + "Ilość punktów: "+ bestStudentPoints);
    scanner.close();
    }
}