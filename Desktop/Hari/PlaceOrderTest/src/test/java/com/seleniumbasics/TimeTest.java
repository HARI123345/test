package com.seleniumbasics;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class TimeTest {

	public static void main(String[] args) {
		System.out.println("hello");

		//@Scheduled(cron = "00 05 00 ?")//cron at scheduled time
		//		@Scheduled(cron = "30 16 16 ?")
		// Cron Job starts for required time you define (second minute hour day and above format).
		//		@Scheduled(cron = "01 ?")
		// Cron Job starts at 12.05 am very day.
	}
	@Scheduled(cron = "05 00 00 ?")
	public void scheduleTaskWithCronExpression() {



		System.out.println("Hii");
	}



}
