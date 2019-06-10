package main;

public class BabysitterStart {
	private String name;
	private static final int startPM = 0;
	private static final int startAM = 12;
	private static final int endPM = 0;
	private static final int endAM = 12;
	private static final int hour = 60;

	public BabysitterStart() {
		this.name = null;
	}
	
	public String getName() {
		return name;
	}

	public static String BabysitterStartingHour(Integer startPMAM, Integer startHour) {
		if(startPMAM == 0 && startHour >= 0 && startHour <= 11) { // 0 in PM is noon.
			if((startPM + startHour) < 5) {	
				return "You cannot start babysitting before 5:00 PM.";
			}
			else {
				startHour += startPM;
				return startHour.toString();
//				return startHour;
			}
		}
		else if(startPMAM == 1 && startHour >= 0 && startHour <= 11) { // 0 in AM is midnight.
			if((startAM + startHour) > 16) {
				return "You cannot start babysitting after 4:00 AM.";
			}
			else{
				startHour += startAM;
				return startHour.toString();
//				return startHour;
			}
		}
		else {
			return "Error.";
		}
	}

	public static String BabysitterStartingMinute(Integer startMinute) {
		if(startMinute >= 0 && startMinute < hour) {
			String startMin = String.format("%02d", startMinute);
			return startMin.toString();
		}
		else {
			return "Error.";
		}
	}

	public static String BabysitterEndingHour(Integer endPMAM, Integer endHour) {
		if(endPMAM == 0 && endHour >= 0 && endHour <= 11) { // 0 in PM is noon.
			if((endPM + endHour) < 5) {	
				return "You cannot end babysitting during this time.";
			}
			else {
				endHour += endPM;
				return endHour.toString();
			}
		}
		else if(endPMAM == 1 && endHour >= 0 && endHour <= 11) { // 0 in AM is midnight.
			if((endAM + endHour) > 16) {
				return "You cannot end babysitting during this time.";
			}
			else{
				endHour += endAM;
				return endHour.toString();
			}
		}
		else {
			return "Error.";
		}
	}

	public static String BabysitterEndingMinute(Integer endMinute) {
		if(endMinute >= 0 && endMinute < hour) {
			return endMinute.toString();
		}
		else {
			return "Error.";
		}
	}

	public static String BabysitterTotalMinutesBabysitting(Integer startHour, Integer startMinute, Integer endHour, Integer endMinute) {
		Integer totalStartMinutes = (startHour * hour) + startMinute;
		Integer totalEndMinutes = (endHour * hour) + endMinute;
		Integer totalMinutes = totalEndMinutes - totalStartMinutes;
		if(totalEndMinutes <= totalStartMinutes) {
			return "Error. Babysitting ending time cannot be the same as or before the starting time.";
		}
		else if (totalMinutes < hour) {
			return "You must babysit for at least one hour to get paid.";
		}
		else {
			return totalMinutes.toString();
		}
	}

}
