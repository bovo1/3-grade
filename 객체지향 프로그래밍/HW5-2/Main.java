import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		String f = scan.next();
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String temp = "";
		int c_wor = 0;
		int c_line = 0;
		int cc = 0;
		int s = 0;
		int t2 = 0;
		int ccc = 0;
		
		/*
		while((temp = br.readLine()) != null)
		{
			String[] t1 = temp.split("\\s");
			for(int i =0; i<t1.length; i++)
			{
				//System.out.println(t1[i]);
				//System.out.println(t1[i].length());
				s += t1[i].length();
			}
			
		}
		System.out.println(s);
		*/
		
		while((temp = br.readLine()) != null)
		{
			String[] t1 = temp.split("\\s");
			for(int i =0; i<t1.length; i++)
			{
				//System.out.println(t1[i]);
				//System.out.println(t1[i].length());
				s += t1[i].length();
				if(t1[i].isEmpty())
				{
					s--;
				}
			}
			
			//cha += temp.length();
			//System.out.println(temp.length());
			//System.out.println(temp);
			if(temp.length() == 0)
			{
				//cha ++;
				cc ++;
			}
			for(int i=0; i<temp.length(); i++)
			{	
				if(temp.charAt(i) == ' ')
				{
					if(temp.charAt(i) == ' ' && temp.charAt(i-1) == ' ')
					{
						c_wor --;
					}
					else if(i == temp.length()-1)
					{
						ccc++;
					}
					c_wor ++;
				}
				else if(temp.charAt(i) == '.' && i == temp.length()-1)
				{
					//System.out.println("됨?");
					c_wor ++;
				}
				else if(temp.charAt(i) != ' ' && i == temp.length() -1)
				{
					c_wor ++;
					//cha ++;
					
				}
				//else if(temp.charAt(i) != ' ' && temp.charAt(i+1) == 10)
				//{
					//c_wor ++;
				//}
			}
			t2 = s + c_wor;
			//System.out.println(temp.length());
			//System.out.println(c_wor);
			c_line++;
		}
		//System.out.println(t2);
		//System.out.println(cc);
		//System.out.println(ccc);
		
		t2 += c_line;
		t2 += ccc;
		t2 += 2 * cc;
		//System.out.println(t2);
		//cc = c_line - cc;
		//cha += c_line;
		//cha += cc;
		System.out.println("File "+ f + " has ");
		System.out.println(t2 +" characters");
		System.out.println(c_wor + " words");
		System.out.println(c_line+" lines");
	}
}