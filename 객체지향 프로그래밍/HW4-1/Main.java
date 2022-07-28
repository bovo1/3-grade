import java.util.Scanner;

class Triangle
{
	public double side1, side2, side3 = 1.0;
	
	public Triangle() {}
	
	public Triangle(double s1, double s2, double s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	double getS1() {return side1;}
	double getS2() {return side2;}
	double getS3() {return side3;}
	
	double getArea()
	{
		double hs = (side1 + side2 + side3) / 2;
		double S = Math.sqrt(hs*(hs-side1)*(hs-side2)*(hs-side3));
		return S;
	}
	
	double getPerimeter()
	{
		double p = side1 + side2 + side3;
		return p;
	}
	
	String to_String()
	{
		return "Triangle: side = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	
}

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		double s1 = scan.nextDouble();
		double s2 = scan.nextDouble();
		double s3 = scan.nextDouble();
		
		String color = scan.next();
		String Tri_fil = scan.next();

		
		Triangle T = new Triangle(s1, s2, s3);
		
		double T_area = T.getArea();
		double T_per = T.getPerimeter();
		
		String Ts = T.to_String();
		System.out.println(Ts);
		System.out.println("area of Triangle: "+ (int)T_area + '.' + (int)(T_area*1000)%1000);
		System.out.println("perimeter of Triangle: " + T_per);
		System.out.println("color of Triangle: " + color);
		System.out.println("is Filled that Triangle: "+ Tri_fil);
		
	}
}
