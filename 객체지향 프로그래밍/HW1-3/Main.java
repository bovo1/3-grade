import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String ssn = scan.nextLine();
        System.out.println("Enter a SSN: " + ssn);
        if(ssn.matches("\\d{3}-\\d{2}-\\d{4}") == true){System.out.println(ssn + " is a valid social security number");}
        else{System.out.println(ssn + " is an invalid social security number");}

    }
}