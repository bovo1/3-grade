import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
class Main
{
    public static void main(String[] args) throws Exception
    {
       Scanner scan = new Scanner(System.in);
       String zero = "0";
       int count = 0;
       int isbn = scan.nextInt();
       //System.out.println(isbn);
       //Formatter f = new Formatter();
       //System.out.println(f.format("%09d", isbn));
       String num = Integer.toString(isbn);
       if(num.length() == 8){num = zero + num;}

       System.out.println("Enter the first 9 digits of an ISBN as integer: " + num);

       for(int i=0; i<num.length(); i++)
       {
           count += ((num.charAt(i) - '0') * (i+1));
       }
       count = count % 11;
       if (count != 10)
       {
        System.out.println("The ISBN-10 number is " + num + count);
       }
       else
       {
        System.out.println("The ISBN-10 number is " + num + 'X');
       }

    }
}