package All;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculateTaxes {

	public static void main(String[] args) {
		double taxable, taxes;
		String s1;
		
		DecimalFormat df = new DecimalFormat(",###.00");
		
		s1 = JOptionPane.showInputDialog("Please type in the taxable income:");
		taxable = Double.parseDouble(s1);
		
		if (taxable <= 20000.0)
			taxes = 0.02 * taxable;
		else
			taxes = 0.025 * (taxable - 20000.0) + 400.0;
		
		JOptionPane.showMessageDialog(null, "Taxes are $" + df.format(taxes), "QuickTest Program 5.1", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
