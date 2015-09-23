import java.io.*;
public class BalanceTooLowException extends Exception {
	private double amount;
	
	public BalanceTooLowException(double amount){
	      this.amount = amount;
	   } 
	   
	public double getAmount(){
	      return amount;
	   }

}
