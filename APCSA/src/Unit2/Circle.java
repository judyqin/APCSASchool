package Unit2;

import java.lang.Math; 

public class Circle
{
	private double radius;
	private double area; 
	//private double out; 

	public void setRadius(double rad)
	{
		radius = rad; 
	}

	public void calculateArea( )
	{
		area = Math.PI * (radius*radius);
		String out = String.format("%.4f", area);
		System.out.println("The area is:: " + out);
	}

	public void print( )
	{
		//System.out.println("The area is:: " + out);
	}
}