package hust.soict.ite6.oop.lab01;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n=");
		int n = scanner.nextInt();
		if (n<=0) System.out.println("Enter a valid value");
		else {
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n-i;j++) System.out.print(" ");
				for (int j=1;j<=2*i-1;j++) System.out.print("*");
				System.out.println();
			}
		}
		scanner.close();
		
	}
}

