import java.util.*;
class Circle{
	double radius;
	double findArea(){
		return radius*radius*3.147;
	}
	
	void displayArea(){
		System.out.println("area"+findArea());
	}
 	
 	void askvalue()
 	{
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter the value of radius");
 		radius = scan.nextInt();
 	}
 }