package com.trigonometry_library;

public class TrigonometryLibrary 
{
    public static double sin(double a, boolean isDegree) {

		// If input is in degrees, convert to radians
		if(isDegree) {
			a = toRadian(a);
		}

		// Validate input to lie between negative and positive infinity
		if (!(a > Double.NEGATIVE_INFINITY) || !(a < Double.POSITIVE_INFINITY)) {
			return Double.NaN;
		}

		// Store result of taylor series expansion
		double result = 0;

		// Calculate sin(n) using Taylor series expansion
		for (int i = 0; i <= 10; i++) {
			result += calcPow(-1, i) * (calcPow(a, 2 * i + 1) / calcFactorial(2 * i + 1));
		}

		return result;
	}

	public static double cos(double a, boolean isDegree) {

		// If input is in degrees, convert to radians
		if(isDegree) {
			a = toRadian(a);
		}
		
		// Validate input to lie between negative and positive infinity
		if (!(a > Double.NEGATIVE_INFINITY) || !(a < Double.POSITIVE_INFINITY)) {
			return Double.NaN;
		}

		// Store result of taylor series expansion
		double result = 0;

		// Calculate cos(n) using Taylor series expansion
		for (int i = 0; i <= 10; i++) {
			result += calcPow(-1, i) * (calcPow(a, 2 * i) / calcFactorial(2 * i));
		}

		return result;
	}

	public static double tan(double a, boolean isDegree) {

		// If input is in degrees, convert to radians
		if(isDegree) {
			a = toRadian(a);
		}

		// Validate input to lie between negative and positive infinity
		if (!(a > Double.NEGATIVE_INFINITY) || !(a < Double.POSITIVE_INFINITY)) {
			return Double.NaN;
		}

		return TrigonometryLibrary.sin(a, false) / TrigonometryLibrary.cos(a, false);

	}
    static double calcPi() {

		double pi = 0;

		for (int i = 10000; i > 0; i--) {
			pi += calcPow(-1, i + 1) / (2 * i - 1); 
			if (i == 1) { 
				pi *= 4;    
			}  
		}
		return pi;
	}

	// Method to calculate factorial of input n
	static long calcFactorial(int n){    

		long result = 1;

		while( n > 0) {
			result *= n;
			n--;
		}
		return result;
	}    
	
	// Method to calculate exponent of input base^exponent 
	static double calcPow( double base, int exponent ) {

		double result = 1;

		while (exponent != 0) {
			result *= base;
			--exponent;
		}
		return result;
	}
	
	// Method to convert degrees to radians
	static double toRadian( double degree) {

		double rad;
		
		rad = degree * calcPi() / 180.0;
		
		return rad;
	}
}
