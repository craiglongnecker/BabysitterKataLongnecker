package main;

import java.util.Scanner;
import main.BabysitterStart;
import main.Families;

public class RunBabysitterKata {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String nameOfSitter = null;
		int hourStarted = 0;
		int minuteStarted = 0;
		int hourEnded = 0;
		int minuteEnded = 0;
		int AMPMStart = 0;
		int AMPMEnd = 0;
		String startingHour = null;
		String startingMinute = null;
		String endingHour = null;
		String endingMinute = null;
		int totalPay = 0;
		String family = null;
		String familyUpperCase = null;
		String totalMinutes = null;

		System.out.println("Babysitter Kata:");
		System.out.println("The babysitter may be paid for a night of babysitting for the");
		System.out.println("Adams family (Family A), the Bridges family (Family B), or the");
		System.out.println("Campbell family (Family C).  The babysitter may calculate his/her");
		System.out.println("nightly charge.  The babysitter may start no earlier than 5:00 pm,");
		System.out.println("must leave no later than 4:00 am, and gets paid for full hours (no");
		System.out.println("fractional hours).  The babysitter must also babysit for at least 60 minutes.");

		System.out.println("");
		System.out.print("What is your name? ");
		nameOfSitter = in.nextLine();
		System.out.println("");

		do {
			do {
				System.out.print("What hour did you start babysitting? ");
				hourStarted = in.nextInt();
				System.out.println("");
				System.out.print("Was it PM or AM (enter '0' for PM and '1' for AM)? ");
				AMPMStart = in.nextInt();
				System.out.println("");
				startingHour = BabysitterStart.BabysitterStartingHour(AMPMStart, hourStarted);
				System.out.println("Starting Hour is " + startingHour);
				System.out.println("");
			} while (startingHour == "an Error.  Try again.");

			do {
				System.out.print("What minute did you start babysitting? ");
				minuteStarted = in.nextInt();
				System.out.println("");
				startingMinute = BabysitterStart.BabysitterStartingMinute(minuteStarted);
				System.out.println("Starting minute is " + startingMinute);
				System.out.println("");
			} while (startingMinute == "an Error.  Try again.");

			do {
				System.out.print("What hour did you end babysitting? ");
				hourEnded = in.nextInt();
				System.out.println("");
				System.out.print("Was it PM or AM (enter '0' for PM and '1' for AM)? ");
				AMPMEnd = in.nextInt();
				System.out.println("");
				endingHour = BabysitterStart.BabysitterEndingHour(AMPMEnd, hourEnded);
				System.out.println("Ending Hour is " + endingHour);
				System.out.println("");
			} while (endingHour == "an Error.  Try again.");

			do {
				System.out.print("What minute did you end babysitting? ");
				minuteEnded = in.nextInt();
				System.out.println("");
				endingMinute = BabysitterStart.BabysitterEndingMinute(minuteEnded);
				System.out.println("Ending minute is " + endingMinute);
				System.out.println("");
			} while (endingMinute == "an Error.  Try again.");

			totalMinutes = BabysitterStart.BabysitterTotalMinutesBabysitting(startingHour, startingMinute, endingHour,
					endingMinute);
			System.out.println("The Total Minutes are " + totalMinutes);
			System.out.println("");
		} while (totalMinutes == "an Error.  Try again.");

		System.out.println("Which family did you babysit for?  Please enter 'A' for Adams family,");
		System.out.println("'B' for the Bridges family or 'C' for the Campbell family: ");
		in.nextLine();
		while (true) {
			family = in.nextLine();
			familyUpperCase = family.toUpperCase();
			switch (familyUpperCase) {
			case "A":
				totalPay = Families.FamilyACalculation(startingHour, startingMinute, endingHour, endingMinute);
				System.out.print(nameOfSitter + ", you babysat for " + totalMinutes + " minutes and earned $");
				System.out.print(+totalPay + ".00 babysitting for the Adams family.");
				System.out.println("");
				break;
			case "B":
				totalPay = Families.FamilyBCalculation(startingHour, startingMinute, endingHour, endingMinute);
				System.out.print(nameOfSitter + ", you babysat for " + totalMinutes + " minutes and earned $");
				System.out.print(+totalPay + ".00 babysitting for the Bridges family.");
				System.out.println("");
				break;
			case "C":
				totalPay = Families.FamilyCCalculation(startingHour, startingMinute, endingHour, endingMinute);
				System.out.print(nameOfSitter + ", you babysat for " + totalMinutes + " minutes and earned $");
				System.out.print(+totalPay + ".00 babysitting for the Campbell family.");
				System.out.println("");
				break;
			default:
				System.out.print(
						"Please enter 'A' for Adams family, 'B' for the Bridges family or 'C' for the Campbell family: \n");
			}
		}
	}
}
