package All;
import java.io.*;
public class MultipleNumbers {
	public static void main(String[] args) 
	throws java.io.IOException
	{
		String s1;
		String s2;
		double num1, num2, product;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter a number: " );
		s1 = br.readLine();
		num1 = Double.parseDouble(s1);
		
		System.out.print("Great!, Enter another number: " );
		s2 = br.readLine();
		num2 = Double.parseDouble(s2);
		
		product = num1 * num2;
		System.out.println(num1 + " times " + num2 + " is " + product);
	}
}
