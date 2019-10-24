package co.gc;

public class Circle 
{


	
	public double radius;	
	//public double circumference;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public Circle()
	{
		radius =0.0;
	}

	public double getCircumference()
	{
		return radius*2*Math.PI;
	}
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	private static String formatNumber(double x)
	{
		return String.format("%.2f", x);
		
	}
	
	public String getFormattedCircumference()
	{
		return formatNumber(getCircumference());
	}
	
	public String getFormattedArea()
	{
		return formatNumber(getArea());
	}























}