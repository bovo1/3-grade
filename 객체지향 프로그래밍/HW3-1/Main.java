import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		double[][] L = new double[3][3];
		double k = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				k = scan.nextDouble();
				L[i][j] = k;
				//System.out.println(L[i][j]);
			}
		}
		
		sortRows(L);

	}
	
	public static double[][] sortRows(double[][] m){
		for(int i=0; i<3; i++){
			Arrays.sort(m[i]);
		}
		System.out.println("The row-sorted array is");
		
		for(int j=0; j<3; j++){
			for(int k=0; k<3; k++){
				System.out.print(m[j][k] + " ");
			}
			System.out.println("");
		}
		return m;
	}
}