import java.util.*;
class Four{
	public static void main(String args[]){//main program to print every digit seperatlyof a five digit number
		Scanner a = new Scanner(System.in);
		int Number;
		char b;
		do{
			System.out.println("Please enter the five digit number");
			number=a.nextInt();
			if(number>99999||number<9999)
				System.out.print("Entered number is not  five digit number ");
			else{
				System.out.println(" "+(number/10000));
				System.out.println(" "+(number / 1000)%10);
				System.out.println(" "+(number/100)%10);
				System.out.println(" "+(number%100)/10);
				System.out.println(" "+ (number%10));
			}
			System.out.println("Press N to exit and press any key o continue");
			b=a.next().charAt(0);
		} 
		while(b!='N');
	}
}