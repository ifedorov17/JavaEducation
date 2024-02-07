public class Main {

	public static void main(String[] args) {

//Autoboxing
		int digitPrimitive = 10;
		incrementObject(digitPrimitive);
		Integer digitObject = digitPrimitive;
		incrementObject(digitObject);


//Unboxing
		Integer otherDigitObject = 15;
		incrementPrimitive(otherDigitObject);
		int otherDigitPrimitive = otherDigitObject;
		incrementPrimitive(otherDigitPrimitive);


//Unboxing with null
		//int nullInt = null;                       //primitive cannot be null
		Integer nullDigit = null;
		int otherNullInt = nullDigit;
	}


	public static void incrementPrimitive(int i) {
		System.out.println(i + 1);
	}

	public static void incrementObject(Integer i) {
		System.out.println(i + 1);
	}
}
