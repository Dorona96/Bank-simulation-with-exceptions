package Question2;
import java.util.Random;
public class Main {
	public static void main ( String[] args) {
		Random rendom = new Random();

		// array to test different bank accounts
		BankAccount[] arrAccounts = { 
				new InterestChecking("0","Omer","0000000000",90000,250),
				new InterestChecking("1","Tomer","111111111",1545400,570,0.25),
				new SavingsAccount("2","Lilach","222222222",354540),
				new SavingsAccount("3","Ron","333333333",554540,0.57),
				new HighInterestSavings("4","Niv","444444444",246640),
				new HighInterestSavings("5","Eden","555555555",68466400,100),
				new ServiceChargeChecking("6","Keren","666666666",77432) ,
				new ServiceChargeChecking("6","Keren","666666666",774) ,
				new ServiceChargeChecking("7","Doron","777777777",90432) ,
				new NoServiceChargeChecking("8","Or","888888888",44300),
				new NoServiceChargeChecking("9","Shahar","999999999",76890,700)
		};

		// print the different account
		for ( BankAccount accounts : arrAccounts ){
			System.out.println(accounts);
		}
		//	 test The methods
		System.out.println("*******************\nTest the methonds\n*******************\n\n");

		
		for ( BankAccount accounts : arrAccounts){
			accounts.deposit(rendom.nextInt(25000));
			System.out.println(accounts);
			accounts.withdraw(rendom.nextInt(11500));
			System.out.println(accounts);
			accounts.equals(arrAccounts[6]);
			System.out.println(accounts);
			accounts.equals(accounts);
			System.out.println(accounts);
			accounts.monthlyMan();
			System.out.println(accounts);
		}
	}
}

