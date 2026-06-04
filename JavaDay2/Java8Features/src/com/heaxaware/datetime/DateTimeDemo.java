package com.heaxaware.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {


		LocalDate  date =	LocalDate.now();
		
		LocalDate  ind = LocalDate.of(1947, 8, 15);
		
		System.out.println(date);
		
		LocalTime  time = LocalTime.now();
		
		System.out.println(time);
		
		LocalDateTime  dt = LocalDateTime.now();
		
		System.out.println(dt);
		
		
		   System.out.println("Day of year "+date.getDayOfYear());
		   
		   System.out.println("Year "+ date.getYear());
		   
		   
		   System.out.println(time.getHour() +" hours");
		   
		   System.out.println(dt.getDayOfMonth());
		   
		   
		   
		   System.out.println(date.plusDays(5));
		   
		   System.out.println(date.minusYears(1));
		   
		   System.out.println(date.isLeapYear());
		   
		   
		   	System.out.println(date.isAfter(ind));
		   	
		   	System.out.println(ind.isBefore(date));
		   
		   
		   
		   System.out.println(date.withDayOfMonth(30));
		
		
		
		
		
	}

}
