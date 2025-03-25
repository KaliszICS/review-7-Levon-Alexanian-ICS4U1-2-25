public class PracticeProblem {
	//Create a function called evenOrOdd. This function will accept an integer as a parameter and return the word "Even" when the number is even, and will return the word "Odd" when odd.
	public static String evenOrOdd(int num) {
        if (num % 2 == 0) { 
			return "Even";
		}else {
			return "Odd";
		}
	}
	//Create a function called teacherOrStudent. This function will accept a String as a parameter and return the word "Teacher" when the word is "Kalisz", and will return "Student" if it is anythinge else.
	public static String teacherOrStudent(String word) {
        if (word == "Kalisz") { 
			return "Teacher";
		}else {
			return "Student";
		}
	}


	//Create a function called fartherFromZero. This function will accept an integer as a parameter and increase by 5 if it is positive, and decrease it by 5 if it is negative. If it is zero, simply return the 0.
	public static int fartherFromZero(int num) {
        if (num == 0) { 
			return num;
		}else if (num > 0) {
			return num + 5;
		}else {
			return num - 5;
		}
	}


	//Create a method called isFive().
	//The method will take in a single integer as a parameter.
	//If the integer is 5, return "The number is Five"
	//Otherwise, return "The number is not Five"
	//Use an else statement.
	public static String isFive(int num) {
        if (num == 5) { 
			return "The number is Five";
		}else {
			return "The number is not Five";
		}
	}

	
	//Create a method called positiveOrNegative().
	//The method will take in a single double as a parameter.
	//If the double is positive, return "Positive"
	//Otherwise, return "Negative" (This includes 0)
	//Use an else statement
	public static String positiveOrNegative(double num) {
        if (num > 0) { 
			return "Positive";
		}else {
			return "Negative";
		}
	}
	
	//Create a method called highOrLow().
	//The method will take in a single integer as a parameter.
	//If the integer is above 100, return "High"
	//Otherwise, return "Low"
	//Use an else statement
	public static String highOrLow(int num) {
        if (num > 100) { 
			return "High";
		}else {
			return "Low";
		}
	}
	
	//Create a method called isHello().
	//The method will take in a single String as a parameter.
	//If the String is "Hello", return "The word is Hello"
	//Otherwise, return "The word is not Hello"
	//Use an else statement
	public static String isHello(String word) {
        if (word == "Hello") { 
			return "The word is Hello";
		}else {
			return "The word is not Hello";
		}
	}}
