package lab8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
public class Analisis {
    public static void main(String[] args) {
        String basedirPath = "basedir.zip";
        File basedir = new File(basedirPath);

        if (!basedir.isDirectory()) {
            System.out.println("Podana sciezka nie jest katalogiem!");
            return;
        }

        File[] directories = basedir.listFiles(File::isDirectory);
        if (directories != null || directories.length == 0) {
            System.out.println("Brak katalogow w basedir.");
            return;
        }

        String direcoryWithMostFiles = null;
        int maxFileCounter = 0;

        for(File dir : directories){
            int fileCount = countFilesInDirectory(dir);
            System.out.println("Katalog " + dir.getName() + " ma " + fileCount + " plików.");

            if(fileCount > maxFileCounter){
                maxFileCounter = fileCount;
                direcoryWithMostFiles = dir.getName();
            }
        }
        if(direcoryWithMostFiles != null){
            System.out.println("Katalog z najwieksza liczba plików to : " + direcoryWithMostFiles + "z " + maxFileCounter + "plikami.");
        }else {
            System.out.println("Błąd (Nie znaleziono żadnych plików w katalogu!)");
        }
    }

    private static int countFilesInDirectory(File directory){
        File[] files = directory.listFiles(File::isFile);
        return files == null ? 0 : files.length;
    }
}
