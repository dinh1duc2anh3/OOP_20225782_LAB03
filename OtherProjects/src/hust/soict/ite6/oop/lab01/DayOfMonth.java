package hust.soict.ite6.oop.lab01;

import java.util.Scanner;

public class DayOfMonth {
	public static void main(String[] args) {
		String[]MonthWith31Days = {
				"January","Jan.","Jan","1",
				"March", "Mar.", "Mar", "3",
				"May","5",
				"July", "Jul", "7",
				"August", "Aug. ", "Aug", "8",
				"October","Oct.", "Oct", "10",
				"December", "Dec.","Dec","12"
				};
		String[]MonthWith30Days = {
				"April", "Apr.", "Apr", "4",
				"June", "Jun", "6",
				"September", "Sept.", "Sep", "9",
				"November", "Nov.", "Nov", "11"
				};
		String[]February = {
				"February","Feb","Feb.","2"
				};
		
		/*It is recommended to open Scanner once and use it for both the year and month inputs
		 * ( scanner input ), and closing it afterward*/
		int Year;
		Scanner input = new Scanner(System.in);
		
		
		/*try block : contain code that might throw an exception*/
		try {
			while (true) {
				System.out.println("Enter year: ");
				Year = input.nextInt();
				
				if (Year>=100) {
					break;
				}
				else {
					System.out.println("Enter a valid year!!!\n");
					continue;
				}
			}
		
			// Consume the leftover newline character after nextInt()
			input.nextLine();
			
			System.out.println("Enter month: ");
			String strMonth = input.nextLine();
			
			/*equal() : check if two string is alike based on the content of the string.
			 if two strings are not the same, it will return false, if are the same then return true*/
			for (String s : MonthWith31Days) {
				if (s.equals(strMonth)) {
					System.out.println("Year "+Year+" month "+s+" has 31 days.");
					return;
				}
			}
			
			for (String s : MonthWith30Days) {
				if (s.equals(strMonth)) {
					System.out.println("Year "+Year+" month "+s+" has 30 days.");
					return;
				}
			}
			
			for (String s : February) {
				if (s.equals(strMonth)) {
					if (Year%4 == 0 && Year%100 != 0 || Year%400 == 0) {
						System.out.println("Year "+Year+" month "+s+" has 29 days.");
					} 
					else System.out.println("Year "+Year+" month "+s+" has 28 days.");
					return;			
				}
			}
			System.out.println("Invalid month input.");
			
		/*finally block: used to ensure that a specific piece of code is always executed, 
		 * regardless of whether an exception occurs in the try block or not. 
		 * usually used for clean up resources, files, sockets, db connections, preventing sources leaking
		 * even if the program terminates unexpectedly*/
			
		/*when used : finally block often runs after try block, but if there is an exception
		 * finally block run after catch block*
		 * if there is a return statement in the try block , finally block will be executed 
		 * before the return*/
		} finally {
			/*close input scanner in order to prevent leaking resources*/
			input.close();
		}
	}
}
