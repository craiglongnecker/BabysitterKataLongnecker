package main;

import java.io.IOException;
import java.util.Scanner;

public class BabysitterStart {

	public static void main(String[] args) throws IOException { // Begin main.
		Scanner scanner = new Scanner(System.in);

	} // Close main.
	static int startPM = 0;
	static int startAM = 12;

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

	public static int BabysitterStartingMinute(int startMinute) {
		return 2;
	}

}
