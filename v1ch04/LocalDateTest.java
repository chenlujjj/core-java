import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate aThousandYearsLater = now.plusYears(1000L);
        System.out.println(aThousandYearsLater);
        int year = aThousandYearsLater.getYear();
        int month = aThousandYearsLater.getMonthValue();
        int day = aThousandYearsLater.getDayOfMonth();
        DayOfWeek dow = aThousandYearsLater.getDayOfWeek();
        System.out.println("" + year + month + day + dow);
    }
}