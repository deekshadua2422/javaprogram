import java.util.*;
class Circle{
	int radius;
	static final double PI = 3.14;
	Circle(){
		radius = 1;
	}
	Circle(int radius){
		this.radius = radius;
	}
	void area(){
		System.out.println("Area : " + (PI*radius*radius));
	}
	void circumference(){
		System.out.println("circumfernce :"  + (2*PI*radius));
	}
	void display(){
		System.out.println("Radius :"  + r);
		area();
		circumference();

	}
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		Circle c1 = new Circle();
		c1.Circle();
		System.out.println("Enter The radius :");
		int radius = in.next.Int();
		Circle c2 = new Circle(r);
		c2.display();

	}
}