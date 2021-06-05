package Question2;
/*
 * Represents an account or interest rate. Such an account is a non-commission account Monthly with a maximum balance (higher). 
 *The class includes a constant (default) and will be calculated for a rate
 *Interest, methods of access to this content and method of calculating interest.
 * 
 * */

public class InterestChecking extends NoServiceChargeChecking{
	private double interest ;
	public static final double DEFAULT_IN = 0.2;
	
	
	public InterestChecking(String number, String name, String id, double balance, double min) {
		super(number,name,id,balance,min);
		interest = DEFAULT_IN;
	}

	public InterestChecking(String number, String name, String id, double balance, double min ,double interest) {
		super(number,name,id,balance,min);
		this.interest = interest;
	}
	
	public double getInt() {
		return interest;
	}
	
	public void setInt(double interest) {
		this.interest = interest;
	}
	
	public void monthlyMan(){
		this.deposit(this.calcInt());
	}
	
	public double calcInt() {
		return this.getAccountBalance()*interest;
	}
	
	public boolean equals(Object account,double interest) {

		if(this.interest != interest)
			return false;
		return super.equals(account);
	}
	
	public String toString() {
		return super.toString() + "The account interest: " + interest + "\n"; 
	}
	
	
}
