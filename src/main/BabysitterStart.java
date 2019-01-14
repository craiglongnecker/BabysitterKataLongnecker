package main;

import java.io.IOException;
import java.util.Scanner;

public class BabysitterStart {

	public static void main(String[] args) throws IOException { // Begin main.
		Scanner scanner = new Scanner(System.in);

	} // Close main.
	static int startPM = 0;
	static int startAM = 12;
	static int endPM = 0;
	static int endAM = 12;

	public static String BabysitterName(String name) {
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
			}
		}
		else if(startPMAM == 1 && startHour >= 0 && startHour <= 11) { // 0 in AM is midnight.
			if((startAM + startHour) > 16) {
				return "You cannot start babysitting after 4:00 AM.";
			}
			else{
				startHour += startAM;
				return startHour.toString();
			}
		}
		else {
			return "Error.";
		}
	}

	public static String BabysitterStartingMinute(Integer startMinute) {
		if(startMinute >= 0 && startMinute < 60) {
			return startMinute.toString();
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
		if(endMinute >= 0 && endMinute < 60) {
			return endMinute.toString();
		}
		else {
			return "Error.";
		}
	}

	public static String BabysitterTotalMinutesBabysitting(Integer startHour, Integer startMinute, Integer endHour, Integer endMinute) {
		Integer totalStartMinutes = (startHour * 60) + startMinute;
		Integer totalEndMinutes = (endHour *60) + endMinute;
		Integer totalMinutes = totalEndMinutes - totalStartMinutes;
		if(totalEndMinutes <= totalStartMinutes) {
			return "Error. Babysitting ending time cannot be the same as or before the starting time.";
		}
		else if (totalMinutes < 60) {
			return "You must babysit for at least one hour to get paid.";
		}
		return totalMinutes.toString();
	}

}
