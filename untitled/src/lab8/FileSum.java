package lab8;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileSum {
    public static void main(String[] args) {
        String filepath = "Input"; // Problem ze znalezieniem pliku do poprawy to!
        int sum = 0;
        boolean isSecondLine = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (lineNumber % 2 == 0) {
                    try {
                        int number = Integer.parseInt(line);
                        sum += number;
                    } catch (NumberFormatException e) {
                        System.out.println("Błąd");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku!");
            e.printStackTrace();
        }

        System.out.println("Suma co drugiej linijki to: " + sum);
    }
}