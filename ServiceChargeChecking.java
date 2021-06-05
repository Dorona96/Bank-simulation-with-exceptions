package Question2;
/*
 * the class represents an account that is charged a monthly fee
 *Includes a constant that represents the amount of the monthly commission that the account will be charged.
 *This amount is set as the default neglect.
 * */
public class ServiceChargeChecking extends CheckingAccount {
	private double commission;
	public static final double  DEFAULT_C = 10;


	public ServiceChargeChecking(String number, String name, String id, double balance) {
		super(number,name,id,balance);
		commission = DEFAULT_C;
	}

	public ServiceChargeChecking(String number, String name, String id, double balance,double commission) {
		super(number,name,id,balance);
		this.commission = commission;
	}


	public void setCom(double commision) {
		this.commission = commision;
	}

	public double getCom() {
		return commission;
	}
	public boolean equals(Object account,double commission) {

		if(this.commission != commission)
			return false;
		return super.equals(account);
	}

	public String toString() {
		return super.toString() + "The account commission is:" + commission + "\n";
	}

	public void monthlyMan(){
		this.withdraw(commission);
	}
}
