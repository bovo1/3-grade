import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		String pw = scan.nextLine();
		if(isValidPassword(pw) == true)
		{
			System.out.print("Valid password");
		}
		else
		{
			System.out.print("Invalid password");
		}
	}
	public static boolean isValidPassword(String s)
	{
		int c_c = 0;
		int d_c = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char a = s.charAt(i);
			if(Character.isDigit(a) == true)
			{
				d_c += 1;
			}
			else if(Character.isLetter(a) == true)
			{
				c_c += 1;
			}
			else
			{
				return false;
			}
		}
		
		if(c_c >= 8 && d_c >= 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}