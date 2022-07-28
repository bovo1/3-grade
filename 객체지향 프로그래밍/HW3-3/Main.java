import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int id;
		double balance;
		double annual;
		double with;
		double depo;
		
		id = scan.nextInt();
		balance = scan.nextDouble();
		annual = scan.nextDouble();
		with = scan.nextDouble();
		depo = scan.nextDouble();
		
		Account acc = new Account(id, balance);
		acc.setAnn(annual);
		
		acc.withdraw(with);
		acc.deposit(depo);
		acc.getMonthlyInterestRate();
		double R = 0;
		R = acc.getMonthlyInterest();
		R = R / 100;
		
		System.out.println("balance: " + acc.getBalance());
		System.out.println("monthly interest: "+ (int)R+'.'+(int)(R*1000)%1000);
	}
}
//Date 타입을 이용한다는 조건이 있어 Date 클래스를 하나 만들었습니다.
//하지만 setDate라던가 그런 함수는 없어서 생성자와 getDate 함수만 만들었습니다.
class Date{
	public int date = 0;
	
	public Date(){}
	int getDate(){
		return date;
	}
}

class Account{
	private int id = 0;
	private double balance = 0; 
	private double annuallnterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){	}
	
	public Account(int id1, double bal1){
		id = id1;
		balance = bal1;
	}
	
	void setId(int id){
		this.id = id;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	void setAnn(double Ann){
		this.annuallnterestRate = Ann;
	}
	
	int getId(){
		return id;
	}
	double getBalance(){
		return balance;
	}
	double getAnn(){
		return annuallnterestRate;
	}
	Date getDate(){
		return dateCreated;
	}
	
	void withdraw(double withdraw1){
		balance -= withdraw1;
	}
	void deposit(double deposit1){
		balance += deposit1;
	}
	
	double getMonthlyInterestRate(){
		return annuallnterestRate / 12;
	}
	double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}
	
}

