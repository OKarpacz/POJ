package lab8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeapYears {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        List<Integer> leapYears = new ArrayList<>();

        while (leapYears.size() < 100) {
            if (LocalDate.ofYearDay(currentYear, 1).isLeapYear()) {
                leapYears.add(currentYear);
            }
            currentYear++;
        }
        System.out.println("Następne 100 lat przestępnych to:");
        for(int year : leapYears){
            System.out.println(year);
        }
    }
}
