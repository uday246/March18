/*
 * $Id: PRDateTimeUtilsImpl.java 203249 2016-07-13 10:06:34Z VikrantChaudhary $
 *
 * Copyright (c) 2001  Pegasystems Inc.
 * All rights reserved.
 *
 * This  software  has  been  provided pursuant  to  a  License
 * Agreement  containing  restrictions on  its  use.   The  software
 * contains  valuable  trade secrets and proprietary information  of
 * Pegasystems Inc and is protected by  federal   copyright law.  It
 * may  not be copied,  modified,  translated or distributed in  any
 * form or medium,  disclosed to third parties or used in any manner
 * not provided for in  said  License Agreement except with  written
 * authorization from Pegasystems Inc.
*/


package com.pega.pegarules.exec.internal.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import com.pega.ibm.icu.math.BigDecimal;
import com.pega.ibm.icu.math.MathContext;
import com.pega.pegarules.common.PREngineProvider;
import com.pega.pegarules.exec.external.util.PRDateTimeUtils;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.ModuleVersion;
import com.pega.pegarules.pub.clipboard.InvalidParameterException;
import com.pega.pegarules.pub.clipboard.InvalidValueException;
import com.pega.pegarules.pub.context.PRThread;
import com.pega.pegarules.pub.context.ThreadContainer;
import com.pega.pegarules.pub.util.DateTimeUtils;
import com.pega.pegarules.pub.util.PRDateFormat;
import com.pega.pegarules.pub.util.StringUtils;


/**
 * Incorporates useful Date and Time utilities.
 * 14-Feb-02 OLSOK: inline logic from Pega.DateTimeUtil class
 * Update some functions to avoid expensive constructors.
 *
 * @version		$Revision: 203249 $ $Date: 2016-07-13 06:06:34 -0400 (Wed, 13 Jul 2016) $
 * @author		Tim Miranda
 */
/*
 * $Log$
 * Revision 1.1  2009/07/08 19:45:44  ernsg
 * Task-12999: Componentization step 2, PRDateTimeUtils
 *
 * Revision 1.2  2009/06/24 13:35:44  ernsg
 * Task-12866: add automatic audit logging
 *
 * (old manual audit lines follow, do not add or remove)
 *   Date        Who    Item ID   Description of Modification
 * 07-Feb-08	olsok	Bug-11418	ifx addToDate to use consistent TZ in calendars
 * 06-Feb-08	olsok	Bug-8390	fix datetimedifference for end < begin
 * 02-Nov-07	RaniR	Bug-7320	fixed formatTimeStamp(Date)  
 * 24-Jul-07	gentj	Code-389	Add method to return a "unique timestamp"
 * 									for a requestor
 * 13-Sep-05	olsok	B-15821		honor format parameter in formatDateTime
 * 23-May-05	clinb				access static methods correctly
 * 03-Mar-05	MiraT	B-12529		use GregorianCalendar
 * 14-Mar-05    gentj   B-12323     Create version of formatDateTime that does
 *                                  not have the unused "pattern" parameter
 * 20-Jul-04	MiraT				Change stringMonthToConstant()
 * 20-Jul-04	MiraT				Add stringDayToConstant()
 * 12-Jul-04	olsok				use simpler date format interface
 * 01-Jul-04	olsok				quickly avoid parsing blank date strings
 * 10-Jun-04	ChauD				We don't store dates in UTC after all
 * 09-Jun-04	ChauD				Interpret DB times in UTC to fix monitor servlet time display
 * 03-Jun-04	MiraT				Add stringMonthToConstant()
 * 27-May-04	MiraT				Add getSameDayInNextMonth()
 * 23-Jan-03	dassu	B-3556		construct GregorianCalendar with GMT timezone
 * 11-Sep-03	gentj	B-1802		Add a method to convert a java.sql.Timestamp to
 * 									a Date
 * 04-Sep-03	olsok				fix length check for legacy timestamp format
 * 01-Sep-03	olsok				use PRDateFormat methods to avoid synchronization
 * 									TimeZones are not thread-safe so clone as needed
 * 									eliminate dead and deprecated logic
 * 19-Jun-03	ChauD				Make AM/PM times take hours in range 1-12, not 0-11
 * 29-May-03	GajnJ	B-175		Alter dateTimeDifference to use Math.floor(), not string parsing
 * 29-May-03	GajnJ	R-7997		Fix validation of TimeOfDay to use GMT, not JVM's locale
 * 									Alter parseTimeOfDayString to enforce GMT parsing
 * 07-Feb-03	ErnsG	R-7405		addToDate handles both Date and DateTime inputs
 * 15-Jan-03	clinb	R-7144		formatDateTimeStamp returns local time zones instead of GMT!!
 * 23-Dec-02	JWvdM	R-6823		fix min lengths in parseDateTimeString for single-digit values
 * 05-Dec-02	clinb				reorder formats in parseDateTimeString to disambiguate results
 * 26-Nov-02	clinb	R-6037		test length of dates against the SimpleDateFormats before parsing
 * 25-Nov-02	clinb	R-6251		REDEFINED TIME_OF_DAY - reduced # parse formats it supports
 * 08-Oct-02	clinb				getMonthsBetweenDates made private (used internally only)
 * 07-Oct-02	clinb				'M'onths, 'Y'ears and 'C'enturies between dates fixed.
 * 08-Aug-02	ErnsG				handle military times in parseDateTimeString()
 * 17-Jul-02	MiraT				PREnvironment.sEmptyString to ""
 * 28-Jun-02	ErnsG				use HOUR_OF_DAY for 24 hour clock
 * 25-Jun-02	olsok				add currentTimeUnique for unique timestamp
 * 11-Jun-02	clinb				make parseTimeOfDay more flexible
 * 22-Feb-02	clinb				Removed FormatDateTime and added parseDateTime
 * 14-Feb-02	MIRAT				Make initialization and display better
 * 08-Feb-02	MIRAT				Better error handling
 * 01-Feb-02	MIRAT				Initial coding
 */

 /**
  * Utility routines that provide a central location to statically create the
  * (expsensive) SimpleDateFormat objects that will be used to parse and format
  * dates.
  */
public class PRDateTimeUtilsImpl implements PRDateTimeUtils {
	 public static final String COPYRIGHT = "Copyright (c) 2003  Pegasystems Inc.";

	 public static final String VERSION = ModuleVersion.register("$Id: PRDateTimeUtilsImpl.java 203249 2016-07-13 10:06:34Z VikrantChaudhary $");
	
	private static final LogHelper oLog = new LogHelper(PRDateTimeUtilsImpl.class);

	private static final DateTimeUtils gInstance = new PRDateTimeUtilsImpl();
	
