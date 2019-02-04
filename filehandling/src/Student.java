import java.util.*;
class Student{
	int localnum,number,flagserial;
	String Name;
	float Cgpa;
	char Grade;
	Student details[];
	Scanner in = new Scanner(System.in);
 	Student(){
 		flagserial=1;
 		Cgpa=9.1f;
 		Grade='A';
 		Name="Deeksha";

 	}
 	Student(int flagserial,String Name,float Cgpa,char Grade){
 		this.flagserial=flagserial;
 		this.Name=Name;
 		this.Cgpa=Cgpa;
 		this.Grade=Grade;
 	}
    void  Array(){
 		System.out.println("Please enter number of students");
 		number=in.nextInt();
 		Student details[] = new Student[number];
 		for(localnum=0;localnum<details.length;localnum++){
 			System.out.println("Enter Serial number");
 			flagserial=in.nextInt();
 			System.out.println("Enter Name");
 			in.nextLine();
 			Name=in.nextLine();
 			System.out.println("Enter CGPA");
 			Cgpa=in.nextFloat();
 			System.out.println("Enter Grade");
 			Grade=in.next().charAt(0);
 			details[localnum]=new Student(flagserial,Name,Cgpa,Grade);
 		}
 	}

}

