package com.heaxaware.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {


			ZonedDateTime zdt = ZonedDateTime.now();
			
			System.out.println(zdt);
			
	ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		
		System.out.println(zdt1);
	}

}
