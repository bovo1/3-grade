import java.io.*;
import java.util.Scanner;

class Rectangle{
	double width;
	double height;
	
	public Rectangle(){
		width = 1;
		height = 1;
	}
	
	public Rectangle(double wid, double hei){
		width = wid;
		height = hei;
	}
	
	public double getArea(){
		double area = 0;
		area = width * height;
		//area = Math.floor(area);
		return area;
	}
	
	public double getPerimeter(){
		double per = 0;
		per = 2*width + 2*height;
		return per;
	}
	
}

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		double w1 = 0;
		double h1 = 0;
		double w2 = 0;
		double h2 = 0;
		
		w1 = scan.nextDouble();
		h1 = scan.nextDouble();
		w2 = scan.nextDouble();
		h2 = scan.nextDouble();
		
		Rectangle rect1 = new Rectangle(w1, h1);
		Rectangle rect2 = new Rectangle(w2, h2);
		
		double rect1area = rect1.getArea();
		double rect2area = rect2.getArea();
		double rect1peri = rect1.getPerimeter();
		double rect2peri = rect2.getPerimeter();
		
		System.out.println("Rectangle1:");
		System.out.println("width: " + rect1.width + " height: " + rect1.height);
		System.out.println("area: "+(int)rect1area +"."+ (int)(rect1area*10)%10 + " perimeter: " + (int)rect1peri+"."+(int)(rect1peri*10)%10);
		
		System.out.println("Rectangle2:");
		System.out.println("width: " + rect2.width + " height: " + rect2.height);
		System.out.println("area: "+(int)rect2area +"."+ (int)(rect2area*10)%10 + " perimeter: " + (int)rect2peri+"."+(int)(rect2peri*10)%10);
	}
}