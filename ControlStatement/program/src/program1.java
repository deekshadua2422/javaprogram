import java.util.*;
import java.lang.Math;
class program1{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int root;
		int root1;
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		d=b*b-4*a*c;
		if(d>0){
			System.out.println("REAL & DISTINCT");
			root=(int)(-b+Math.sqrt(d)/(2*a));
			root1=(int)(-b+Math.sqrt(d)/(2*a));
			System.out.println(root+" "+root1);
		}
		else if(d==0){
			System.out.println("REAL & EQUAL");
			root=(int)(-b+Math.sqrt(d)/(2*a));
			System.out.println(root);

		}
		else{
			System.out.println("IMAGINARY");
		}

	}
}