	/**
	 * The last time value handed out by {@link #currentTimeUnique}.
	 */
	private static long gTimeValue = 0;

	/**
	 * If the last value handed out by {@link #currentTimeUnique} was the same
	 * as the current time, then this is a counter which, when combined with the
	 * current time, results in a unique value.
	 */
	private static long gCounter = 0;

	private static final long MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;

	private static final BigDecimal gBDMillisecondsPerDay = new BigDecimal(MILLISECONDS_PER_DAY);
	
	/**
	 * this is a singleton class to minimize the cost of the DateFormat objects that are
	 * created within it.
	 */
	private PRDateTimeUtilsImpl() {
	}

	/**
	 * return an instance of DateTimeUtils
	 * @return instance for date manipulation
	 */
	public static final DateTimeUtils getInstance() {
		return (DateTimeUtils)gInstance;
	}

	/**
	 * This function will add  days, hours,minutes,seconds to the time passed in and will return an ISO time to the caller.
	 * @param aDate	base date to start with
	 * @param aDays		to add to base date
	 * @param aHours		to add to base date
	 * @param aMinutes	to add to base date
	 * @param aSeconds	to add to base date
	 * @return Computed value returned as an internal datetime stamp
	 */
	public final String addToDate(
		String aDate,
		String aDays,
		String aHours,
		String aMinutes,
		String aSeconds) {
		Date date = null;
		if (!aDate.equals("")) {
			if (aDate.length() == 8) {
				// assume we only have a Date.  Append a zero time stamp
				aDate = aDate + "T000000.000 GMT+00:00";
			}
			date = parseDateTimeStamp(aDate);
			if (date == null) {
				throw new InvalidParameterException("theDate", this.getClass().getName(), "addToDate(String, String, String, String, String)", "value " + aDate + " is not a valid Date or DateTime string");
			}
		}

		// treat "" as 0
		if (aDays.length() == 0)
			aDays = "0";
		if (aHours.length() == 0)
			aHours = "0";
		if (aMinutes.length() == 0)
			aMinutes = "0";
		if (aSeconds.length() == 0)
			aSeconds = "0";

		java.util.Date myDate = addToDate(date, Integer.parseInt(aDays), Integer.parseInt(aHours), Integer.parseInt(aMinutes), Integer.parseInt(aSeconds));
		return formatDateTimeStamp(myDate);
	}

	/**
	 * This function will add  days, hours,minutes,seconds to the time passed in and will return an ISO time to the caller.
	 * @param aDate	base date to start with, if null defaults to current date
	 * @param aDays		to add to base date
	 * @param aHours		to add to base date
	 * @param aMinutes	to add to base date
	 * @param aSeconds	to add to base date
	 * @return Computed value returned as an internal datetime stamp
	 */
	public Date addToDate(Date aDate, int aDays, int aHours, int aMinutes, int aSeconds) {
			// OLSOK Bug-11418 the timezone of pastDate and futureDate need to be GMT for consistency with parse logic and each other
		java.util.GregorianCalendar pastDate = new java.util.GregorianCalendar(TimeZone.getTimeZone("GMT"));
		if(aDate != null) {
			pastDate.setTime(aDate);
		}
		
		java.util.GregorianCalendar futureDate = new java.util.GregorianCalendar(TimeZone.getTimeZone("GMT"));
				//new java.util.GregorianCalendar(
			futureDate.set(
					pastDate.get(java.util.Calendar.YEAR),
					pastDate.get(java.util.Calendar.MONTH),
					pastDate.get(java.util.Calendar.DATE),
					pastDate.get(java.util.Calendar.HOUR_OF_DAY),
					pastDate.get(java.util.Calendar.MINUTE),
					pastDate.get(java.util.Calendar.SECOND));
			futureDate.set(Calendar.MILLISECOND, pastDate.get(Calendar.MILLISECOND));
		futureDate.add(java.util.Calendar.DAY_OF_MONTH, aDays);
		futureDate.add(java.util.Calendar.HOUR_OF_DAY, aHours);
		futureDate.add(java.util.Calendar.MINUTE, aMinutes);
		futureDate.add(java.util.Calendar.SECOND, aSeconds);
		return futureDate.getTime();
	}

	/**
	 * Return Today's Date -
	 * Keep track of system starts
	 * @param aDateFormat format string to use for creating the date
	 * @param aTimeZone Time Zone name
	 * @return date/time string formatted as requested
	 */
	public final String currentDate(
		String aDateFormat,
		String aTimeZone) {
		if (StringUtils.isBlank(aDateFormat)) {
			aDateFormat = "ddMMMyyyy";
		}

		// OLSOK 01-Sep-03 change the semantics to use the server's default
		// time zone, this makes far more sense than hard-coding EST.
//		if (strTimeZone == null) {
//			strTimeZone = "EST";
//		}

		Date now = new Date(System.currentTimeMillis());
		return PRDateFormat.format(null, aTimeZone, aDateFormat, now);
	}

	/**
	 * Returns a long that is unique within this PegaRULES jvm/instance by
	 * incrementing a counter while currentTimeMillis remains constant.
	 * 
	 * @return A value which has never been returned by this method (or
	 *         {@link #currentTimeUnique}) before. The value is approximately
	 *         equal to the number of milliseconds since January 1, 1970 times
	 *         1000. long value, effectively milliseconds * 1000.
	 */
	public final synchronized long getCurrentTimeUnique() {
		long curTime = System.currentTimeMillis();
		if (curTime != gTimeValue) {
			gCounter = 0;
			gTimeValue = curTime;
		}
		return ((gTimeValue * 1000) + gCounter++);
	}

	/**
	 * Returns a long that is unique within this PegaRULES jvm/instance by
	 * incrementing a counter while currentTimeMillis remains constant.
	 * 
	 * @return A value which has never been returned by this method (or
	 *         {@link #getCurrentTimeUnique}) before. The value is
	 *         approximately equal to the number of milliseconds since January
	 *         1, 1970 times 1000. long value, effectively milliseconds * 1000.
	 */
	public final long currentTimeUnique() {
		return getCurrentTimeUnique();
	}

