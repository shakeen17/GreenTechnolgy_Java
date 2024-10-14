package sample;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeDay {
public static void main(String[] args) {
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalDateTime dtime = LocalDateTime.now();
	System.out.println(dtime);
}
}
