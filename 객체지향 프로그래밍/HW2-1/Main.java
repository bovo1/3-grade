import java.io.*;
import java.util.Scanner;
class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int space = num*3-3;
		System.out.println("Enter the number of lines: ");
		for(int i = 1; i <= num; i++)
		{
			for(int j = 0; j < space; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = i; k >= 1 ; k--)
			{
				if(k >= 10)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("  ");
				}
				System.out.print(k);
			}
			
			for(int m = 2; m <= i; m++)
			{
				if(m >= 10)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("  ");
				}
				System.out.print(m);
			}
			System.out.println();
			space = space - 3;
		}
		
	}
}