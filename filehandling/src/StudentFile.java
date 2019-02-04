import java.io.*;
import java.util.*;
class Student {
    int SerialNumber;
    String StartName;
    float cgpa;
    char grade;
    Scanner input = new Scanner(System.in);

    void setStudent() {
        System.out.print("Enter Serial No : ");
        SerialNumber = input.nextInt();
        System.out.print("Enter First Name : ");
        StartName = input.next();
        System.out.print("Enter CGPA : ");
        cgpa = input.nextFloat();
        System.out.print("Enter grade : ");
        grade = input.next().charAt(0);
    }

    public String toString() {
        return SerialNumber + "\t" + StartName + "\t" + cgpa + "\t" + grade + "\n"; 
    }

    void getStudent() {
        System.out.print("Serial No : " + SerialNumber);
        System.out.print("First Name : " + StartName);
        System.out.print("CGPA : " + cgpa);
        System.out.print("garde : " + grade);
    }
}
class Program1 {

    static void input() {
        File f = null;
        try {
            f = new File("C:\\College\\Java_FOCPII\\FileHandling\\files\\student.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
            Student s[] = new Student[5];
            for (int localnum=0; localnum<5; localnum++) {
                s[localnum] = new Student();
                s[localnum].setStudent();
                bout.write(s[localnum].toString());
                bout.newLine();
            }
            
            bout.close();
        }        
        catch (Exception e) {
        // if any I/O error occurs
            e.printStackTrace();
        }
    }

    static void output() {
        File f=null;
        try {
            f = new File("C:\\College\\Java_FOCPII\\FileHandling\\files\\student.txt");
            FileReader fin = new FileReader(f);
            BufferedReader bin= new BufferedReader(fin);
            String strfl;
            System.out.println("The contents of the file are: ");
            System.out.println("S.No\tName\tCGPA\tgrade");
            while((strfl=bin.readLine())!=null){
                System.out.println(strfl);
            } 
        }
        catch (Exception e) {
        // if any I/O error occurs
            e.printStackTrace();
        }
        
    }

    static void search() {
        File f = null;
        try {
            boolean flag=true;
            FileReader fin = new FileReader(f);
            String i;
            BufferedReader bin= new BufferedReader(fin);
                while ((i=bin.readLine())!=null && flag) {
                    if(s.equals("me")) {
                        System.out.print("Present");
                    flag=false;
                }

            } 
        } catch (Exception e) {
                e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        char str;
        do {
            ch = input.next().charAt(0);
            switch(ch) {
                case 'i' : input();
                        break;
                case 'o' : output();
                        break;
                case 's' : search();
                        break;
                default : System.out.println("INVALID");
            }
           
            str = input.next().charAt(0);
        } while (str=='y');
        
    }
}