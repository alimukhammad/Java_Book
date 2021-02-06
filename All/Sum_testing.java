package All;

import javax.swing.JOptionPane;

public class Sum_testing {

	public static void main(String[] args) {
		String s1, s2;
		double num1, num2, average;
		try
		{
			
			s1 = JOptionPane.showInputDialog("Enter a number: ");
			s2 = JOptionPane.showInputDialog("Great! Now enter another number: ");
			
			num1 = Double.parseDouble(s1);
			num2 = Double.parseDouble(s2);
			average = (num1 + num2)/2.0;
			
			JOptionPane.showInputDialog(null, 
					" The average of " + num1 + " and " + num2 + " is " + average, 
					" QuickTest Program 4.3",
					JOptionPane.INFORMATION_MESSAGE);
	
		}
		catch(NullPointerException n)
		{
			JOptionPane.showMessageDialog(null,
			"You Pressed the Cancel Button",
			"Program Termination",
			JOptionPane.ERROR_MESSAGE);
		}
		finally {System.exit(0);
	}
	}}
