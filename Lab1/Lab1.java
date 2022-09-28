import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;

public class Lab1 {
    public static void main(String[] args) {
        LocalDate Lab1 = LocalDate.of(2022, Month.SEPTEMBER, 28);
        LocalDate Lab2 = LocalDate.of(2022, Month.OCTOBER, 28);
        LocalDate Lab3 = LocalDate.of(2022, Month.NOVEMBER, 23);
        LocalDate Lab4 = LocalDate.of(2022, Month.DECEMBER, 7);

        long between = DAYS.between(Lab1, Lab2);
        System.out.println("The days between Lab1 and Lab2 are " + between + " days.");

        between = DAYS.between(Lab2, Lab3);
        System.out.println("The days between Lab2 and Lab3 are " + between + " days.");

        between = DAYS.between(Lab3, Lab4);
        System.out.println("The days between Lab3 and Lab4 are " + between + " days.");
    }
}