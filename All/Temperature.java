package All;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		String fahr, output;
		double tempfahr, celsius;
		
		fahr = JOptionPane.showInputDialog("Enter a Fahrenheit Temperature: ");
		
		tempfahr = Double.parseDouble(fahr);
		celsius = 5.0/9.0 * (tempfahr - 32);
		
		output = "The equivalent Celsius temperature for " + tempfahr +
				" degrees Fahrenheit is " + celsius;
		JOptionPane.showMessageDialog(null, output, "QuickTest Program 4.4",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
