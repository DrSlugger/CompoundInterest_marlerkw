/**
 * Name: Josh Yaggi
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
		//These are 20 different tests to see if the compound interest formula works correctly
		CompoundInterestClass cI = new CompoundInterestClass(5000, .05, 12, 10);
		System.out.printf("Test 1: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(2, .33, 3, 7);
		System.out.printf("Test 2: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(1534, .08, 8, 25);
		System.out.printf("Test 3: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(8945, .54, 3, 9);
		System.out.printf("Test 4: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(985, .17, 28, 21);
		System.out.printf("Test 5: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-4535, .67, 16, 14);
		System.out.printf("Test 6: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(8122, .14, 6, 16);
		System.out.printf("Test 7: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-8562, .68, 7, 21);
		System.out.printf("Test 8: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(2809, .57, 29, 3);
		System.out.printf("Test 9: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(1919, .30, 18, 22);
		System.out.printf("Test 10: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-2018, .94, 27, 7);
		System.out.printf("Test 11: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-5088, .98, 7, 1);
		System.out.printf("Test 12: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(4521, .15, 9, 19);
		System.out.printf("Test 13: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-8748, .65, 13, 6);
		System.out.printf("Test 14: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(6006, .10, 23, 4);
		System.out.printf("Test 15: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(2701, .84, 12, 1);
		System.out.printf("Test 16: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(7233, .11, 15, 23);
		System.out.printf("Test 17: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-8235, .63, 5, 18);
		System.out.printf("Test 18: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(-3729, .99, 11, 29);
		System.out.printf("Test 19: %.2f \n", cI.getAmountAccumulated());
		cI = new CompoundInterestClass(9342, .93, 20, 9);
		System.out.printf("Test 20: %.2f \n", cI.getAmountAccumulated());
	}
}
