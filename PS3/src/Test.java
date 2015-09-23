import java.util.Date;



public class Test {
	public static void main(String[] args){
		
		account myAccount = new account(1122, 20000, 4.5);
		try{
		myAccount.withdraw(2500);
		}
		catch(BalanceTooLowException low){
			System.out.println("Sorry you are short $"+low.getAmount());
		}
		myAccount.deposit(3000);
		System.out.println(myAccount.getId());
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getAnnualInterestRate());
		System.out.println(myAccount.getDateCreated());
		
		
		try{
			myAccount.withdraw(30000);
			}
			catch(BalanceTooLowException low){
				System.out.println("Sorry you are short $"+low.getAmount());
			}		
		
	}

}
