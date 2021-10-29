import java.lang.*;
import java.util.Scanner;

class Grade
{
public static void main(String a[])
{
float g,c,s;
System.out.print("enter the cie marks : ");
Scanner in=new Scanner(System.in);
c=in.nextInt();
System.out.print("enter the see marks : ");
s=in.nextInt();
g=c+(s/2);
if(g>=90)
System.out.print("your grade is s");
else if(g>=80)
System.out.print("your grade is a");
else if(g>=70)
System.out.print("your grade is b");
else if(g>=60)
System.out.print("your grade is c");
else if(g>=50)
System.out.print("your grade is d");
else if (g>=40)
System.out.print("your grade is e");
else
System.out.print("Fail");

}
}