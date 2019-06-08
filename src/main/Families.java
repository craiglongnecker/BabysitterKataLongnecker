package main;

public class Families {

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
			switch(family) {
			case "A":
				break;
			case "a":
				break;
			case "B":
				break;
			case "b":
				break;
			case "C":
				break;
			case "c":
				break;
			case "X":
				System.exit(0);
				break;
			case "x":
				System.exit(0);
				break;
			default:
				System.out.println("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.");
			}
		}
	}
}
