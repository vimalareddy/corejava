package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// java.util
		Date dt = new Date();
		System.out.println(dt);

		// java.sql
		long millis = System.currentTimeMillis();
		java.sql.Date dt1 = new java.sql.Date(millis);
		System.out.println(dt1);
		// 01-01-1970
		java.sql.Date dt2 = new java.sql.Date(0);
		System.out.println(dt2);

		// singleton design pattern
		Date dt3 = Calendar.getInstance().getTime();
		System.out.println(dt3);
		System.out.println("**********");
		// Gregorian calendar
		Calendar c = new GregorianCalendar();
		Date dt4 = c.getTime();
		System.out.println("-------------------");
		c.set(Calendar.HOUR, 2);
		c.add(Calendar.MONTH, 2);
		dt4 = c.getTime();

		System.out.println(dt4);

		System.out.println(dt.compareTo(dt2));

		System.out.println(dt.getDate());
		dt.setHours(dt.getHours() + 2);
		System.out.println(dt);

		System.out.println(dt.toGMTString());

		String dtf = DateFormat.getInstance().format(dt);
		System.out.println(dtf);
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(
				dt));
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(
				dt));
		System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT).format(
				dt));

		// /Date dtp=DateFormat.getDateInstance().parse("");
		// /System.out.println(dtp);
		// simpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy hh:mm ");
		System.out.println(sdf.format(dt));

		SimpleDateFormat sdf2 = new SimpleDateFormat(
				"MMM dd,yyyy (E) | hh:mm a");
		System.out.println(sdf.format(dt));

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		// /Date dtsf = sdf3.parse("2016-09-11");
		// /System.out.println(dtsf);
		System.out.println("-------------");

	}

}
