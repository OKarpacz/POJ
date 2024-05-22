package lab8;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class FileCreation {
    public static void main (String[] args){
        File exerciseDir = new File("exercise");
        if(exerciseDir.mkdir()){
            System.out.println("Stworzono katalog 'exercise'");
        }else{
            System.out.println("Katalog 'exercise' juz istnieje lub nie mozna stworzyć");
        }

        try{
            File file1 = new File(exerciseDir,"file1.txt");
            File file2 = new File(exerciseDir,"file2.txt");
            File file3 = new File(exerciseDir,"file3.txt");
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();

            System.out.println("Trzy pliki zostały stworzone pomyślnie.");

            File subDir1 = new File(exerciseDir, "subDir1");
            File subDir2 = new File(exerciseDir, "subDir2");
            subDir1.mkdir();
            subDir2.mkdir();

            System.out.println("Dwa katalogi zostały stworzone pomyślnie.");


        } catch (IOException e) {
            System.out.println("Wystąpił błąd przy tworzeniu plików :(");
            e.printStackTrace();
        }

        InformationProvider infoProvider = new InformationProvider();
        File[] filesAndDirs = exerciseDir.listFiles();

        if(filesAndDirs != null){
            for (File file : filesAndDirs){
                infoProvider.displayInfo((file));
            }
        }
    }
}

