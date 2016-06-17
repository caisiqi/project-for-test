/**
 * @(#)DateUtil.java  Created on 2009-12-11
 *
 * Copyright 2009 Synnex Information Technologies, Inc. All Rights Reserved.
 * 
 *<pre>
 * ver  d/f   date          who           changes
 * ---  ----  ------------  -----------   -----------------------------
 * 000        2009-12-11  seawardc       created original version
 *</pre>
 */
package oliver.demo.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author seawardc
 * @version 1.0
 */
public class DateUtil {
	
	private final static SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
    private final static SimpleDateFormat df = new SimpleDateFormat("MM/dd");
    private final static SimpleDateFormat df4digit = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public enum DateFormats {
		SLASH_SHORT("MM/dd/yyyy"), SLASH_LONG("MM/dd/yyyy HH:mm:ss"), STUB_SHORT("yyyy-MM-dd"), STUB_LONG("yyyy-MM-dd HH:mm:ss");
		
    	private String pattern;

		public String getPattern() {
			return pattern;
		}

		DateFormats(String pattern) {
			this.pattern = pattern;
		}
    	public static DateFormats patternOf(String pattern) {
    		DateFormats[] values = DateFormats.values();
    		for (DateFormats dateFormats : values) {
				if (dateFormats.equals(pattern)) {
					return dateFormats;
				}
			}
    		return SLASH_SHORT;
    	}
    }

    /**
     * Get Monday, time is 0
     * @author haleyg
     * @param date
     * @return
     */
    public static Date getMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        if (date != null) {
        	cal.setTime(date);
		}
        setZeroTime(cal);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }
    
    public static Date getSunday(Date date) {
        Calendar cal = Calendar.getInstance();
        if (date != null) {
        	cal.setTime(date);
		}
        setZeroTime(cal);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return cal.getTime();
    }

    /**
     * @author Lyle Du 2012-6-20
     * @param date
     * @return
     */
    public static String date2Str(Object date) {
        if (null == date) {
            return "";
        } else if (date instanceof Date) {
            return df.format(date);
        } else {
            return date.toString();
        }
    }

    /**
     * @author Lyle Du 2012-10-31
     * @param date
     * @return
     */
    public static String date2Str(Date date) {
        if (null == date) {
            return "";
        }
        return df4digit.format(date);
    }

    /**
     * Convert a date to string based on the format.
     * @param date The date will be formatted
     * @param format The expected format of the date
     * @return The formatted date string
	 * @author Andy Ji 7/24/2015
     */
	public static String convertToString(Date date, String format) {
		if(date == null || format == null)
			return "";
		SimpleDateFormat formater = new SimpleDateFormat(format);
		return formater.format(date);
	}

    public static Long getDays(Date date1, Date date2) {
        if (null == date1 || null == date2) {
            return null;
        }
        try {
            return (sf.parse(sf.format(date1)).getTime() - sf.parse(sf.format(date2)).getTime())
                    / (24 * 60 * 60 * 1000L);
        } catch (ParseException e) {
            return null;
        }
    }

    public static Long getDays(String date, Date date2) {
        try {
            return getDays(sf.parse(date), date2);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * Decrease days, if increase, set days negative
     * @author haleyg
     * @param date
     * @param days
     * @return
     */
    public static Date addDay(Date date, Integer days) {
        try {
        	Calendar cal = Calendar.getInstance();
        	if (date != null) {
				cal.setTime(date);
			}
        	cal.add(Calendar.DAY_OF_MONTH, -days);
            return cal.getTime();
        } catch (Exception ex) {
            return null;
        }
    }

    public static Date getLastDateOfWeek(String currentDate) {
		Calendar calend = Calendar.getInstance();
		calend.setTime(parseDate(currentDate));
		int lastDateOfWeek = calend.getFirstDayOfWeek() + 7;

		calend.set(Calendar.DAY_OF_WEEK, lastDateOfWeek);
		return calend.getTime();
	}

	public static Date parseDate(String dateStr) {
		return parseDate(dateStr, DateFormats.SLASH_SHORT.pattern);
	}

	public static Date parseDate(String dateStr, String formatStr) {
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		try {
			return format.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * Generate days at Monday of week between startDate and endDate, include startDate, endDate
	 * @author haleyg
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static List<Date> getWeekDaysInrange(Date startDate, Date endDate) {
		if (startDate == null) {
			startDate = new Date();
		}
		List<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		setZeroTime(cal);
		if (endDate == null) {
			Calendar endCal = (Calendar) cal.clone();
			endCal.add(Calendar.YEAR, 1);
			endDate = endCal.getTime();
		}
		while (cal.getTime().compareTo(endDate) <= 0) {
			dates.add(cal.getTime());
			cal.add(Calendar.WEEK_OF_MONTH, 1);
		}
		return dates;
	}

	/**
	 * @author haleyg
	 * @param cal
	 */
	private static void setZeroTime(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
	}
	
	public static List<Date> getWeekDaysInrange(Date startDate, int weekLength) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(startDate);
		endCal.add(Calendar.WEEK_OF_YEAR, weekLength);
		return getWeekDaysInrange(startDate, endCal.getTime());
	}
	
	/**
	 * @author haleyg
	 * @param date
	 * @return
	 */
	public static Date convertFirstDayToMonday(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			cal.add(Calendar.DAY_OF_MONTH, 1);
		} else {
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		}
		return cal.getTime();
	}
	
	public static Date convertFirstDayToSunday(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.setFirstDayOfWeek(Calendar.SUNDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return cal.getTime();
	}
	
}
