import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		int non_reverse_num = scan.nextInt();
		int reverse_num = reverse(non_reverse_num);
		
		if(isPalindrome(non_reverse_num) == false)
		{
			System.out.print(non_reverse_num + " is not a palindrome");
		}
		else
		{
			System.out.print(non_reverse_num + " is a palindrome");
		}
		//System.out.println(reverse(num));
	}
	
	public static int reverse(int number)
	{
		int result = 0;
		while(number != 0)
		{
			result = result * 10 + number % 10;
			number /= 10;
		}
		return result;
	}
	
	public static boolean isPalindrome(int number)
	{
		int renum = reverse(number);
		
		if(number == renum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}