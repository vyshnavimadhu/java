import java.util.*;
class Area
{
	void CalculateArea(float x)
	{
		System.out.println("Area of square:"+x*x+"sq units");
	}
	void CalculateArea(float x,float y)
	{
		System.out.println("Area of rectangle:"+x*y+"sq units");
	}
	void CalculateArea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of rectangle:"+x*y+"sq units");
	}
	public static void main(String args[])
	{
		float s;
		float l,b;
		double r;
		Area obj=ne Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square:");
		s=sc.nextFloat();
		System.out.println("Enter length and breadth of a rectangle:");
		l=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Enter radius of the circle:");
		r=sc.nextDouble();
		obj.CalculateArea(s);
		obj.CalculateArea(l,b);
		obj.CalculateArea(r);
	}
}








