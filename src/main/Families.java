package main;

public class Families {
	private String family;
	private static final int FAMILY_A_BEFORE11PM = 11;
	private static final int FAMILY_B_BEFORE10PM = 10;
	private static final int FAMILY_B_BEFOREMIDNIGHT = 12;
	private static final int FAMILY_C_BEFORE9PM = 9;
	private static final int FAMILY_A_15DOLLARS = 15;
	private static final int FAMILY_A_20DOLLARS = 20;
	private static final int FAMILY_B_12DOLLARS = 12;
	private static final int FAMILY_B_8DOLLARS = 8;
	private static final int FAMILY_B_16DOLLARS = 16;
	private static final int FAMILY_C_21DOLLARS = 21;
	private static final int FAMILY_C_15DOLLARS = 15;
	private static final int ZEROMINUTES = 0;
	private static final int HOUR = 1;

	public Families() { // Begin Constructor.
		this.family = null;
	} // Close Constructor.

	public String getFamily() {
		return family;
	}

	public static Integer FamilyACalculation(String startHour, String startMinute, String endHour, String endMinute) {
		int finalStartHour = Integer.parseInt(startHour);
		int finalStartMinute = Integer.parseInt(startMinute);
		int finalEndHour = Integer.parseInt(endHour);
		int finalEndMinute = Integer.parseInt(endMinute);

		if (finalStartHour < FAMILY_A_BEFORE11PM && finalStartMinute >= ZEROMINUTES && finalEndMinute > ZEROMINUTES) {
			int payBefore11PM = (FAMILY_A_BEFORE11PM - finalStartHour) * FAMILY_A_15DOLLARS;
			int payBefore4AM = ((finalEndHour + HOUR) - FAMILY_A_BEFORE11PM) * FAMILY_A_20DOLLARS;
			int familyATotalPay = payBefore11PM + payBefore4AM;
			return familyATotalPay;
		}

		else if (finalStartHour < FAMILY_A_BEFORE11PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute == ZEROMINUTES) {
			int payBefore11PM = (FAMILY_A_BEFORE11PM - finalStartHour) * FAMILY_A_15DOLLARS;
			int payBefore4AM = (finalEndHour - FAMILY_A_BEFORE11PM) * FAMILY_A_20DOLLARS;
			int familyATotalPay = payBefore11PM + payBefore4AM;
			return familyATotalPay;
		}

		else if (finalStartHour >= FAMILY_A_BEFORE11PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute > ZEROMINUTES) {
			int payBefore4AM = ((finalEndHour + HOUR) - finalStartHour) * FAMILY_A_20DOLLARS;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}

		else if (finalStartHour >= FAMILY_A_BEFORE11PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute == ZEROMINUTES) {
			int payBefore4AM = (finalEndHour - finalStartHour) * FAMILY_A_20DOLLARS;
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

		if (finalStartHour < FAMILY_B_BEFORE10PM && finalStartMinute >= ZEROMINUTES && finalEndMinute > ZEROMINUTES) {
			int payBefore10PM = (FAMILY_B_BEFORE10PM - finalStartHour) * FAMILY_B_12DOLLARS;
			if (FAMILY_B_BEFOREMIDNIGHT > finalEndHour) {
				int payBeforeMidnight = ((FAMILY_B_BEFOREMIDNIGHT - finalEndHour) + HOUR) * FAMILY_B_8DOLLARS;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight;
				return familyBTotalPay;
			} else {
				int payBeforeMidnight = FAMILY_B_16DOLLARS;
				int payBefore4AM = ((finalEndHour + HOUR) - FAMILY_B_BEFOREMIDNIGHT) * FAMILY_B_16DOLLARS;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}

		else if (finalStartHour < FAMILY_B_BEFORE10PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute == ZEROMINUTES) {
			int payBefore10PM = (FAMILY_B_BEFORE10PM - finalStartHour) * FAMILY_B_12DOLLARS;
			if (FAMILY_B_BEFOREMIDNIGHT > finalEndHour) {
				int payBeforeMidnight = (FAMILY_B_BEFOREMIDNIGHT - finalEndHour) * FAMILY_B_8DOLLARS;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight;
				return familyBTotalPay;
			} else {
				int payBeforeMidnight = FAMILY_B_16DOLLARS;
				int payBefore4AM = (finalEndHour - FAMILY_B_BEFOREMIDNIGHT) * FAMILY_B_16DOLLARS;
				int familyBTotalPay = payBefore10PM + payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}

		else if (finalStartHour >= FAMILY_B_BEFORE10PM && finalStartHour < FAMILY_B_BEFOREMIDNIGHT
				&& finalStartMinute >= ZEROMINUTES && finalEndMinute > ZEROMINUTES) {
			if (FAMILY_B_BEFOREMIDNIGHT > finalStartHour && FAMILY_B_BEFOREMIDNIGHT > finalEndHour) {
				int payBeforeMidnight = ((FAMILY_B_BEFOREMIDNIGHT - finalEndHour) + HOUR) * FAMILY_B_8DOLLARS;
				int familyBTotalPay = payBeforeMidnight;
				return familyBTotalPay;
			} else {
				int payBeforeMidnight = (FAMILY_B_BEFOREMIDNIGHT - finalStartHour) * FAMILY_B_8DOLLARS;
				int payBefore4AM = ((finalEndHour - FAMILY_B_BEFOREMIDNIGHT) + HOUR) * FAMILY_B_16DOLLARS;
				int familyBTotalPay = payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}

		else if (finalStartHour >= FAMILY_B_BEFORE10PM && finalStartHour < FAMILY_B_BEFOREMIDNIGHT
				&& finalStartMinute >= ZEROMINUTES && finalEndMinute == ZEROMINUTES) {
			if (FAMILY_B_BEFOREMIDNIGHT > finalStartHour && FAMILY_B_BEFOREMIDNIGHT > finalEndHour) {
				int payBeforeMidnight = (FAMILY_B_BEFOREMIDNIGHT - finalEndHour) * FAMILY_B_8DOLLARS;
				int familyBTotalPay = payBeforeMidnight;
				return familyBTotalPay;
			} else {
				int payBeforeMidnight = (FAMILY_B_BEFOREMIDNIGHT - finalStartHour) * FAMILY_B_8DOLLARS;
				int payBefore4AM = (finalEndHour - FAMILY_B_BEFOREMIDNIGHT) * FAMILY_B_16DOLLARS;
				int familyBTotalPay = payBeforeMidnight + payBefore4AM;
				return familyBTotalPay;
			}
		}

		else if (finalStartHour >= FAMILY_B_BEFOREMIDNIGHT && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute > ZEROMINUTES) {
			int payBefore4AM = ((finalEndHour - FAMILY_B_BEFOREMIDNIGHT) + HOUR) * FAMILY_B_16DOLLARS;
			int familyBTotalPay = payBefore4AM;
			return familyBTotalPay;
		}

		else if (finalStartHour >= FAMILY_B_BEFOREMIDNIGHT && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute == ZEROMINUTES) {
			int payBefore4AM = (finalEndHour - FAMILY_B_BEFOREMIDNIGHT) * FAMILY_B_16DOLLARS;
			int familyBTotalPay = payBefore4AM;
			return familyBTotalPay;
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

		if (finalStartHour < FAMILY_C_BEFORE9PM && finalStartMinute >= ZEROMINUTES && finalEndMinute > ZEROMINUTES) {
			int payBefore9PM = (FAMILY_C_BEFORE9PM - finalStartHour) * FAMILY_C_21DOLLARS;
			int payBefore4AM = ((finalEndHour + HOUR) - FAMILY_C_BEFORE9PM) * FAMILY_C_15DOLLARS;
			int familyCTotalPay = payBefore9PM + payBefore4AM;
			return familyCTotalPay;
		}

		else if (finalStartHour < FAMILY_C_BEFORE9PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute == ZEROMINUTES) {
			int payBefore9PM = (FAMILY_C_BEFORE9PM - finalStartHour) * FAMILY_C_21DOLLARS;
			int payBefore4AM = (finalEndHour - FAMILY_C_BEFORE9PM) * FAMILY_C_15DOLLARS;
			int familyCTotalPay = payBefore9PM + payBefore4AM;
			return familyCTotalPay;
		}

		else if (finalStartHour >= FAMILY_C_BEFORE9PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute > ZEROMINUTES) {
			int payBefore4AM = ((finalEndHour + HOUR) - finalStartHour) * FAMILY_C_15DOLLARS;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}

		else if (finalStartHour >= FAMILY_C_BEFORE9PM && finalStartMinute >= ZEROMINUTES
				&& finalEndMinute == ZEROMINUTES) {
			int payBefore4AM = (finalEndHour - finalStartHour) * FAMILY_C_15DOLLARS;
			int familyATotalPay = payBefore4AM;
			return familyATotalPay;
		}

		else {
			return 0;
		}
	}
}
