package main;

import java.util.Scanner;
import main.BabysitterStart;

public class RunBabysitterKata {

	public static void main(String[] args) {
		String nameOfSitter = null;
		int hourStarted = 0;
		int minuteStarted = 0;
		int hourEnded = 0;
		int minuteEnded = 0;
		int AMPMStart = 0;
		int AMPMEnd = 0;
		BabysitterStart babysitterName = new BabysitterStart();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Babysitter Kata:");
		System.out.println("The babysitter may be paid for a night of babysitting for the");
		System.out.println("Adams family (Family A), the Bridges family (Family B), or the");
		System.out.println("Campbell family (Family C).  The babysitter may calculate his/her");
		System.out.println("nightly charge.  The babysitter may start no earlier than 5:00 pm,");
		System.out.println("must leave no later than 4:00 am, and gets paid for full hours (no");
		System.out.println("fractional hours).");
		
		while(true) {
			
			System.out.println("");
			System.out.print("What is your name?");
			babysitterName.setName(nameOfSitter);
			System.out.println("");
			
			System.out.print("What hour did you start babysitting?");
			hourStarted = in.nextInt();
			System.out.println("");
			System.out.print("Was it AM or PM (enter '0' for PM and '1' for AM)?");
			AMPMStart = in.nextInt();
			System.out.println("");
			BabysitterStart.BabysitterStartingHour(AMPMStart, hourStarted);
			
			System.out.print("What minute did you start babysitting?");
			minuteStarted = in.nextInt();
			System.out.println("");
			BabysitterStart.BabysitterStartingMinute(minuteStarted);
			
			System.out.print("What hour did you end babysitting?");
			hourEnded = in.nextInt();
			System.out.println("");
			System.out.print("Was it AM or PM (enter '0' for PM and '1' for AM)?");
			AMPMEnd = in.nextInt();
			System.out.println("");
			BabysitterStart.BabysitterEndingHour(AMPMEnd, hourEnded);
			
			System.out.print("What minute did you end babysitting?");
			minuteEnded = in.nextInt();
			System.out.println("");
			BabysitterStart.BabysitterEndingMinute(minuteEnded);
			
			
			
			
			
			
			
			in.close();
		}
		
	}
	
}
