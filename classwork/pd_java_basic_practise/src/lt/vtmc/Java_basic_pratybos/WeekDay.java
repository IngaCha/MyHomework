package lt.vtmc.Java_basic_pratybos;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WeekDay {

	public static void main(String[] args) {

		String my_date = "1988-09-30";
		SimpleDateFormat my_format = new SimpleDateFormat("yyyy-MM-dd"); // pattern

		try {
			Date d = my_format.parse(my_date);// make my string into date
			System.out.println(d); // prints all date info
			System.out.println(new SimpleDateFormat("E").format(d)); // print only weekday
		} catch (ParseException e) {
			System.out.println("Bad date format");

		}
	}
}
