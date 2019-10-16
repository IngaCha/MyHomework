package lt.vtmc.Java_basic_pratybos;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WeekDay {

	public static void main(String[] args) {

		String reportDate = "1988-09-30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(reportDate);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			System.out.println(new SimpleDateFormat("E").format(new SimpleDateFormat("yyyy-MM-dd").parse(reportDate)));

		} catch (ParseException e) {
			System.out.println("Bad date format");

		}
	}
}
