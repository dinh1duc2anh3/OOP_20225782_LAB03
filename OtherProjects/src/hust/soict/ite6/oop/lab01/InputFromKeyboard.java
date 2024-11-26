package hust.soict.ite6.oop.lab01;

import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your full name?");
		String strFullName = keyboard.nextLine();
		
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		
		/*Reason: after reading the age using keyboard.nextInt(), a newline character is left in the input 
		 buffer. when nextLine() is called afterward to read the institution information, it immediately
		 reads that leftover newline character, which causes it to skip the input for the institution.*/
		/*Solution: Consume the leftover newline character after reading the age */
        keyboard.nextLine();
		
		System.out.println("Where are you studying at?");
		String strInstitution = keyboard.nextLine();
		
		System.out.println("What is your CPA?");
		double dCpa = keyboard.nextDouble();
		
		/*Reason: not closing scanner object leads to a potential resource leak because it
		 remain opening after the program finishes.
		 But make sure to close it only when it is no longer needed*/
		keyboard.close();
		
		System.out.println("Mr/Mrs. "+strFullName+" is currently "+iAge+" years old"
				+" and is now studying at "+strInstitution+".\nHis/her CPA is "+dCpa);
		System.exit(0);
			
		}
}	
