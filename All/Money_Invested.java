package All;

import javax.swing.*;
import java.text.*;

public class Money_Invested {

	public static void main(String[] args) {
		String s1, outMessage;
		double capital, amount, rate = 0, nyrs;
		DecimalFormat num = new DecimalFormat(",###.00");
		
		outMessage = "This program calculates the amount of money\n" 
				+ "in a bank account for an initail deposit \n"
				+ " invested for n years at an interest rate r ";
		JOptionPane.showMessageDialog(null, outMessage, "Program 4.13", JOptionPane.INFORMATION_MESSAGE);
		
		s1 = JOptionPane.showInputDialog("Enter initial amount in the account: ");
		amount = Double.parseDouble(s1);
		s1 = JOptionPane.showInputDialog("Enter the number of years: ");
		nyrs = Double.parseDouble(s1);
		capital = amount * Math.pow((1 + rate/100.0), nyrs);
		
		outMessage = "The final amount of money is $" + num.format(capital);
		
		JOptionPane.showMessageDialog(null, outMessage, "Program 4.13", JOptionPane.INFORMATION_MESSAGE);
	}

}