	/**
	 * This function will return a date <code>numOfMonths</code> from the specified date,
	 * where the day of the week and week of the month are the same.
	 * <P>
	 * For example, the gregorian date May 1, 2004 is the first Saturday of the month.
	 * Adding 1 month to that will return June 5, 2004, which is also the first Saturday of the month.
	 * 
	 * Example 2: the gregorian date December 30th, 2015 is the fifth wednesday of the month,
	 * removing 2 months will return November 4th, 2015 (as there is no fifth wednesday in October and it will move to next month i.e., November)
	 * 
	 * @param theDate base date to start with
	 * @param aDate base date to start with
	 * @param aNumOfMonths number of months to add to that date
	 * @return Computed value returned as an internal datetime stamp
	 */
	public final String addMonthsToSameDay(
		String aDate,
		int aNumOfMonths) {
		Date date = null;
		if (aDate.equals("")) {
			// If date not supplied, default to Now.
			date = new java.util.GregorianCalendar(TimeZone.getTimeZone("GMT")).getTime();
		} else {

			if (aDate.length() == 8) {
				// assume we only have a Date.  Append a zero time stamp

				aDate = aDate + "T000000.000 GMT+00:00";
			}
			date = parseDateTimeStamp(aDate);
			if (date == null) {
				throw new InvalidParameterException("theDate", this.getClass().getName(), "addToDate(String, String, String, String, String)", "value " + aDate + " is not a valid Date or DateTime string");
			}
		}
		java.util.Date myDate = addMonthsToSameDay(date, aNumOfMonths);
		String retString = formatDateTimeStamp(myDate);
		//Insert Debug Code Here ("The add to now results is : " + retString);
		return retString;
	}

