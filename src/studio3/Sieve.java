package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		// Asking for length of array.
				Scanner in = new Scanner(System.in);
			    System.out.println("Enter number.");
			    int n = in.nextInt();
		
		boolean [] A = new boolean [n+1];
		
		for (int i = 0; i < n+1; i++) {
			A[i] = true;
			//System.out.println(i + " : " + (i) + "-" + A[i]);
		}
		
		for (int i = 2; i < Math.sqrt((double)(n)); i++) {
			if (A[i] == true) {
				for (int j = 2*i; j < n+1; j = j + i) {
					A[j] = false;
				}	
			}
		}
		
		for (int i = 2; i < n+1; i++) {
			if (A[i] == true) {
				System.out.println(i);
			}
		}
	}
}


