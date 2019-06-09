package main;

public class Families {
	private String family;
	
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
				return "A";
//				FamilyACalculation();
//				break;
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
	
	public static void FamilyACalculation() {
		
	}
	
	public static void FamilyBCalculation() {
		
	}
	
	public static void FamilyCCalculation() {
		
	}
}
