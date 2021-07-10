package uz.digitalone.trailertest.entity;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // 07-09-2021 08:00:40

        String dateTime = "07-09-2021 08:00:40";
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.from(formatDateTime.parse(dateTime));
        Timestamp ts = Timestamp.valueOf(localDateTime);

        System.out.println(ts);
    }

}
