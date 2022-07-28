import java.util.Scanner;
import java.util.ArrayList;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> Arr = new ArrayList<String>();
		for(int i = 0; i < 10; i++)
		{
			Arr.add(scan.next());
		}
		
		for(int i = 0; i <= 4; i++)
		{
			String A = Arr.get(2*i);
			int B = Integer.parseInt(A);
			//혹은 int B = Integer.valueOf(A);
			B *= 2;
			A = Integer.toString(B);
			//A = String.valueOf(B);
			Arr.set(2*i, A);
		}	
		
		for(int i = 3; i <= 5; i++)
		{
			Arr.remove(i);
		}
	
		Arr.add(1, "101");
		Arr.add(3, "102");
		Arr.add(5, "103");
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Arr.get(i));
		}
	}
}

