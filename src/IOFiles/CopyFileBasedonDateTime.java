package IOFiles;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyFileBasedonDateTime {

	public static void main(String[] args) throws IOException {

		// CopyFileBasedonDateTime a = new CopyFileBasedonDateTime();		

		File file = new File(System.getProperty("user.dir"));
		System.out.println("1"+file.getParent());
		File file1 = new File(file.getParent());
		System.out.println("2"+file1.getParent());
		File path = new File(file1.getParent() + "/Downloads");
		System.out.println("3"+path);
		File source = new File(path + "\\cidn_20180319211225.csv");
		System.out.println("4"+source);
		FileUtils.moveFileToDirectory(source, file1, true);
		System.out.println("file moved from " + source + " to " + file1);
		File source2 = new File(file1 + "\\cidn_20180319211225.csv");
		System.out.println(source2.exists());
		System.out.println(source2.canRead());
//		System.out.println(source2.delete());
		
		DateTime();

//		File source = new File(path + ".xls");
//		long lastModified = source.lastModified();
//		System.out.println("Dateeeee - " + new Date(lastModified));
//		String time = format(lastModified);
//		System.out.printf("file %s was last modified at %s %n", source.getName(), time);

	}

	public static String format(long time) {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return sdf.format(new Date(time));
	}

	public static void DateTime() {
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();

		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);

		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);

		String Date = day + "/" + (month + 1) + "/" + year;
		String Time = hour + " : " + minute;

		System.out.println("Current date is  " + day + "/" + (month + 1) + "/" + year);
		System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
	}

}
