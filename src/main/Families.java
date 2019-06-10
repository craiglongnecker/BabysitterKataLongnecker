package main;

public class Families {
	private String family;
	private static final int familyABefore11PM = 11;
	private static final int familyBBefore10PM = 10;
	private static final int familyBBeforeMidnight = 12;
	private static final int familyCBefore9PM = 9;
	private static final int familyA15Dollars = 15;
	private static final int familyA20Dollars = 20;
	private static final int familyB12Dollars = 12;
	private static final int familyB8Dollars = 8;
	private static final int familyB16Dollars = 16;
	private static final int familyC21Dollars = 21;
	private static final int familyC15Dollars = 15;
	private static final int minutes0 = 0;
	private static final int fullHour = 1;
	
	public Families() { // Begin Constructor.
		this.family = null;
	} // Close Constructor.
	
	public String getFamily() {
		return family;
	}

	public static String SelectFamily(String family) {
//		if(family == "A" || family == "a"){
//			return family;
//		}
//		else if(family == "B" || family == "b"){
//			return family;
//		}
//		else if(family == "C" || family == "c"){
//			return family;
//		}
//		else {
//			return "Please select Family A, B, or C only.";
//		}
		while(true) {
			family = family.toUpperCase();
			switch(family) {
			case "A":
				String startHour = null;
				String startMinute = null;
				String endHour = null;
				String endMinute = null;
				//				return "A";
				FamilyACalculation(startHour, startMinute, endHour, endMinute);
				break;
			case "B":
				return "B";
//				FamilyBCalculation();
//				break;
			case "C":
				return "C";
//				FamilyCCalculation();
//				break;
			case "X":
				return "X";
//				System.exit(0);
//				break;
			default:
				return "Please select Family 'A', 'B', or 'C' only, or 'X' to exit.";
			}
		}
	}
	
	public static Integer FamilyACalculation(String startHour, String startMinute, String endHour, String endMinute) {
		int finalStartHour = Integer.parseInt(startHour);
		int finalStartMinute = Integer.parseInt(startMinute);
		int finalEndHour = Integer.parseInt(endHour);
		int finalEndMinute = Integer.parseInt(endMinute);
		
		if(finalStartHour < familyABefore11PM && finalStartMinute >= minutes0 && finalEndMinute > minutes0) {
			int payBefore11PM = (familyABefore11PM - finalStartHour) * familyA15Dollars;
			int payBefore4AM = ((finalEndHour + fullHour) - familyABefore11PM) * familyA20Dollars;
			int familyATotalPay = payBefore11PM + payBefore4AM;
			return familyATotalPay;
		}
		
		else if(finalStartHour < familyABefore11PM && finalStartMinute >= minutes0 && finalEndMinute == minutes0) {
			int payBefore11PM = (familyABefore11PM - finalStartHour) * familyA15Dollars;
			int payBefore4AM = (finalEndHour - familyABefore11PM) * familyA20Dollars;
			int familyATotalPay = payBefore11PM + payBefore4AM;
			return familyATotalPay;
		}

		else if(finalStartHour >= familyABefore11PM && finalStartMinute >= minutes0 && finalEndMinute > minutes0) {
			int payBefore4AM = ((finalEndHour + fullHour) - finalStartHour) * familyA20Dollars;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}

		else if(finalStartHour >= familyABefore11PM && finalStartMinute >= minutes0 && finalEndMinute == minutes0) {
			int payBefore4AM = (finalEndHour - finalStartHour) * familyA20Dollars;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}
		
		else {
			return 0;
		}
	}
	
