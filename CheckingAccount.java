package Question2;

/*the class represents a current account that allows the writing of checks. 
 * Department
 *This includes an add-on method called writeCheck that receives a check amount as a parameter.
 * */
public abstract class CheckingAccount extends BankAccount{

	public CheckingAccount(String number, String id, String name, double balance){
		super(number,name,id,balance);
	}	

	public void writeCheck(double checkAmount) {
		try {
			if (checkAmount > getAccountBalance())
				throw new IllegalBalance();
			System.out.println("the amount of the check:" + checkAmount);
		}
		catch (IllegalBalance e){
			System.out.println("An illegal balance may be created");
		}
	}
}

