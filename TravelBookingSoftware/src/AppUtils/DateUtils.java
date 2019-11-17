package AppUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	static public String formatDate(Date d) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
		return df.format(d);
	}
	
	static public Date createEasyDate(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date createdDate = null;
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			System.out.println("Date invalid");
			e.printStackTrace();
		}
		return createdDate;
	}
}
