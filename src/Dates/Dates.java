package Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.time.Instant;

public class Dates {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat dateTimeZoneFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		dateTimeZoneFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date dateA = new Date();
		Date dateB = new Date(System.currentTimeMillis());
		Date dateC = new Date(1000L * 60L * 60L * 5L);
		Date dateD = new Date(0L);
		
		Date date1 = dateFormat.parse("06/02/2022");
		Date date2 = dateTimeFormat.parse("06/02/2022 16:23:56");
		Date date3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(dateTimeFormat.format(dateA));
		System.out.println(dateTimeFormat.format(dateB));
		System.out.println(dateTimeFormat.format(dateC));
		System.out.println(dateTimeFormat.format(dateD));
		System.out.println(dateFormat.format(date1));
		System.out.println(dateTimeFormat.format(date2));
		System.out.println(dateTimeFormat.format(date3));

		System.out.println("+++++++++++++++++++++++++++");

		System.out.println(dateTimeZoneFormat.format(dateA));
		System.out.println(dateTimeZoneFormat.format(dateB));
		System.out.println(dateTimeZoneFormat.format(dateC));
		System.out.println(dateTimeZoneFormat.format(dateD));
		System.out.println(dateTimeZoneFormat.format(date1));
		System.out.println(dateTimeZoneFormat.format(date2));
		System.out.println(dateTimeZoneFormat.format(date3));

	}
}