	public static Integer FamilyBCalculation(String startHour, String startMinute, String endHour, String endMinute) {
		int finalStartHour = Integer.parseInt(startHour);
		int finalStartMinute = Integer.parseInt(startMinute);
		int finalEndHour = Integer.parseInt(endHour);
		int finalEndMinute = Integer.parseInt(endMinute);
		
		if(finalStartHour < familyBBefore10PM && finalStartMinute >= minutes0 && finalEndMinute > minutes0) {
			int payBefore10PM = (familyBBefore10PM - finalStartHour) * familyB12Dollars;
			if(familyBBeforeMidnight > finalEndHour) {
				int payBeforeMidnight = ((familyBBeforeMidnight - finalEndHour) + fullHour) * familyB8Dollars;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight;
				return familyBTotalPay;
			}
			else {
				int payBeforeMidnight = familyB16Dollars;
				int payBefore4AM = ((finalEndHour + fullHour) - familyBBeforeMidnight) * familyB16Dollars;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}
		
		else if(finalStartHour < familyBBefore10PM && finalStartMinute >= minutes0 && finalEndMinute == minutes0) {
			int payBefore10PM = (familyBBefore10PM - finalStartHour) * familyB12Dollars;
			if(familyBBeforeMidnight > finalEndHour) {
				int payBeforeMidnight = (familyBBeforeMidnight - finalEndHour) * familyB8Dollars;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight;
				return familyBTotalPay;
			}
			else {
				int payBeforeMidnight = familyB16Dollars;
				int payBefore4AM = (finalEndHour - familyBBeforeMidnight) * familyB16Dollars;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}
		
		else if(finalStartHour >= familyBBefore10PM && finalStartHour < familyBBeforeMidnight && finalStartMinute >= minutes0 && finalEndMinute > minutes0) {
			if(familyBBeforeMidnight > finalStartHour && familyBBeforeMidnight > finalEndHour) {
				int payBeforeMidnight = ((familyBBeforeMidnight - finalEndHour) + fullHour) * familyB8Dollars;
				int familyBTotalPay = payBeforeMidnight;
				return familyBTotalPay;
			}
			else {
				int payBeforeMidnight = (familyBBeforeMidnight - finalStartHour) * familyB8Dollars;
				int payBefore4AM = ((finalEndHour - familyBBeforeMidnight) + fullHour) * familyB16Dollars;
				int familyBTotalPay = payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}

		else {
			return 0;
		}
	}
	
	public static Integer FamilyCCalculation(String startHour, String startMinute, String endHour, String endMinute) {
		int finalStartHour = Integer.parseInt(startHour);
		int finalStartMinute = Integer.parseInt(startMinute);
		int finalEndHour = Integer.parseInt(endHour);
		int finalEndMinute = Integer.parseInt(endMinute);
		
		if(finalStartHour < familyCBefore9PM && finalStartMinute >= minutes0 && finalEndMinute > minutes0) {
			int payBefore9PM = (familyCBefore9PM - finalStartHour) * familyC21Dollars;
			int payBefore4AM = ((finalEndHour + fullHour) - familyCBefore9PM) * familyC15Dollars;
			int familyCTotalPay = payBefore9PM + payBefore4AM;
			return familyCTotalPay;
		}
		
		else if(finalStartHour < familyCBefore9PM && finalStartMinute >= minutes0 && finalEndMinute == minutes0) {
			int payBefore9PM = (familyCBefore9PM - finalStartHour) * familyC21Dollars;
			int payBefore4AM = (finalEndHour - familyCBefore9PM) * familyC15Dollars;
			int familyCTotalPay = payBefore9PM + payBefore4AM;
			return familyCTotalPay;
		}

		else if(finalStartHour >= familyCBefore9PM && finalStartMinute >= minutes0 && finalEndMinute > minutes0) {
			int payBefore4AM = ((finalEndHour + fullHour) - finalStartHour) * familyC15Dollars;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}

		else if(finalStartHour >= familyCBefore9PM && finalStartMinute >= minutes0 && finalEndMinute == minutes0) {
			int payBefore4AM = (finalEndHour - finalStartHour) * familyC15Dollars;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}
		
		else {
			return 0;
		}
	}
}
