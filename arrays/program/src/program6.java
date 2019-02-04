import java.util.*;
class Program6{
	public static void main(String args[]){//main method to print a 2D array
		Scanner in=new Scanner(System.in);
		int localVar1,localVar2,row,col,number;		
		int array[][]=new int[10][10];
		System.out.println("Please enter the number of rows");
		row=in.nextInt();
		System.out.println("Please enter the number of columns");
		col=in.nextInt();
		System.out.println("Please enter the elements one by one");
		for(localVar1=0;localVar1<row;localVar1++){
			for(localVar2=0;localVar2<col;localVar2++){
				number=in.nextInt();
				if(number>99){
				System.out.println("Please enter two digit integer");
				number=in.nextInt();}
				array[localVar1][localVar2]=number;
		}
	}
			for(localVar1=0;localVar1<row;localVar1++){
			for(localVar2=0;localVar2<col;localVar2++){
				if(array[localVar1][localVar2]%2!=0){
					array[localVar1][localVar2]=array[localVar1][localVar2]*2;
				}
				else{
					continue;
				}
			}
		}
	System.out.println("Array is:");
		for(localVar1=0;localVar1<row;localVar1++){
			for(localVar2=0;localVar2<col;localVar2++){
				System.out.print(array[localVar1][localVar2]+ "\t ");
			}
			System.out.println();}}}