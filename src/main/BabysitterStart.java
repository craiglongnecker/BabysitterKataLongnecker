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

	public static int BabysitterStartPMOrAM(int startPMAM) {
		if(startPMAM == 1) {
			return startAM;
		}
		else {
			return startPM;
		}
	}

	public static int BabysitterStartingHour(int startHour) {

		return 5;
	}

}
