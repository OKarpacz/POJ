package lab8;
import java.io.File;
import java.io.IOException;
public class InformationProvider {
    public void displayInfo(File file){
        System.out.println("Nazwa: " + file.getName());
        System.out.println("Ścieżka " + file.getPath());
        System.out.println("Czy jest plikiem: " + file.isFile());
        System.out.println("Czy jest katalogiem:  " + file.isDirectory());
        System.out.println("Czy plik istnieje: " + file.exists());
        System.out.println();
    }
}
