import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        String textDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm", Locale.ENGLISH);
        LocalDateTime inputDate;
        try {
            inputDate = LocalDateTime.parse(textDate, formatter);
        } catch (Exception e) {
            inputDate = LocalDateTime.parse(textDate, formatter1);
        }


        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(inputDate, now);

        long years = duration.toDays() / 364;

        long days = duration.toDays() - (years * 364);
        long month = 0;

        while (days >= 30) {
            days = days - 30;
            month++;
        }

        long toSeconds = duration.toSeconds() - (duration.toDays() * 24 * 60 * 60);
        long hours = toSeconds / 60 / 60;
        long minutes = (toSeconds / 60) - (hours * 60);
        long seconds = toSeconds - (hours * 60 * 60) + (minutes * 60);


        System.out.println("Лет: " + years + " Месяцев: " + month + " Дней: " + days + " Часов: " + hours + " Минут: " + minutes);


//        }
    }
}