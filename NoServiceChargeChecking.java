package Question2;
/*
 * Represents a current account without a monthly fee with a balance
 *A minimum below which no strokes should be made. 
 *The class includes a constant that represents the default balance set as well as a deduction for the maximum balance 
 *to allow for accounting with balances maximum equations.
 * */
public class NoServiceChargeChecking extends CheckingAccount{
	private double min;
	private final double DEFAULT_WM = 350;


	public NoServiceChargeChecking(String number, String name, String id, double balance) {
		super(number,name,id,balance);
		min= DEFAULT_WM;
	}

	public NoServiceChargeChecking(String number, String name, String id, double balance,double min) {
		super(number,name,id,balance);
		this.min = min;
	}

	public double minWithdraw () {
		return min;
	}

	public double getMinimum() {
		return min;
	}

	public void setMinimum(double min) {
		this.min = min;
	}

	public void monthlyMan(){
	}

	public boolean equals(Object account,double min) {

		if(this.min != min)
			return false;
		return super.equals(account);
	}
	
	public String toString() {
		return super.toString() + "The minimum withdraw is:" + min + "\n";
	}

}
