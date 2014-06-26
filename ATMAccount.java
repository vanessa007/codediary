import java.util.*;
public class ATMAccount {
	
	// Data field
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	// Constructor
	public ATMAccount() {
		id = 0;
		balance = 0;
		dateCreated = new Date();
	}
	
	public ATMAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	// Getters of id, balance, and annualInterestRate
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static double getAnnualInterestRate() {
		return ATMAccount.annualInterestRate;
	}
	
	// Setters of id, balance, and annualInterestRate
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(int annualInterestRate) {
		ATMAccount.annualInterestRate = annualInterestRate;
	}
	
	// Getter of dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Getter of monthlyInterestRate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	// Method of withdrawing money from an account
	public void withDraw(double money) {
		balance = balance - money;
	}
	
	// Method of depositing money to an account
	public void deposit(double money) {
		balance = balance + money;
	}
}
