package hust.soict.ite6.oop.lab01;

import javax.swing.JOptionPane;

public class CalculationWithTwoNumbers{
	public static void main(String[] args) {
		String strNum1,strNum2;
		String strSum = " Sum of two numbers is ";
		String strDif = " Difference of two numbers is ";
		String strPro = " Product of two numbers is ";
		String strQuo = " Quotient of two numbers is ";
		double num1,num2;
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number",JOptionPane.INFORMATION_MESSAGE);
		
		num1 = Double.parseDouble(strNum1);
		num2= Double.parseDouble(strNum2);
		
		System.out.println(strSum+(num1+num2)+"\n");
		System.out.println(strDif+(num1-num2)+"\n");
		System.out.println(strPro+(num1*num2)+"\n");
		
		if ( num2 == 0)
			System.out.println("Unidentified.");
		else
			System.out.println(strQuo+(num1/num2)+"\n");
		
		System.exit(0);
				
	}
}
