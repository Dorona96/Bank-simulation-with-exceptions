package Question2;


public class HighInterestSavings  extends SavingsAccount  {

	public static final double DEFAULT_HM = 350;
	public static final double DEFAULT_HI = 0.15;
	private double highMin;

	public HighInterestSavings(String number, String name, String id, double balance){
		super(number,name,id,balance,DEFAULT_HI);
		highMin = DEFAULT_HM;
	}	

	public HighInterestSavings(String number, String name, String id, double balance, double highMin){
		super(number,name,id,balance,DEFAULT_HI);
		this.highMin = highMin;
	}

	public double getHighMin() {
		return highMin;
	}

	public double minWithdraw () {
		return highMin;
	}

	public void setHighMinimum(double highMin) {
		this.highMin = highMin;
	}

	public boolean equals(Object account,double highMin) {

		if(this.highMin != highMin)
			return false;
		return super.equals(account);
	}
	public String toString() {
		return super.toString() + "The Account minimum: " + highMin + "\n\n"; 
	}

}
