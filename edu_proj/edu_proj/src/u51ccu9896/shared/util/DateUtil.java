/*
 * Kan
 */
package u51ccu9896.shared.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class DateUtil.
 *
 * @author server
 */
public class DateUtil {
	
	/** The Constant DATE_FORMAT_YYMMDD. */
	public static final String DATE_FORMAT_YYMMDD = "YYMMdd";

	/**
	 * Gets the date in yymmdd.
	 *
	 * @return the date in yymmdd
	 */
	public static String getDateInYYMMDD() {
		SimpleDateFormat dateformat = new SimpleDateFormat(DATE_FORMAT_YYMMDD);
		return dateformat.format(Calendar.getInstance().getTime());
	}
}
