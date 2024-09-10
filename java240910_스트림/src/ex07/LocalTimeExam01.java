package ex07;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class LocalTimeExam01 {

	public static void main(String[] args) {

		long sum = 0;
		
		Instant start = Instant.now();
		
		for(long i=0; i<=1000000000L; i++)
			sum += i;
		
		Instant end = Instant.now();
		
		Duration between = Duration.between(start, end);
	
		System.out.println("소요 시간: " + between.toMillis()/1000.0);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
	}

}
