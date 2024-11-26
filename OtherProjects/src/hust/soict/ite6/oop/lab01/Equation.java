package hust.soict.ite6.oop.lab01;

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		System.out.println("Options!");
		System.out.println("1.First-degree equation (1 variable)");
		System.out.println("2.First-degree equations (2 variables)");
		System.out.println("3.Second-degree equation (1 variable)");
		
		System.out.println("Choose one!");
		int option;
		Scanner scanner = new Scanner(System.in);
		option = scanner.nextInt();
		if (option==1) {
			double a,b;
			System.out.print("Enter a:");
			a = scanner.nextDouble();
			System.out.print("Enter b:");
			b = scanner.nextDouble();
			
			if (a==0&&b==0) {
				System.out.println("Infinitely many solutions");
			}
			else if (a==0&&b!=0) {
				System.out.println("No solution");
			}
			else {
				double x=-b/a;
				System.out.println("1 solution: x=" + x);
			}
		}
		else if (option==2) {
			double a1,b1,c1,a2,b2,c2,d,d1,d2,x1,x2;
			System.out.print("Nhap a1:");
			a1 = scanner.nextDouble();
			System.out.print("Nhap b1:");
			b1 = scanner.nextDouble();
			System.out.print("Nhap c1:");
			c1 = scanner.nextDouble();
			System.out.print("Nhap a2:");
			a2 = scanner.nextDouble();
			System.out.print("Nhap b2:");
			b2 = scanner.nextDouble();
			System.out.print("Nhap c2:");
			c2 = scanner.nextDouble();
			
			d = a1*b2 - a2*b1;
			d1 = c1*b2 - c2*b1;
			d2 = a1*c2 - a2*c1;
			
			if (d==0 && d1==0 && d2==0) {
				System.out.println("Infinitely many solutions");
			}
			else if (d!=0) {
				x1=d1/d;
				x2=d2/d;
				System.out.println("1 solution: x1= "+x1+"and x2 = "+x2);
			}
			else System.out.println("No solution");
		}
		else if (option==3) {
			double a,b,c,x,d,x1,x2;
			System.out.print("Nhap a:");
			a = scanner.nextDouble();
			System.out.print("Nhap b:");
			b = scanner.nextDouble();
			System.out.print("Nhap c:");
			c = scanner.nextDouble();
			
			if (a==0) {
				if (b==0) {
					if (c==0) {
						System.out.println("Infinitely many solutions");
					}
					else System.out.println("No solution");					
				}
				else {
					x=-c/b;
					System.out.println("Double root: x="+x);
				}
			}
			else {
				d = b*b - 4*a*c;
				x1= (-b + Math.sqrt(d)) /a;
				x2= (-b - Math.sqrt(d)) /a;
				System.out.println("Single root: x1= "+x1+"and x2= "+x2);
			}
			
		}
		else System.exit(0);
	}
}
