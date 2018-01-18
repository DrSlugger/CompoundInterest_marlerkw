/**
 * Name: Josh Yaggi & Kyle Marler
 * Assignment: Assignment01
 * Due Date: 1/18/18
 * Description: Used to test the code in the CompoundInterestClass class by Connor
 */
package compoundInterest;
/**
 * Assignment 1 for Bill Nicholson, Programming 2, Spring Semester 2018 UC Clermont
 * A compound interest calculator
 * @author Josh Yaggi
 */
public class Main {
	/**
	 * Runs tests against the CompoundInterestClass compound interest formula
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Each test uses the calculation from our CompoundInterestClass and will read the amount accumulated over that period.");
		//These are 21 different tests to see if the compound interest formula works correctly
		
		CompoundInterestClass cI = new CompoundInterestClass(5000, .05, 12, 10); 			// Establishes and instantiates cI using our ComppoundInterestClass
		System.out.printf("Test 1: $%.2f \n", cI.getAmountAccumulated());					// Prints out the amount accumulated using the getAmountAccumlated method
		if (cI.getAmountAccumulated() >= 8234.00 && cI.getAmountAccumulated() <= 8235.99) { // If statement used to see if the calculation was correct.
			System.out.println("Test 1 Passed");											// If it is correct, "Test # Passed" will be printed into the console
		} else {																			// If not correct, "Test # Failed" will be printed into the console
			System.out.println("Test 1 Failed"); 											// Each test uses the same format as this first one.
		}
		
		cI = new CompoundInterestClass(3000, .33, 3, 7);									// Test 2
		System.out.printf("Test 2: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 26486.00 && cI.getAmountAccumulated() <= 26847.99) {
			System.out.println("Test 2 Passed");
		} else {
			System.out.println("Test 2 Failed");
		}
		
		cI = new CompoundInterestClass(1534, .08, 8, 25);									// Test 3
		System.out.printf("Test 3: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 11222.00 && cI.getAmountAccumulated() <= 11223.99) {
			System.out.println("Test 3 Passed");
		} else {
			System.out.println("Test 3 Failed");
		}
		
		cI = new CompoundInterestClass(8945, .54, 3, 9);									// Test 4
		System.out.printf("Test 4: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 780538.00 && cI.getAmountAccumulated() <= 780539.99) {
			System.out.println("Test 4 Passed");
		} else {
			System.out.println("Test 4 Failed");
		}
		
		cI = new CompoundInterestClass(985, .17, 28, 21);									// Test 5
		System.out.printf("Test 5: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 34607.00 && cI.getAmountAccumulated() <= 34608.99) {
			System.out.println("Test 5 Passed");
		} else {
			System.out.println("Test 5 Failed");
		}
		
		cI = new CompoundInterestClass(4535, .67, 16, 14);									// Test 6
		System.out.printf("Test 6: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 44389017.00 && cI.getAmountAccumulated() <= 44389018.99) {
			System.out.println("Test 6 Passed");
		} else {
			System.out.println("Test 6 Failed");
		}
		
		cI = new CompoundInterestClass(8122, .14, 6, 16);									// Test 7
		System.out.printf("Test 7: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 74353.00 && cI.getAmountAccumulated() <= 74354.99) {
			System.out.println("Test 7 Passed");
		} else {
			System.out.println("Test 7 Failed");
		}
		
		cI = new CompoundInterestClass(8562, .18, 7, 21);									// Test 8
		System.out.printf("Test 8: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 357648.00 && cI.getAmountAccumulated() <= 357649.99) {
			System.out.println("Test 8 Passed");
		} else {
			System.out.println("Test 8 Failed");
		}
		
		cI = new CompoundInterestClass(2809, .57, 29, 3);									// Test 9
		System.out.printf("Test 9: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 15274.00 && cI.getAmountAccumulated() <= 15275.99) {
			System.out.println("Test 9 Passed");
		} else {
			System.out.println("Test 9 Failed");
		}
		
		cI = new CompoundInterestClass(1919, .30, 18, 22);									// Test 10
		System.out.printf("Test 10: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 1335962.00 && cI.getAmountAccumulated() <= 1335963.99) {
			System.out.println("Test 10 Passed");
		} else {
			System.out.println("Test 10 Failed");
		}
		
		cI = new CompoundInterestClass(2018, .94, 27, 7);									// Test 11
		System.out.printf("Test 11: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 1300048.00 && cI.getAmountAccumulated() <= 1300049.99) {
			System.out.println("Test 11 Passed");
		} else {
			System.out.println("Test 11 Failed");
		}
		
		cI = new CompoundInterestClass(5088, .98, 7, 1);									// Test 12
		System.out.printf("Test 12: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 12731.00 && cI.getAmountAccumulated() <= 12732.99) {
			System.out.println("Test 12 Passed");
		} else {
			System.out.println("Test 12 Failed");
		}
		
		cI = new CompoundInterestClass(4521, .15, 9, 19);									// Test 13
		System.out.printf("Test 13: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 76343.00 && cI.getAmountAccumulated() <= 76344.99) {
			System.out.println("Test 13 Passed");
		} else {
			System.out.println("Test 13 Failed");
		}
		
		cI = new CompoundInterestClass(8748, .65, 13, 6);									// Test 14
		System.out.printf("Test 14: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 393254.00 && cI.getAmountAccumulated() <= 393255.99) {
			System.out.println("Test 14 Passed");
		} else {
			System.out.println("Test 14 Failed");
		}
		
		cI = new CompoundInterestClass(6006, .10, 23, 4);									// Test 15
		System.out.printf("Test 15: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 8951.00 && cI.getAmountAccumulated() <= 8952.99) {
			System.out.println("Test 15 Passed");
		} else {
			System.out.println("Test 15 Failed");
		}
		
		cI = new CompoundInterestClass(2701, .84, 12, 1);									// Test 16
		System.out.printf("Test 16: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 6082 && cI.getAmountAccumulated() <= 6083.99) {
			System.out.println("Test 16 Passed");
		} else {
			System.out.println("Test 16 Failed");
		}
		
		cI = new CompoundInterestClass(7233, .11, 15, 23);									// Test 17
		System.out.printf("Test 17: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 89964.00 && cI.getAmountAccumulated() <= 89965.99) {
			System.out.println("Test 17 Passed");
		} else {
			System.out.println("Test 17 Failed");
		}
		
		cI = new CompoundInterestClass(8235, .23, 5, 18);									// Test 18
		System.out.printf("Test 18: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 471535.00 && cI.getAmountAccumulated() <= 471536.99) {
			System.out.println("Test 18 Passed");
		} else {
			System.out.println("Test 18 Failed");
		}
		
		cI = new CompoundInterestClass(3729, .99, 2, 4);									// Test 19
		System.out.printf("Test 19: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 93050.00 && cI.getAmountAccumulated() <= 93051.99) {
			System.out.println("Test 19 Passed");
		} else {
			System.out.println("Test 19 Failed");
		}
		
		cI = new CompoundInterestClass(9342, .53, 2, 9);									// Test 20
		System.out.printf("Test 20: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 642789.00 && cI.getAmountAccumulated() <= 642790.99) {
			System.out.println("Test 20 Passed");
		} else {
			System.out.println("Test 20 Failed");
		}
		
		cI = new CompoundInterestClass(24400, .09, 4, 20);									// Test 21
		System.out.printf("Test 21: $%.2f \n", cI.getAmountAccumulated());
		if (cI.getAmountAccumulated() >= 144695.00 && cI.getAmountAccumulated() <= 144696.99) {
			System.out.println("Test 21 Passed");
		} else {
			System.out.println("Test 21 Failed");
		}
	}
}