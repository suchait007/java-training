package day4.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class AppTest {

  public static void main(String[] args) {

    LocalDate localDate = LocalDate.now();

    System.out.println(localDate);

    System.out.println(LocalTime.now());

    System.out.println(LocalDateTime.now());

    System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));

    LocalDate start = LocalDate.of(2024,1,1);
    LocalDate end = LocalDate.now();

    Period period = Period.between(start, end);

    LocalDate today = LocalDate.now();

    System.out.println(today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

  }
}
