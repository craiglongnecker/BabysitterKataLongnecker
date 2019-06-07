package main;

public class Families {

	public static String SelectFamily(String family) {
		if(family == "A" || family == "a"){
			return family;
		}
		else if(family == "B" || family == "b"){
			return family;
		}
		else if(family == "C" || family == "c"){
			return family;
		}
		else {
			return "Please select Family A, B, or C only.";
		}
	}
}
