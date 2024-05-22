package lab8;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InboundAndOutbound {
    public static void main(String[] args){
        String inboundDirPath = "inbound";
        String outbandDirPath = "outband";

        File inboundDir = new File(inboundDirPath);
        File outbandDir = new File(outbandDirPath);

        if(!inboundDir.exists()){
            inboundDir.mkdir();
        }

        if(!outbandDir.exists()){
            outbandDir.mkdir();
        }

        File[] files = inboundDir.listFiles(File::isFile);
        if(files == null || files.length == 0){
            System.out.println("Brak plików w 'inbound'");
            return;
        }

        for (File file : files){
            try{
                String content = new String(Files.readAllBytes(file.toPath()));

                String processedContent = processContent(content);

                String newFileName = generateNewFileName(file.getName());

                File newFile = new File(outbandDir, newFileName);
                Files.write(newFile.toPath(), processedContent.getBytes());

                Files.delete(file.toPath());

                System.out.println("Przetworzono plik: " + file.getName() + " -> " + newFileName);
            } catch (IOException e) {
                System.out.println("Wystąpił błąd podczas przetwarzania pliku: " + file.getName());
                e.printStackTrace();
            }
        }
    }

    private static String processContent(String content) {
        StringBuilder processedContent = new StringBuilder();

        for (char c : content.toCharArray()) {
            if (c == ' ') {
                processedContent.append('_');
            } else if (Character.isLetter(c)) {
                processedContent.append(shiftCharacter(c));
            } else {
                processedContent.append(c);
            }
        }

        return processedContent.toString();
    }

    private static char shiftCharacter(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) ('a' + (c - 'a' + 3) % 26);
        } else if (c >= 'A' && c <= 'Z') {
            return (char) ('A' + (c - 'A' + 3) % 26);
        }
        return c;
    }

    private static String generateNewFileName(String originalFileName) {
        String baseName = originalFileName.substring(0, originalFileName.lastIndexOf('.'));
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        return baseName + "_" + date + ".out";
    }
}