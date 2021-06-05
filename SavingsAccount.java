package Question2;
/*
 * The Class Represents a savings account and interest. This class includes a constant) option
 *Default (and deduction for the interest rate, 
 *methods for accessing this deduction and method for calculating interest).
 * */
public class SavingsAccount extends BankAccount {

	public static final double DEFAULT_IN = 0.15;
	private double interest;

	public SavingsAccount(String number, String name, String id, double balance){
		super(number,name,id,balance);
		interest = DEFAULT_IN;
	}	

	public SavingsAccount(String number, String name, String id, double balance, double interest){
		super(number,name,id,balance);
		this.interest = interest;
	}

	public void monthlyMan(){
		this.deposit(this.calcInt());
	}
	
	public double getInt() {
		return interest;
	}

	public void setInt(double interest) {
		this.interest = interest;
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
		return super.toString() + "The Account interest: " + interest + "\n"; 
	}
}
