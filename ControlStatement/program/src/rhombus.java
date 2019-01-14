
import java.util.*;
class rhombus{
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int row=1;
int nsp=n-1;
int nst=1;
char ch;
do{
while(row<=2*n-1) {
ch = 'A';
int csp=1;
while(csp<=nsp) {
System.out.print("\t");
csp=csp+1;
}
int cst=1;
while(cst<=nst) {
System.out.print(ch+"\t");
if (cst <= nst / 2)
ch = (char) (ch + 1);
else
ch = (char) (ch - 1);
cst=cst+1;
}
if(row<=n-1) {
nsp=nsp-1;
nst=nst+2;
}else {
nsp=nsp+1;
nst=nst-2;
}
row=row+1;
System.out.println();
}
System.out.print("Press N to EXIT else any key to continue :");
ch = scn.next().charAt(0);
if ((ch == 'N') || (ch == 'n'))
{
break;
}
}while(true);
}
}