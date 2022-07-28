import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
class Triangle
{
    public double side1 = 1.0;
    public double side2 = 1.0; 
    public double side3 = 1.0;

    public Triangle(){};

    public Triangle(double side_1, double side_2, double side_3)
    {
        this.side1 = side_1;
        this.side2 = side_2;
        this.side3 = side_3;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    public double getPerimeter()
    {
        double a = side1 + side2 + side3;
        return a;
    }

    public String toString()
    {
        return "Triangle:side1=" + side1 + "side2=" + side2 + "side3=" + side3;
    }

}

class Circle
{
    public double r = 1.0;

    public Circle(double r1)
    {
        this.r = r1;
    }

    public double getR()
    {
        return r;
    }

    public double getArea()
    {
        return r*r*Math.PI;
    }

    public double getPerimeter()
    {
        return 2*r*3.141;
    }

    public String toString()
    {
        return "Circle:r=" + r;
    }
}

class Rectangle
{
    public double w = 1.0;
    public double h = 1.0;

    public Rectangle(double w1, double h1)
    {
        this.w = w1;
        this.h = h1;
    }

    public double getWidth()
    {
        return w;
    }

    public double getHeight()
    {
        return h;
    }

    public double getArea()
    {
        return w*h;
    }

    public double getPerimeter()
    {
        return w+h+w+h;
    }
}

class Main
{
    public static void compareTo(double c1, double r1, double t1)
    {	
    	double[] arr = new double[3];
    	arr[0] = c1;
    	arr[1] = r1;
    	arr[2] = t1;
    	
    	double maxA = 0.0;
    	double secA = 0.0;
    	int mi = 0;
    	int si = 0;
    	
    	for(int i = 0 ; i < 3; i++)
    	{
    		if(arr[i]>maxA)
    		{
    			secA = maxA;
    			maxA = arr[i];
    			mi = i;
    		}
    		else if(maxA > arr[i])
    		{
    			if(arr[i]>secA)
    			{
    				secA = arr[i];
    				si = i;
    			}
    			else
    			{
    				si = i;
    			}
    		}
    	}
    	//System.out.println(maxA);
    	//System.out.println(secA);
    	//System.out.println(mi);
    	//System.out.println(si);
    	
    	if(maxA == c1)
    	{
    		System.out.println("The Circle has largest area.");
    		
    	}
    	else if(maxA == r1)
    	{
    		System.out.println("The Rectangle has largest area.");
    	}
    	else if(maxA == t1)
    	{
    		System.out.println("The Triangle has largest area.");
    	}
    	
    	
    	if(secA == c1)
    	{
    		System.out.println("The Circle has second largest area.");
    	}
    	else if(secA == r1)
    	{
    		System.out.println("The Rectangle has second largest area.");
    	}
    	else if(secA == t1)
    	{
    		System.out.println("The Triangle has second largest area.");
    	}
    }

    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String n1 = scan.next();
        double n1_s = scan.nextDouble();
        String n2 = scan.next();
        double n2_s1 = scan.nextDouble();
        double n2_s2 = scan.nextDouble();
        String n3 = scan.next();
        double n3_s1 = scan.nextDouble();
        double n3_s2 = scan.nextDouble();
        double n3_s3 = scan.nextDouble();

        Circle C = new Circle(n1_s);
        Rectangle R = new Rectangle(n2_s1, n2_s2);
        Triangle T = new Triangle(n3_s1, n3_s2, n3_s3);

        double CA = C.getArea();
        double RA = R.getArea();
        double TA = T.getArea();
        

        System.out.println("The Area of Circle: " + Math.floor(CA*1000)/1000);
 
        System.out.println("The Area of Rectangle: " + Math.floor(RA*1000)/1000);

        System.out.println("The Area of Triangle: " + Math.floor(TA*1000)/1000);

        compareTo(CA, RA, TA);

    }
}