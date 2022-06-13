package DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.mysql.cj.log.Log;

public class DateUtil {

	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println("La fecha es :" + getAnyo(fecha) + "/" + getMes(fecha) + "/" + getDia(fecha));
        System.out.println(fecha);
		Calendar cal = Calendar.getInstance();
		System.out.println(isFinDeSemana(cal) ? ("Es fin de semana") : ("No es fin de semana"));

		System.out.println("Es dia de semana : " + getDiaDeSemana(cal));
		System.out.println("Como String :" + asString("%d/%d/ %d",fecha));
		System.out.println("Como Date :" + asDate("yyyy/MM/dd", "2022/06/10"));
		System.out.println("Como Calendar : " + asCalendar("EEE MMM dd HH:mm:ss z yyyy","Fri Jun 10 10:25:37 GMT 2022"));

	}

	public static int getAnyo(Date fecha) {
		return fecha.getYear() + 1900;
	}

	public static int getMes(Date fecha) {
		return fecha.getMonth() + 1;
	}

	public static int getDia(Date fecha) {
		return fecha.getDate();

	}

	public static boolean isFinDeSemana(Calendar cal) {
		return (cal.get(Calendar.DAY_OF_WEEK) == 1) || (cal.get(Calendar.DAY_OF_WEEK) == 7);

	}

	public static boolean isDiaDeSemana(Calendar cal) {
		return !isFinDeSemana(cal);
	}

	public static int getDiaDeSemana(Calendar cal) {
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static Date asDate(String pattern, String fecha){
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
	}

	public static Calendar asCalendar(String pattern, String fecha){
		Calendar cal = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.getDefault());
		try {
		    cal = Calendar.getInstance();
		    cal.setTime(sdf.parse(fecha));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return cal;
	}

	public static String asString(String pattern, Date fecha){
		String dateFormatted = " ";
		dateFormatted = String.format(pattern, fecha.getDate(),fecha.getMonth()+1, fecha.getYear()+1900);
		return dateFormatted;
	}

	
}
