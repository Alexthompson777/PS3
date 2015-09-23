import java.util.Date;



public class account {
	
	//Declaring private data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//No args constructor
	public account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();		
	}	
	
	//Constructor with arguments
	public account(int newId, double newBalance, double newInterestRate){
		id = newId;
		balance = newBalance;
		annualInterestRate = newInterestRate;
		dateCreated = new Date();
	}
	
	//Access methods
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	//Mutator methods
	public void setId(int id){
		this.id = id;	
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	//Withdraw and deposit methods
	public void withdraw(double amount) throws 
									BalanceTooLowException{
		if(balance >= amount){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
	         throw new BalanceTooLowException(needs);
		}
	}
	
	public void deposit(double amount){
		balance += amount;
	
	}
	
}
