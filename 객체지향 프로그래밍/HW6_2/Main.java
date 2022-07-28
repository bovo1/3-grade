import java.io.*;
import java.util.*;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Calendar cal = new GregorianCalendar();
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[12];
		arr[0] = "January";
		arr[1] =  "February";
		arr[2] =  "March";
		arr[3] = "April";
		arr[4] = "May";
		arr[5] = "June";
		arr[6] = "July";
		arr[7] = "August";
		arr[8] = "September";
		arr[9] = "October";
		arr[10] = "November";
		arr[11] = "December";

		int y, m;
		m = scan.nextInt();
		y = scan.nextInt();

		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m);

		System.out.println(arr[m-1] + ", " + y);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

		cal.set(y, m-1, 1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		for(int i = 1; i <= lastday; i++)
		{
			if(i == 1) 
			{
				for(int j = 1; j < dayOfWeek; j++)
				{
					System.out.print("    ");
				}
			}
			System.out.printf("%4d", i);
			
			if(dayOfWeek % 7 == 0)
			{
				System.out.println();
			}
			dayOfWeek++;
		}
		if(dayOfWeek % 7 != 0)
		{ 
			System.out.println();
		}
	}
}