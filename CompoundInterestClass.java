/**
 * Name: Connor Cook
 * Assignment: Assignment01
 * Due Date: Thursday January 18, 2018
 * Description: The CompoundInterest Class to calculate the compound interest to be accessed by 
 * 				Kyle and Josh and used in their Main method. 
 * Citation: http://www.baeldung.com/java-math-pow (Doing the "Power to" Operator)
 * 		   	 http://www.thecalculatorsite.com/articles/finance/compound-interest-formula.php (Compound Interest Formula)
 *			 https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java(Rounding to 2 Decimal Values)
 *			 https://canopy.uc.edu/webapps/blackboard/content/listContent.jsp?course_id=_321846_1&content_id=_25062723_1&mode=reset(Original Assignment from Bill)
 * Anything else important: JavaDocs!
 */
package compoundInterest;
/**
 * Assignment 1 for Bill Nicholson, Programming 2, Spring Semester 2018 UC Clermont
 * A compound interest calculator
 * @author Connor Cook
 *
 */
public class CompoundInterestClass {
	//////////////////Variables//////////////////////////////////////
	private double amountAccumulated;
	private double principleInvestment;
	private double interestRate;
	private int compoundingsPerPeriod;
	private int numberOfYears;
	/////////////////amountAccumulated///////////////////////////////
	/**
	 * Get value for amountAccumulated
	 * @return
	 */
	public double getAmountAccumulated() {
		return amountAccumulated;
	}
	/**
	 * Set value for amountAccumulated
	 * @param amountAccumulated
	 */
	public void setAmountAccumulated(double amountAccumulated) {
		this.amountAccumulated = amountAccumulated;
	}
	/////////////////principleInvestment///////////////////////////
	/**
	 * Get value for principleInvestment
	 * @return
	 */
	public double getPrincipleInvestment() {
		return principleInvestment;
	}
	/**
	 * Set value for principleInvestment
	 * @param principleInvestment
	 */
	public void setPrincipleInvestment(double principleInvestment) {
		this.principleInvestment = principleInvestment;
	}
	//////////////////interestRate//////////////////////////////////
	/**
	 * Get value for interestRate
	 * @return
	 */
	public double getInterestRate() {
		return interestRate;
	}
	/**
	 * Set value for interestRate
	 * @param interestRate
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	/////////////////compoundingsPerPeriod/////////////////////////
	/**
	 * Get value for compoundingsPerPeriod
	 * @return
	 */
	public int getCompoundingsPerPeriod() {
		return compoundingsPerPeriod;
	}
	/**
	 * Set value for compoundingsPerPeriod
	 * @param compoundingsPerPeriod
	 */
	public void setCompoundingsPerPeriod(int compoundingsPerPeriod) {
		this.compoundingsPerPeriod = compoundingsPerPeriod;
	}
	//////////////////numberOfPeriods//////////////////////////////
	/**
	 * Get value for numberOfYears
	 * @return
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	/**
	 * Set value for numberOfYears
	 * @param numberOfYears
	 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	///////////////////Calculating the Compound Interest///////////////////////////
	/**
	 * Calculation for the total amount of compound interest over time
	 * @param amountAccumulated total amount accumulated  
	 * @param principleInvestment starting amount (In $$)
	 * @param interestRate interest rate over time
	 * @param compoundingsPerPeriod compoundings per period(monthly, quarterly, annually ect.)
	 * @param numberOfYears total number of years the investment takes 
	 */
	public CompoundInterestClass(double principleInvestment, double interestRate, int compoundingsPerPeriod, int numberOfYears) {
		setAmountAccumulated(Math.round(principleInvestment*(Math.pow(1 + interestRate/compoundingsPerPeriod, (numberOfYears * compoundingsPerPeriod)))));
	}
	//////////////////Constructor which takes no arguments to be accessed my Main/////////////////////
	public CompoundInterestClass() {
		
	}
	
}
