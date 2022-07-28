import java.util.Scanner;
import java.util.ArrayList;

class Transaction
{
	private char C;
	private double Amount;
	private double balance;
	private String Description;
	private java.util.Date date;
	
	public Transaction(){}
	
	public Transaction(char c, double amount, double bal, String description)
	{
		C = c;
		Amount = amount;
		balance = bal;
		Description = description;
	}
	
	public void P()
	{
		System.out.println(C + "\t" + Amount + "\t" + balance);
	}
	
	
}

class Account {
	  private int id;
	  private String name;
	  private double balance;
	  private static double annualInterestRate = 1.5;
	  private java.util.Date dateCreated;
	  private java.util.ArrayList<Object> transactions = new java.util.ArrayList<Object>();

	  public Account() {
	    dateCreated = new java.util.Date();
	  }
	 
	  public Account(String name, int id, double balance) {
	    this.id = id;
	    this.name = name;
	    this.balance = balance;
	    dateCreated = new java.util.Date();
	  }	  

	  public int getId() {
	    return this.id;
	  }	 

	  public double getBalance() {
	    return balance;
	  } 

	  public java.util.ArrayList<Object> getTransactions() {
	    return transactions;
	  }

	  public String getName() {
	    return name;
	  }  

	  public static double getAnnualInterestRate() {
	    return annualInterestRate;
	  }
 
	  public void setId(int id) {
	    this.id =id;
	  }

	  public void setBalance(double balance) {
	    this.balance = balance;
	  }

	  public static void setAnnualInterestRate(double annualInterestRate) {
	  Account.annualInterestRate = annualInterestRate;
	  }

	  public double getMonthlyInterest() {
	    return balance * (annualInterestRate / 1200);
	  } 

	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  public void withdraw(double amount) {
	    balance -= amount;
	    transactions.add(new Transaction('W', amount, balance, ""));
	  }

	  public void deposit(double amount) {
	    balance += amount;
	    transactions.add(new Transaction('D', amount, balance, ""));
	  }
	}

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		String name;
		double balance;
		int ID;
		int a;
		
		String wh;
		double mu;
		
		name = scan.next();
		balance = scan.nextDouble();
		ID = scan.nextInt();
		a = scan.nextInt();
		
		String De = "Deposit";
		
		Account A = new Account(name, ID, balance);
		
		for(int i = 0; i < a; i++)
		{
			wh = scan.next();
			mu = scan.nextDouble();
			
			if(wh.equals(De) == true)
			{
				A.deposit(mu);
			}
			else
			{
				A.withdraw(mu);
			}
		}
		
	  System.out.println("Name: "+ A.getName());
	  System.out.println("Annual interest rate: "+ A.getAnnualInterestRate());
	  System.out.println("Balance: "+ A.getBalance());
		System.out.println("Date"+ "\tType"+ "\tAmount");
		
		Transaction t = new Transaction();

		for(int i = 0; i < A.getTransactions().size(); i++)
		{
			t = (Transaction)A.getTransactions().get(i);
			t.P();
		}
	}
}