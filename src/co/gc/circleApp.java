//Matt Lynn
package co.gc;

import java.util.Scanner;

public class circleApp
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		String choice = "y";
		
		System.out.println("Welcome to the Circle Calculator!");
		do
		{
		double input = Validator.getDouble(scan, "Please enter a radius: ", 0, (Math.sqrt(Double.MAX_VALUE))/Math.PI);
		Circle cir = new Circle(input);
		counter++;
		System.out.println("Your circle with a radius of " + input + " has a circumference of "
		+ cir.getFormattedCircumference() + " and an area of " + cir.getFormattedArea());
		
		choice=Validator.getStringMatchingRegex(scan,"Would you like to enter another radius? (y/n): ","[YyNn]");
		}while(choice.equalsIgnoreCase("y"));
		
		System.out.println("You calculated values for " + counter + " circle(s)!\nGoodbye!");
		

	}

}
