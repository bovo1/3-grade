import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		String hex = scan.next();
		int I;
		char er = ' ';
		
		for(int j = 0; j < hex.length(); j++)
		{
			if(hex.charAt(j) >= 'F')
			{
				er = hex.charAt(j);
				break;
			}
		}
		
		try
		{
			I = Integer.parseInt(hex, 16);
			System.out.println(I);
		}catch(NumberFormatException e)
		{
			System.out.println("Illegal hex character: " + er);
		}
		
		//I = Integer.parseInt(hex, 16);
		//System.out.println(I);


	}
}