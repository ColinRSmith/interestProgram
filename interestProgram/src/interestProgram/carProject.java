package interestProgram;

public class carProject {
	private double totalCost;
	private double downPayment;
	private double interestLength;
	private double interestRate;
	
	public carProject(double totalCost, double downPayment, double interestLength, double interestRate) {
		super();
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.interestLength = interestLength;
		this.interestRate = interestRate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getInterestLength() {
		return interestLength;
	}

	public void setInterestLength(double interestLength) {
		this.interestLength = interestLength;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double monthlyPayment() {
		double InterestRate = (interestRate/100)/12;
		return totalCost * ((InterestRate*Math.pow(1+InterestRate,interestLength)/(Math.pow(1+interestRate, interestLength)-1)));
	}
	
	public double totalInterest() {
		return (monthlyPayment() * interestLength)-totalCost;
	}

}