	public Date addMonthsToSameDay(Date aDate, int aNumOfMonths) {
		java.util.GregorianCalendar futureDate;
			java.util.Calendar pastDate = java.util.GregorianCalendar.getInstance();

			pastDate.setTime(aDate);

			futureDate =
				new java.util.GregorianCalendar(
					pastDate.get(java.util.Calendar.YEAR),
					pastDate.get(java.util.Calendar.MONTH),
					pastDate.get(java.util.Calendar.DATE),
					pastDate.get(java.util.Calendar.HOUR_OF_DAY),
					pastDate.get(java.util.Calendar.MINUTE),
					pastDate.get(java.util.Calendar.SECOND));
		
	    int currentDayOfWeekInMonth = futureDate.get(java.util.Calendar.DAY_OF_WEEK_IN_MONTH);
	    int currentDayOfWeek = futureDate.get(java.util.Calendar.DAY_OF_WEEK);
//	    int currentMonth = futureDate.get(java.util.Calendar.MONTH);
//		java.util.Date tempDate = futureDate.getTime();
        futureDate.add(java.util.Calendar.MONTH, aNumOfMonths);
        
//		tempDate = futureDate.getTime();

		// Ok, right month, but need to get to the exact day
		// Start with the 1st day of the month
		futureDate.set(java.util.Calendar.DAY_OF_MONTH, 1);
		// figure out how many weeks we need to iterate through
		int actualMax = futureDate.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		int actualDayOfWeekInMonth = currentDayOfWeekInMonth <= actualMax ? currentDayOfWeekInMonth : actualMax;
		// now, add one day at a time until we've "gone past" that many daysofweek
		int numOfDaysCounted = 0;
		while (true) {
		    if (futureDate.get(Calendar.DAY_OF_WEEK) == currentDayOfWeek) {
		        numOfDaysCounted++;
		    }
		    
		    if (numOfDaysCounted == actualDayOfWeekInMonth) {
		        break;
		    }
		    
		    futureDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		java.util.Date myDate = futureDate.getTime();
		return myDate;
	}
	
	
	/**
	 * Computes the difference between two Pega standard internal (ISO) format dates with
	 * the result being corrected for the specified precision.
	 * @param aBeginTime	Start date formatted in standard internal form.
	 * @param aEndTime	Ending date formatted in standard internal form.
	 * @param aPrecision	Units the result is to be interpreted with:
	 * 					<UL>
	 * 						<LI>C - Centuries</LI>
	 * 						<LI>Y - Years</LI>
	 * 						<LI>M - Months</LI>
	 * 						<LI>D - Days</LI>
	 * 						<LI>h - Hours</LI>
	 * 						<LI>m - Minutes</LI>
	 * 						<LI>s - Seconds (Default)</LI>
	 * 						<LI>S - Milliseconds</LI>
	 * 					</UL>
	 * @return difference in the units specified in the strPrecision parameter (may be negative if
	 * strBeginTime is later than strEndTime). If the parameters are invalid, Integer.MIN_VALUE is returned.
	 */
	public final double dateTimeDifference(
		String aBeginTime,
		String aEndTime,
		String aPrecision) {

		// Check parameters
		if (aBeginTime == null || aBeginTime.length() == 0) {
			//Insert Debug Code Here ("DateTimeDifference: strBeginTime empty");
			return Integer.MIN_VALUE;
		}
		if (aEndTime == null || aEndTime.length() == 0)
			aEndTime = getCurrentTimeStamp();
		Date beginTime = parseDateTimeStamp(aBeginTime);
		Date endTime = parseDateTimeStamp(aEndTime);
		return dateTimeDifference(beginTime, endTime, Precision.getPrecision(aPrecision));
		}

	
	public double dateTimeDifference(Date aBeginTime, Date aEndTime, Precision aPrecision) {
		
		if (aBeginTime == null)
			return Integer.MIN_VALUE;
		double nBeginTime = (double) aBeginTime.getTime();
	
		if (aEndTime == null)
			return Integer.MIN_VALUE;
		double nEndTime = (double) aEndTime.getTime();
	
		double nTimeDifference = nEndTime - nBeginTime;
		switch (aPrecision) {
			case MILLISECONDS :
				break;
			case SECONDS :
				nTimeDifference = nTimeDifference / 1000.0;
				break;
			case MINUTES :
				nTimeDifference = nTimeDifference / 1000.0;
				nTimeDifference = nTimeDifference / 60.0;
				break;
			case HOURS :
				nTimeDifference = nTimeDifference / 1000.0;
				nTimeDifference = nTimeDifference / 60.0;
				nTimeDifference = nTimeDifference / 60.0;
				break;
			case DAYS :
				nTimeDifference = nTimeDifference / 1000.0;
				nTimeDifference = nTimeDifference / 60.0;
				nTimeDifference = nTimeDifference / 60.0;
				nTimeDifference = nTimeDifference / 24.0;
				break;
			case MONTHS :
				nTimeDifference = getMonthsBetweenDates( aBeginTime, aEndTime );
				break;
			case YEARS :
				nTimeDifference = getMonthsBetweenDates( aBeginTime, aEndTime );
				nTimeDifference = nTimeDifference / 12.0;
				break;
			case CENTURIES :
				nTimeDifference = getMonthsBetweenDates( aBeginTime, aEndTime );
				nTimeDifference = nTimeDifference / 12.0;
				nTimeDifference = nTimeDifference / 100.0;
				break;
		}
		// Take off the decimal part.
		if(nTimeDifference >= 0) {
			nTimeDifference = Math.floor(nTimeDifference);
		} else {
			nTimeDifference = Math.ceil(nTimeDifference);
		}
		return (nTimeDifference);
	}
	
	/**
	 * Helper method for 'M', 'Y' & 'C' options below.
	 * get the number of months and work your way up.
	 * @param aBegin TODO
	 * @param aEnd TODO
	 */
	long getMonthsBetweenDates( Date aBegin, Date aEnd ) {
		if( aBegin.equals(aEnd) )
			return 0;
	
		int sign = 1;
		// make sure begin is before end date
		if (aBegin.getTime() > aEnd.getTime()) {
			Date temp = aBegin;
			aBegin = aEnd;
			aEnd = temp;
			sign = -1;
		}
	
		// create a GregorianCalendar with the GMT time zone
		TimeZone gmtZone = TimeZone.getTimeZone("GMT");
		Calendar begin = new GregorianCalendar(gmtZone);
		begin.setTime(aBegin);
	
		Calendar end = new GregorianCalendar(gmtZone);
		end.setTime(aEnd);
	
		int by = begin.get(Calendar.YEAR);
		int bm = begin.get(Calendar.MONTH);
		int bd = begin.get(Calendar.DAY_OF_MONTH);
	
		int ey = end.get(Calendar.YEAR);
		int em = end.get(Calendar.MONTH);
		int ed = end.get(Calendar.DAY_OF_MONTH);
	
		int diff = 0;
	
		// are both dates in the same year?
		if( ey == by ) {
			// count the end month only if the end month has reached the start dates day.
			if( ed >= bd )
				return (em - bm) * sign;
			else
				return (em - bm - 1) * sign;
		}
	
		// how many months are there in the first, and how many in the last?
		int fym = 11-bm;
		int lym = em+1;
	
		// Are there whole years we need to count between these dates?
		diff = Math.max(0, (Math.abs(ey - by) - 1) * 12);
	//		if( ey > (by+1) ) {
	//			diff = (ey - by - 1) * 12;
	//		}
	
		// count the end month only if the end month has reached the start date's day.
		// (note we've ordered the dates above)
		if( ed >= bd )
			return (fym + diff + lym) * sign;
		else
			return (fym + diff + lym - 1) * sign;
	}
	
	/**
	 * If either of the inputs are invalid or null then IllegalArgumentException is thrown
	 * @param strBeginTime	Start date formatted in standard internal form.
	 * @param strEndTime	Ending date formatted in standard internal form.
	 * @return true when strBeginTime is before strEndTime
	 */
	public final boolean isBefore(String strBeginTime, String strEndTime) {
		/*// Check parameters
		if (strBeginTime == null || strBeginTime.length() == 0) {
			throw new IllegalArgumentException("Pass a valid non-empty value for the paramter strBegineTime");
		}
		if (strEndTime == null || strEndTime.length() == 0) {
			throw new IllegalArgumentException("Pass a valid non-empty value for the paramter strEndTime");
		}*/
		Date beginTime = parseDateTimeStamp(strBeginTime);
		if (beginTime == null)
			throw new IllegalArgumentException("Failed to parse the given date time : " + strBeginTime + ", please pass a valid value");
		Date endTime = parseDateTimeStamp(strEndTime);
		if (endTime == null)
			throw new IllegalArgumentException("Failed to parse the given date time : " + strEndTime + ", please pass a valid value");
		
		return beginTime.before(endTime);
	}

	/**
	 * append two digit zero-filled number to string buffer
	 * (Helper method for DateTimeDuration)
	 * @param aBuf StringBuilder to which value is appended
	 * @param aVal int value to convert
	 */
	private static final void appendZInt2(StringBuilder aBuf, int aVal) {
		if (aVal < 10) {
			aBuf.append('0');
			aBuf.append(Integer.toString(aVal));
		} else if (aVal < 100) {
			aBuf.append(Integer.toString(aVal));
		} else {
			aBuf.append(Integer.toString(aVal % 100));
		}
	}

	/**
	 * append three digit zero-filled number to string buffer
	 * (Helper method for DateTimeDuration)
	 * @param aBuf StringBuilder to which value is appended
	 * @param aVal int value to convert
	 */
	private static final void appendZInt3(StringBuilder aBuf, int aVal) {
		if (aVal < 10) {
			aBuf.append("00");
			aBuf.append(Integer.toString(aVal));
		} else if (aVal < 100) {
			aBuf.append('0');
			aBuf.append(Integer.toString(aVal));
		} else if (aVal < 1000) {
			aBuf.append(Integer.toString(aVal));
		} else {
			aBuf.append(Integer.toString(aVal % 1000));
		}
	}

	/**
	 * convert date to specified precision
	 * (Helper method for DateTimeDuration)
	 * @param aBuf StringBuilder to which value is appended
	 * @param aDate Calendar representing date to deal with
	 * @param aPrec, desired precision, one of "CYMDhmsS" to specify
	 * century, year, month, hour, minute, second, or millisecond respectively
	 */
	static final void appendDateDuration(StringBuilder aBuf, Calendar aDate, Precision aPrec) {

		while (true) {
			if (aPrec == Precision.CENTURIES) {
				aBuf.append(aDate.get(Calendar.YEAR) / 100);
				break;
			}

			aBuf.append(aDate.get(Calendar.YEAR));
			if (aPrec == Precision.YEARS) break;

			aBuf.append('-');
			appendZInt2(aBuf, aDate.get(Calendar.MONTH) + 1);
			if (aPrec == Precision.MONTHS) break;

			aBuf.append('-');
			appendZInt2(aBuf, aDate.get(Calendar.DATE));
			if (aPrec == Precision.DAYS) break;

			aBuf.append('T');
			appendZInt2(aBuf, aDate.get(Calendar.HOUR_OF_DAY));
			if (aPrec == Precision.HOURS) break;

			appendZInt2(aBuf, aDate.get(Calendar.MINUTE));
			if (aPrec == Precision.MINUTES) break;

			appendZInt2(aBuf, aDate.get(Calendar.SECOND));
			if (aPrec == Precision.SECONDS) break;	// 's' is the default

			aBuf.append('.');
			appendZInt3(aBuf, aDate.get(Calendar.MILLISECOND));
			break;
		}
	}

	/**
	 * compute the difference between two dates (passed as strings)
	 * @param aBeginTime starting time
	 * @param strEndTiem ending time
	 * @param strPrecision, desired precision, one of "CYMDhmsS" to specify
	 * century, year, month, day, hour, minute, second, or millisecond respectively
	 * @return String difference to specified precision, as a string showing
	 * from and to range (ISO duration format), null if parameters invalid
	 */
	public final String dateTimeDuration(
			String aBeginTime,
			String aEndTime,
			String aPrecision) {


			// Check parameters
			if ((aBeginTime == null) || (aEndTime == null))
				return null;
			if ((aBeginTime.equals("")) || (aEndTime.equals("")))
				return null;
			
			Date beginTime = parseDateTimeStamp(aBeginTime);
			Date endTime = parseDateTimeStamp(aEndTime);

			return dateTimeDuration(beginTime, endTime, Precision.getPrecision(aPrecision));

				}
	
	public String dateTimeDuration(Date aBeginTime, Date aEndTime, Precision aPrecision) {
	
			// sanity check the values
			double nDateTimeDiff =
			dateTimeDifference(aBeginTime, aEndTime, aPrecision);
			if (nDateTimeDiff == Integer.MIN_VALUE)
				return null;
	
			// Get calendars for beginning and ending dates
			Calendar beginDateCalendar = Calendar.getInstance();
			TimeZone gmtZone = TimeZone.getTimeZone("GMT");
			beginDateCalendar.setTimeZone(gmtZone);
		beginDateCalendar.setTime(aBeginTime);
	
			Calendar endDateCalendar = Calendar.getInstance();
			endDateCalendar.setTimeZone(gmtZone);
		endDateCalendar.setTime(aEndTime);
	
			StringBuilder theBuf = new StringBuilder();
		appendDateDuration(theBuf, beginDateCalendar, aPrecision);
			theBuf.append("--");
		appendDateDuration(theBuf, endDateCalendar, aPrecision);
	
			return theBuf.toString();
		}

	public final String formatDateTime(
		String aDateTime,
		String aPattern,
		String aTimeZone,
		String aLocale) {

		if (aDateTime == null) {
			return null;
		}

		// the only known use is in Rule-Utility-Function FormatDateTime
		// but the original implementation simply ignored strPattern and used
		// the standard datetime stamp.
		// OLSOK 13-Sep-05 B-15821 honor all parameters if a pattern is supplied
		
		if (aPattern == null || aPattern.length() == 0) {
			return formatDateTime(aDateTime, aTimeZone, aLocale);
		}
		
		Date useDateTime = parseDateTimeStamp(aDateTime);
		if (useDateTime == null) {
				return null;
		}
		return PRDateFormat.format(aLocale, aTimeZone, aPattern, useDateTime);
	}

	public final String formatDateTime(
            String aDateTime,
            String aPattern,
            String aTimeZone,
            String aLocale,
            boolean boolSupport24hr) {
            
            if(null != aPattern && boolSupport24hr) {
                   if(!aPattern.startsWith("\t")){
                         aPattern = aPattern.replaceAll("h", "H").replaceAll("a", "");
                   } else {
                         aPattern = PRDateFormat.getFormatPattern(aLocale, aPattern);
                         aPattern = aPattern.replaceAll("h", "H").replaceAll("a", "");
                   }
            }
            
            return  formatDateTime(aDateTime, aPattern, aTimeZone, aLocale);           
     }

	
	public final String formatDateTime(
		String aDateTime,
		String aTimeZone,
		String aLocale) {

		// Check parameters
		if (aDateTime == null) {
			return null;
		}
		Date useDateTime = parseDateTimeStamp(aDateTime);
		if (useDateTime == null) {
				return null;
		}

		return PRDateFormat.format(
			aLocale,
			aTimeZone,
			PRDateFormat.PEGARULES_INTERNAL_DATETIME,
			useDateTime);
	}

	/**
	 * Returns the current date and time as a PegaRULES time stamp (ISO format, GMT zone)
	 * @return PegaRULES standard date/time string
	 */
	public final String getCurrentTimeStamp() {
//		Date now = new Date(System.currentTimeMillis());
//		return formatDateTimeStamp(now);
		return PRDateFormat.formatIDT(System.currentTimeMillis());
	}

	/**
	 * 	Format the specified time as a PegaRULES time stamp (ISO format, GMT zone)
	 * 	@param  Date object
	 * 	@return PegaRULES standard date/time string; empty string if aDateTime is null
	 */
	public final String formatDateTimeStamp(Date aDateTime) {
		if (aDateTime == null)
			return "";

		return PRDateFormat.formatInternalDateTime(aDateTime);
	}

	/**
	 * Format the specified date as a PegaRULES date stamp (yyyyMMdd)
	 * @param  Date object
	 * @return PegaRULES standard date string; empty string if aDate is null
	 */
	public final String formatDateStamp(Date aDate) {
		if (aDate == null)
			return "";

		return PRDateFormat.formatInternalDate(aDate);
	}

	/**
	 * Format the specified Time as a PegaRULES Date Time stamp (ISO format, GMT zone)
	 * Note that this method returns a date/time, not a time, for backward compatibility purposes.
	 * @param  Date object
	 * @return PegaRULES standard date time string; empty string if aTime is null
	 */
	public final String formatTimeStamp(Date aTime) {
		if (aTime == null)
			return "";
		return PRDateFormat.formatInternalDateTime(aTime); 
	}

	/**
	 * Format the specified Time as a PegaRULES Time stamp (HHmmss [assumed GMT])
	 * @param  Date object
	 * @return PegaRULES standard time string; empty string if aTime is null
	 */
	public final String formatTimeOnlyStamp(Date aTime) {
		if (aTime == null)
			return "";
		return PRDateFormat.formatInternalTime(aTime); 
	}
	
	/**
	 * Converts string containing various formats of date & datetime into a Date object.
	 * @param  The various supported input date formats.
	 * @return Date object, null if date could not be parsed.
	 */
	public final Date parseDateTimeString(String aDateTime) {
		if (aDateTime == null || aDateTime.length() == 0) {
			return null;
		}
		try {
			return PRDateFormat.parseAsDateTime(null, null, null, aDateTime);
		} catch (Exception e) {
			// ignore and return null...
			PRThread prThread = ThreadContainer.get();
			if (prThread != null && prThread.getStepStatus() != null) {
				prThread.getStepStatus().backoutWorst();
			}
		}
		return null;
	}

	/**
	 * Coverts an internal date time stamp into a Java Date object.
	 * see also parseDateTimeStamp
	 * @return the date
	 */
	public final Date getDate(String aStamp) {
		if (aStamp == null || aStamp.length() == 0) {
			return null;
		}
		Date returnDate = PRDateFormat.parseInternalDateTime(aStamp);
		if (returnDate == null) {
			returnDate = PRDateFormat.parseInternalDate(aStamp);
		}
		return returnDate;
	}

	/**
	 * Converts string form of datetimestamp to a Date object.
	 * @param  PegaRULES standard date/time string
	 * @return Date object, null if date could not be parsed.
	 */
	public final Date parseDateTimeStamp(String aISODate) {
		if (aISODate == null)
			return null;

		Date targetDate = null;

		int len = aISODate.length();
		if( len >= 19
			&& aISODate.charAt(8) == 'T'
			&& aISODate.charAt(15) == '.' ) {

			String input = aISODate;
			int pos = 0;

			// 03-Mar-00 new standard format uses GMT timezone
			// and looks like: 20000107T125420.029 GMT+00:00
			// legacy format uses local timezone and includes timezone offset from GMT
			// and looks like: 20000303T081714.154-05:00
			// So, if the character before the +/- is not a letter, it is our legacy
			// format and should be processed accordingly.
			// 10-Mar-00 and if there is no +/- and the last character is a digit
			// then likewise assume it is the legacy format.

			if (((pos = aISODate.indexOf('+')) > 0)
				|| ((pos = aISODate.indexOf('-')) > 0)) {
				if (!Character.isLetter(aISODate.charAt(pos - 1))) {
					input = aISODate.substring(0, pos);
//					isLegacyFormat = true;
				}
//			} else {
//				if (aISODate.length() > 0
//					&& Character.isDigit(aISODate.charAt(aISODate.length() - 1)))
//					isLegacyFormat = true;
			}

			targetDate = PRDateFormat.parseInternalDateTime(input);
		}
		return targetDate;
	}

	/**
	 * Converts string form of timestamp to a Date object.
	 * @param  PegaRULES standard timestamp string (HHmmss)
	 * @return Date object, null if date could not be parsed.
	 */
	public final Date parseTimeOfDayString(String aTime) {
		if( aTime == null || aTime.length() == 0)
			return null;

		try {
			return PRDateFormat.parseAsTime(null, null, null, aTime);
		} catch (Exception e) {
			// ignore and return null...
		}
		return null;
	}

	/**
	 * adds an interval to the specified time, using "business day" logic
	 * see TimeDifferenceBusinessDays
	 * uses the server's default calendar and GMT time zone
	 * @param aStart base date/time,
	 * if null or zero length, uses the current date and time
	 * @param aDays number of days to add
	 * @param aHours number of hours to add
	 * @param aMinutes number of minutes to add
	 * @param aSeconds number of seconds to add
	 * @return String using SimpleDateFormat("E' 'yyyy'/'MM'/'dd' 'HH':'mm':'ss z")
	 * and the server's default time zone
	 */
	@Deprecated
	// Use AddBuisnessDays Rule Utility Function instead
	public final String timeDifference(
		String aStart,
		int aDays,
		int aHours,
		int aMinutes,
		int aSeconds) {

		// Check parameters
		if (aStart == null)
			aStart = new String("");
		if (aStart.equals(""))
			aStart = getCurrentTimeStamp();
		if (aDays < 0)
			aDays = 0;
		if (aHours < 0)
			aHours = 0;
		if (aMinutes < 0)
			aMinutes = 0;
		if (aSeconds < 0)
			aSeconds = 0;
		// get the default calendar instance and call TimeDifferenceBusinessDays
		Calendar aCalendar = Calendar.getInstance();
		TimeZone gmtZone = TimeZone.getTimeZone("GMT");
		aCalendar.setTimeZone(gmtZone);
		return timeDifferenceBusinessDays(
			aCalendar,
			aStart,
			aDays,
			aHours,
			aMinutes,
			aSeconds);

	}

	/**
	 * adds an interval to the specified time, using "business day" logic
	 * assumes US business day rules (Saturday/Sunday closed), ignores
	 * possibility of holidays (constant 5 day weeks).
	 * @param aCalendar calendar to be used for computation,
	 * if null, uses the server's default calendar and local time zone
	 * @param aStart base date/time,
	 * if null or zero length, uses the current date and time
	 * @param aDays number of days to add
	 * @param aHours number of hours to add
	 * @param aMinutes number of minutes to add
	 * @param aSeconds number of seconds to add
	 * @return String using SimpleDateFormat("E' 'yyyy'/'MM'/'dd' 'HH':'mm':'ss z")
	 * and the server's default time zone
	 */
	public final String timeDifferenceBusinessDays(
		Calendar aCalendar,
		String aStart,
		int aDays,
		int aHours,
		int aMinutes,
		int aSeconds) {

		if (aCalendar == null)
			aCalendar = Calendar.getInstance(); // Get default calendar

		Date aStartDate = getDate(aStart);

		Date date = timeDifferenceBusinessDays(aCalendar, aStartDate, aDays, aHours, aMinutes, aSeconds);
		String zoneName = aCalendar.getTimeZone().getID();
		return PRDateFormat.format(null, zoneName, "E' 'yyyy'/'MM'/'dd' 'HH':'mm':'ss z", date);
	}
	
	public Date timeDifferenceBusinessDays(Calendar aCalendar, Date aStartDate, int aDays, int aHours, int aMinutes, int aSeconds) {
		
		if(aStartDate==null){
			aStartDate = new Date();
		}
		if (aCalendar == null)
			aCalendar = Calendar.getInstance(); // Get default calendar
		if (aDays < 0)
			aDays = 0;
		if (aHours < 0)
			aHours = 0;
		if (aMinutes < 0)
			aMinutes = 0;
		if (aSeconds < 0)
			aSeconds = 0;
		// convert nmber of seconds, minutes, and hours to number of days. Assume using 24 hrs convention.

		int nAddupMinutes = aSeconds / 60;
		aSeconds = aSeconds - (nAddupMinutes * 60);
		aMinutes = aMinutes + nAddupMinutes;
		int nAdupHours = aMinutes / 60;
		aMinutes = aMinutes - (nAdupHours * 60);
		aHours += nAdupHours;
		int nAddupDays = aHours / 24;
		aHours = aHours - (nAddupDays * 24);
		// update the number of days

		aDays = aDays + nAddupDays;
	
		// Algorithm to look for the business day starting with strStart (starting date)
		// and away from it by nDays (number of businness days)

		int nAdjustedDays = aDays;
	
		aCalendar.setTime(aStartDate);
		switch (aCalendar.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.MONDAY :
				if (aDays > 3) {
					nAdjustedDays = aDays - 4;
					aCalendar.add(Calendar.DATE, 7);
				} else
					nAdjustedDays = aDays + 1;
				break;
			case Calendar.TUESDAY :
				if (aDays > 2) {
					nAdjustedDays = aDays - 3;
					aCalendar.add(Calendar.DATE, 6);
				} else
					nAdjustedDays = aDays + 1;
				break;
			case Calendar.WEDNESDAY :
				if (aDays > 1) {
					nAdjustedDays = aDays - 2;
					aCalendar.add(Calendar.DATE, 5);
				} else
					nAdjustedDays = aDays + 1;
				break;
			case Calendar.THURSDAY :
				if (aDays > 0) {
					nAdjustedDays = aDays - 1;
					aCalendar.add(Calendar.DATE, 4);
				} else
					nAdjustedDays = aDays + 1;
				break;
			case Calendar.FRIDAY :
				aCalendar.add(Calendar.DATE, 3);
				break;
			case Calendar.SATURDAY :
				aCalendar.add(Calendar.DATE, 2);
				break;
			case Calendar.SUNDAY :
				aCalendar.add(Calendar.DATE, 1);
				break;
		}
	
		int nBusinessWeeks = nAdjustedDays / 5;
		int nRemainDays = nAdjustedDays - (nBusinessWeeks * 5);
		int nAdvanceDays = (nBusinessWeeks * 7) + nRemainDays;
	
		aCalendar.add(Calendar.DATE, nAdvanceDays);
		aCalendar.add(Calendar.HOUR_OF_DAY, aHours);
		aCalendar.add(Calendar.MINUTE, aMinutes);
		aCalendar.add(Calendar.SECOND, aSeconds);
		// Check and update seconds, minutes, hours
	
		// format and return
		return aCalendar.getTime();
	}

	/**
	 * returns the first business day after the specified date, using "business day" logic
	 * assumes US business day rules (Saturday/Sunday closed), ignores
	 * possibility of holidays (constant 5 day weeks).
	 * @param aCalendar calendar to be used for computation,
	 * if null, uses the server's default calendar and GMT time zone
	 * @param aStart base date/time,
	 * if null or zero length, uses the current date and time
	 * @return String using SimpleDateFormat("E' 'yyyy'/'MM'/'dd' 'HH':'mm':'ss z")
	 * and the server's default time zone
	 */
	public final String timeDifferenceFirstBusinessDay(
		Calendar aCalendar,
		String aStart) {
		
		Date startDate = getDate(aStart);
		if(aCalendar==null){
			aCalendar = getDefaultGMTCalendar();
		}
		Date date = nextBusinessDay(aCalendar, startDate);
		String zoneName = aCalendar.getTimeZone().getID();
		return PRDateFormat.format(null, zoneName, "E' 'yyyy'/'MM'/'dd' 'HH':'mm':'ss z", date);
	}
	
	public Date nextBusinessDay(Calendar aCalendar, Date aDate) {
		
		if (aCalendar == null) {
			aCalendar = getDefaultGMTCalendar();
		}
		return timeDifferenceBusinessDays(aCalendar, aDate, 0, 0, 0, 0);
	}

	private Calendar getDefaultGMTCalendar() {
		Calendar aCalendar;
			// Get the default calendar using GMT time zone
			aCalendar = Calendar.getInstance();
			TimeZone gmtZone = TimeZone.getTimeZone("GMT");
			aCalendar.setTimeZone(gmtZone);
		return aCalendar;
		}
	/**
	 * Attempt to parse a string as a date/time value.
	 * <p>Originally, this implementation was copied from Date.parse(), but
	 * as noted there, the implementation is highly US-centric and doesn't
	 * lend itself to internationalization. As of PegaRULES 03-05, retract
	 * that implementation and use the localized logic introduced in PRDateFormat.
	 * <p>The only known use of this is in the "parseDateString" Rule-Utility-Function
	 * and the EvaluateCondition and EvaluateExpression Rule-Utility-Functions for
	 * decision maps and map values.
	 * @param   aDate   a string to be parsed as a date.
	 * @return  the number of milliseconds since January 1, 1970, 00:00:00 GMT
	 *          represented by the string argument.
	 * @see     java.text.DateFormat
	 * officially deprecated As of JDK version 1.1,
	 * replaced by <code>DateFormat.parse(String s)</code>.
	 */
	public final long parseDateString(String aDate) {
		// use locale-sensitive parse for date/time
		Date theDate = null;
		if (aDate != null && aDate.length() > 0) {
			theDate = PRDateFormat.parseAsDateTime(null, null, null, aDate);
		}
		if (theDate != null) {
			return theDate.getTime();
		} else {
			// syntax error
			throw new IllegalArgumentException();
		}
	}

//	/**
//	 * Convert a {@link java.sql.Timestamp} to a {@link java.util.Date}.
//	 * Note that even though <code>Timestamp</code> extends <code>Date</code>,
//	 * they cannot be used interchangeably.
//	 *
//	 * @param aTimestamp a timestamp
//	 * @return the timestamp expressed as a <code>Date</code>.  Note that
//	 * 		timetamps are accurate to nanoseconds, while date are accurate to
//	 * 		milliseconds--so the result is rounded to milliseconds
//	 */
//	public static Date timestamp2Date(Timestamp aTimestamp) {
//		long time = aTimestamp.getTime();
//		time = (time / 1000) * 1000;
//		time += aTimestamp.getNanos() / 1000000;
//		return new Date(time);
//	}
//
// This isn't necessary: Timestamp.getTime() will return millis properly,
// so just do: new Date(timestamp.getTime())

	/**
	 * Given the name of a day, return the matching java.util.Calendar constant field.
	 * @param aMonth
	 * @return Matching java.util.Calendar field
	 */
	public int stringDayToConstant(String aLocale, String aWeekday) {
//	    int daySelection = 0;
	    String [] days = PRDateFormat.getWeekdays(aLocale);
	    for (int i = 0; i < days.length; ++i) {
	    	if (days[i].equalsIgnoreCase(aWeekday)) return i;
	    }	
	    return -1;
	}
	
	/**
	 * Given the name of a month, return the matching java.util.Calendar constant field.
	 * @param aMonth
	 * @return Matching java.util.Calendar field
	 */	
	public int stringMonthToConstant(String aLocale, String aMonth) {
//	    int monthSelection = 0;
		try{
			int month = Integer.parseInt(aMonth);
			return month-1;
		}catch (NumberFormatException nfe){
			// failed? check for names
		}
		//if it comes here means , aMonth value is a String like September etc.
	    String [] months = PRDateFormat.getMonths(aLocale);
	    for (int i = 0; i < months.length; ++i) {
	    	if (months[i].equalsIgnoreCase(aMonth)) return i;
	    }	
	    return -1;
	}
	public  double getDifferenceInDays(Date aBeginDate, Date aEndDate) {
		double nBeginTime = (double) aBeginDate.getTime();
		double nEndTime = (double) aEndDate.getTime();

		double nTimeDifference = nEndTime - nBeginTime;

		nTimeDifference = nTimeDifference / 1000.0;
		nTimeDifference = nTimeDifference / 60.0;
		nTimeDifference = nTimeDifference / 60.0;
		nTimeDifference = nTimeDifference / 24.0;
		
		return Math.floor(nTimeDifference);
	}
	
	@Override
	public BigDecimal today() {		
		Calendar calendar = Calendar.getInstance();	
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date endDate = calendar.getTime();
		
		calendar.clear();
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		calendar.set(1970,0,1);
		Date beginDate = calendar.getTime();

		double diffInDays = getDifferenceInDays(beginDate, endDate);

		return new BigDecimal(diffInDays);		
	}
	
	@Override
	public BigDecimal toDateTime(String aDateString) {
		BigDecimal result;
		try {
			Date dt = parseDateTimeString(aDateString); 
			
			if (dt == null) {
				result = com.pega.ibm.icu.math.BigDecimal.ZERO; 
			} else {
				BigDecimal tod = new BigDecimal(dt.getTime());
				result = tod.divide(gBDMillisecondsPerDay, 9, MathContext.ROUND_HALF_UP) ;
			}
		} catch (Exception e) {
			oLog.error("Exception occured", e);
			result = com.pega.ibm.icu.math.BigDecimal.ZERO; 
		}
		return result;
	}
	
	@Override
	public BigDecimal dateStringToBigDecimal(String aDateString, DateTypes aDateType) {
		Date dt;
		BigDecimal result;
		if(DateTypes.TimeOfDay.equals(aDateType)) {
			dt = parseTimeOfDayString(aDateString);
		} else {
			dt = parseDateTimeString(aDateString);
		}
		if (dt == null) {
			throw new InvalidValueException();
		}
		BigDecimal tod = new BigDecimal(dt.getTime());
		if(DateTypes.Date.equals(aDateType)) {
			result = tod.divide(gBDMillisecondsPerDay, 0, MathContext.ROUND_FLOOR);
		} else { 
			// if 'dateType' is TimeOfDay or DateTime        
			result = tod.divide(gBDMillisecondsPerDay, 9, MathContext.ROUND_HALF_UP);
		}
		
		return result;
	}
	
	@Override
	public BigDecimal date(int aYear, int aMonth, int aDay) {
		Calendar calendar = Calendar.getInstance();	
		
		// set time to Calendar start date
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		calendar.set(1970, 0, 1, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date beginDate = calendar.getTime();
		calendar.clear();
		
		// set time to given input date
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		calendar.set(aYear, aMonth -1, aDay, 0 ,0 ,0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date endDate = calendar.getTime();
		
		double diffInDays = getDifferenceInDays(beginDate, endDate);

		return BigDecimal.valueOf(diffInDays);	
	}
	
	@Override
	public String addCalendar(String aDate, String aYears, String aMonths, String aWeeks, String aDays, String aHours,
			String aMinutes, String aSeconds) {
		int version = getAddCalendarVersion();
		
		if(version == 2) {
			oLog.debug("Using Version 2 of addCalendar API");
			return addCalendar_Version2(aDate, aYears, aMonths, aWeeks, aDays, aHours, aMinutes, aSeconds); 
		} else {
			return addCalendar_Version1(aDate, aYears, aMonths, aWeeks, aDays, aHours, aMinutes, aSeconds);
		}		
	}

	private String addCalendar_Version1(String aDate, String aYears, String aMonths, String aWeeks, String aDays,
			String aHours, String aMinutes, String aSeconds) {

		Calendar calendar = Calendar.getInstance(); 

		calendar.setTime(aDate.equals("") ? parseDateTimeString(getCurrentTimeStamp()) : parseDateTimeString(aDate)); 

		calendar.add(Calendar.MONTH, aMonths.equals("")?0:Integer.parseInt(aMonths));

		calendar.add(Calendar.YEAR, aYears.equals("")?0:Integer.parseInt(aYears));

		int day = aDays.equals("")?0:Integer.parseInt(aDays);

		day += (aWeeks.equals("")?0:Integer.parseInt(aWeeks))*7;

		return addToDate(formatDateTimeStamp(calendar.getTime()), day+"", aHours, aMinutes, aSeconds);
	}

	private String addCalendar_Version2(String aDate, String aYears, String aMonths, String aWeeks, String aDays,
			String aHours, String aMinutes, String aSeconds) {
		Calendar calendar = Calendar.getInstance(); 

		//set requestor timezone on calendar object 
		calendar.setTimeZone(java.util.TimeZone.getTimeZone(getRequestorTimeZone())); 

		calendar.setTime(aDate.equals("") ? parseDateTimeString(getCurrentTimeStamp()) : parseDateTimeString(aDate)); 

		calendar.add(Calendar.MONTH, aMonths.equals("")?0:Integer.parseInt(aMonths)); 
		calendar.add(Calendar.YEAR, aYears.equals("")?0:Integer.parseInt(aYears)); 

		int day = aDays.equals("")?0:Integer.parseInt(aDays); 
		day += (aWeeks.equals("")?0:Integer.parseInt(aWeeks))*7; 
		calendar.add(Calendar.DAY_OF_MONTH, day); 

		calendar.add(Calendar.HOUR_OF_DAY, aHours.equals("")?0:Integer.parseInt(aHours)); 
		calendar.add(Calendar.MINUTE, aMinutes.equals("")?0:Integer.parseInt(aMinutes)); 
		calendar.add(Calendar.SECOND, aSeconds.equals("")?0:Integer.parseInt(aSeconds)); 

		return formatDateTimeStamp(calendar.getTime());
	}

	protected String getRequestorTimeZone() {
		return ThreadContainer.get().getRequestor().getRequestorPage().getString("pyDefaultTimeZone");
	}
	
	public int getAddCalendarVersion() {
		String ver = getDynamic_dateTimeAddCalendarVersion();
		int version = 1;
		try {
			if(!StringUtils.isBlank(ver)) {
				version = Integer.parseInt(ver);
			}
		} catch(NumberFormatException e) {
			oLog.error("Error in parsing given version: " + ver + ".Falling back to default version 1.");
		}
		
		return version;
	}
	
	protected String getDynamic_dateTimeAddCalendarVersion() {
		return PREngineProvider.getExec().getSystemSettings().getDynamic("Pega-Engine", "datetime/addcalendar/version");
	}
//	public static void main(String[] argv) {
//		String d1 = "19710101T000000.000 GMT";
//		String d2 = "19690102T000000.000 GMT";
//		double diff = getInstance().dateTimeDifference(d1, d2, "M");
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println("diff = " + diff);
//	}
}