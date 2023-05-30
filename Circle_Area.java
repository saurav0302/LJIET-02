import java.util.*;
class Circle_Area
{
	Scanner sc=new Scanner(System.in);
	double pi=Math.PI;
	public void get_area()
	{
		System.out.println("Enter Radius of circle");
		int radius=sc.nextInt();
		double peri=2*pi*radius;
		double area=pi*radius*radius;
		System.out.println("Perimeter of circle is "+peri);
		System.out.println("Area  of circle is "+area);
	}
	public static void main(String args[])
	{
		Circle_Area c1=new Circle_Area();
		c1.get_area();		
	}
}