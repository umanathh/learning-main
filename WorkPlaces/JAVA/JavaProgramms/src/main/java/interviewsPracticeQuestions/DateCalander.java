package interviewsPracticeQuestions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalander {

	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt.toString());
		
		SimpleDateFormat smpldt = new SimpleDateFormat("MM/dd/YYYY");		
		System.out.println(smpldt.format(dt));

		SimpleDateFormat smpldt2 = new SimpleDateFormat("MM/dd/YYYY HH:mm:SS");
		System.out.println(smpldt2.format(dt));
		

		SimpleDateFormat smpldt3 = new SimpleDateFormat("dd/MM/YYYY");		
		System.out.println(smpldt3.format(dt));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(smpldt.format(cal.getTime()));

	}

}
