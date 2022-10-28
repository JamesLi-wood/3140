import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

public class Dates {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<String> dateTrack = new ArrayList<>(100);

        System.out.println("What options would you like to choose from? Enter the number");
        System.out.println("""
                1) Add a date
                2) Compare dates
                3) Exit""");
        int decide = keyboard.nextInt();
        while (decide != 3) {
            switch (decide) {
                case 1 -> {
                    System.out.println("enter the date (month/date/year). ex: 01/01/2001");
                    String date = keyboard.next();
                    dateTrack.add(date);
                    System.out.println(date + " has been added.");
                }
                case 2 -> {
                    System.out.println("Pick the dates.");
                    for (int i = 0; i < dateTrack.size(); i++) {
                        System.out.println(i + ") " + dateTrack.get(i));
                    }
                    int d1 = keyboard.nextInt();
                    int d2 = keyboard.nextInt();
                    StringBuilder test = new StringBuilder(dateTrack.get(d1));
                    LocalDate date1 = LocalDate.of(Integer.parseInt((test.substring(6, 10))), Integer.parseInt((test.substring(0, 2))), Integer.parseInt(test.substring(3, 5)));
                    test = new StringBuilder(dateTrack.get(d2));
                    LocalDate date2 = LocalDate.of(Integer.parseInt((test.substring(6, 10))), Integer.parseInt((test.substring(0, 2))), Integer.parseInt(test.substring(3, 5)));
                    long between = DAYS.between(date1, date2);
                    System.out.println("The days between date #1 and date #2 are " + between + " days.");
                }
                default -> System.out.println("Invalid");
            }
            System.out.println("What options would you like to choose from? Enter the number");
            System.out.println("""
                1) Add a date
                2) Compare dates
                3) Exit""");
            decide = keyboard.nextInt();
        }
    }
}