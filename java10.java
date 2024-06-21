import java.util.*;
interface areaPeri
{
	void area();
	void perimeter();
}
class Rectangle implements areaPeri
{
	int l=10,b=20;
	public void area()
	{
		System.out.println("Area of rectangle:"+l*b);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle:"+(2*(l+b)));
	}
}
class Circle implements areaPeri
{
	int r=10;
	public void area()
	{
		System.out.println("Area of circle:"+(3.14*r*r));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of circle:"+(2*3.14*r));
	}
}
class InterfaceExample
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle()
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for circle,2 for rectangle:");
		ch=sc.nextInt();
		swich(ch)
		{
		   case 1:
			c.area();
			c.perimeter();
			break;
		   case 2:
			r.area();
			r.perimeter();
			break;
		}
	}
}

