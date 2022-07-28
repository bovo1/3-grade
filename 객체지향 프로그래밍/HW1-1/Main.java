import java.io.*;
import java.util.Scanner;
class Main
{
    public static void main(String[] args) throws Exception
    {
       int date, Td, Std;
       String today;
       Scanner scan = new Scanner(System.in);
       Td = scan.nextInt();
       Std = scan.nextInt();

       if(Td == 0){today = "Sunday";}
       else if(Td == 1){today = "Monday";}
       else if(Td == 2){today = "Tuesday";}
       else if(Td == 3){today = "Wednesday";}
       else if(Td == 4){today = "Thursday";}
       else if(Td == 5){today = "Friday";}
       else{today = "Saturday";}

       System.out.println("Enter today's day: " + Td);
       System.out.println("Enter the number of days elapsed since today: " + Std);
       


       date = (Td + Std) % 7;

       switch(date)
       {
           case 0:
                System.out.println("Today is " + today + " and the future day is Sunday");
                break;
            case 1:
                System.out.println("Today is " + today + " and the future day is Monday");
                break;
            case 2:
                System.out.println("Today is " + today + " and the future day is Tuesday");
                break;
            case 3:
                System.out.println("Today is " + today + " and the future day is Wednesday");
                break;
            case 4:
                System.out.println("Today is " + today + " and the future day is Thursday");
                break;
            case 5:
                System.out.println("Today is " + today + " and the future day is Friday");
                break;
            case 6:
                System.out.println("Today is " + today + " and the future day is Saturday");
                break;
       }

    }
}