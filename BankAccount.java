package Question2;
/*
 * The abstract class BankAccount represents an account and the method that can be use in it
 * 
 * */
public abstract class BankAccount {

	protected String accountNumber;
	protected String holderName;
	protected String holderID;
	protected double accountBalance;


	public BankAccount(){
		accountNumber = "";
		holderName = "";
		holderID = "";
		accountBalance = 0;
	}

	public BankAccount(String number,String name,String id, double balance) {
		accountNumber = number;
		holderName = name;
		holderID = id;
		accountBalance = balance;

	}

	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNo(String number) {
		this.accountNumber = number;
	}


	public String getHolderName() {
		return holderName;
	}


	public void setHolderName(String name) {
		this.holderName = name;
	}


	public String getHolderID() {
		return holderID;
	}


	public void setHolderID(String id) {
		this.holderID  = id;
	}


	public double getAccountBalance() {
		return accountBalance;
	}

	public boolean deposit(double newDeposit) {
		if ( newDeposit > 0)
		{
			this.accountBalance += newDeposit;
			return true;
		}
		return false;
	}

	public void withdraw(double newWithdraw){
		try {
			if (this.accountBalance - newWithdraw< 0) 
			{
				throw new IllegalBalance();
			}

			this.accountBalance -= newWithdraw;
		}
		catch (IllegalBalance e){
			System.out.println("An illegal balance may be created");
		}
	}

	
	public abstract void monthlyMan();

	public String toString() {
		return "Account status\n"+"***************\n" + "Account number :" + accountNumber +"\nHolder name: " + holderName + 
				"\nHolder ID: " + holderID + "\nAccount balance:" + accountBalance + "\n"; 
	}

	public boolean equals(Object account) {
		if (account instanceof BankAccount) {
			if (this.accountNumber != ((BankAccount) account).getAccountNumber())
			{
				System.out.println("not equals! The Account number not in the same");
				return false;
			}
			if (this.accountBalance != ((BankAccount) account).getAccountBalance())
			{
				System.out.println("not equals! The Account balance is not the same");
				return false;
			}
			if (this.holderID != ((BankAccount) account).getHolderID())
			{
				System.out.println("not equals! The holder ID is not the same");
				return false;
			}
			if (this.holderName != ((BankAccount) account).getHolderName())
			{
				System.out.println("not equals! The  holder name is not the same");
				return false;
			}
			System.out.println("The  accounts are equals!");
			return true;
		} else {
			System.out.println("error!, this object isn't BankAccount");
			return false;
		}
	}

}
