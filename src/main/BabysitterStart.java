package main;

public class BabysitterStart {
	private String name;
	private static final int STARTPM = 0;
	private static final int STARTAM = 12;
	private static final int ENDPM = 0;
	private static final int ENDAM = 12;
	private static final int HOUR = 60;
	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int FIVE = 5;
	private static final int ELEVEN = 11;
	private static final int SIXTEEN = 16;

//	public BabysitterStart() {
//		this.name = null;
//	}

	public static String BabysitterStartingHour(Integer startPMAM, Integer startHour) {
		if(startPMAM == ZERO && startHour >= ZERO && startHour <= ELEVEN) { // ZERO(0) in PM is noon.
			if((STARTPM + startHour) < FIVE) {	
				return "an Error.  Try again.";
			}
			else {
				startHour += STARTPM;
				return startHour.toString();
			}
		}
		else if(startPMAM == ONE && startHour >= ZERO && startHour <= ELEVEN) { // ZERO(0) in AM is midnight.
			if((STARTAM + startHour) > SIXTEEN) {
				return "an Error.  Try again.";
			}
			else{
				startHour += STARTAM;
				return startHour.toString();
			}
		}
		else {
			return "an Error.  Try again.";
		}
	}

	public static String BabysitterStartingMinute(Integer startMinute) {
		if(startMinute >= ZERO && startMinute < HOUR) {
			String startMin = String.format("%02d", startMinute);
			return startMin.toString();
		}
		else {
			return "an Error.  Try again.";
		}
	}

	public static String BabysitterEndingHour(Integer endPMAM, Integer endHour) {
		if(endPMAM == ZERO && endHour >= ZERO && endHour <= ELEVEN) { // 0 in PM is noon.
			if((ENDPM + endHour) < FIVE) {	
				return "an Error.  Try again.";
			}
			else {
				endHour += ENDPM;
				return endHour.toString();
			}
		}
		else if(endPMAM == ONE && endHour >= ZERO && endHour <= ELEVEN) { // 0 in AM is midnight.
			if((ENDAM + endHour) > SIXTEEN) {
				return "an Error.  Try again.";
			}
			else{
				endHour += ENDAM;
				return endHour.toString();
			}
		}
		else {
			return "an Error.  Try again.";
		}
	}

	public static String BabysitterEndingMinute(Integer endMinute) {
		if(endMinute >= ZERO && endMinute < HOUR) {
			return endMinute.toString();
		}
		else {
			return "an Error.  Try again.";
		}
	}

	public static String BabysitterTotalMinutesBabysitting(String startingHour, String startingMinute, String endingHour, String endingMinute) {
		int startHour = Integer.parseInt(startingHour);
		int startMinute = Integer.parseInt(startingMinute);
		int endHour = Integer.parseInt(endingHour);
		int endMinute = Integer.parseInt(endingMinute);

		Integer totalStartMinutes = (startHour * HOUR) + startMinute;
		Integer totalEndMinutes = (endHour * HOUR) + endMinute;
		Integer totalMinutes = totalEndMinutes - totalStartMinutes;
		if(totalEndMinutes <= totalStartMinutes) {
			return "an Error.  Try again.";
		}
		else if (totalMinutes < HOUR) {
			return "an Error.  Try again.";
		}
		else {
			return totalMinutes.toString();
		}
	}
}
