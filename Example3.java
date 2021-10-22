import java.util.Scanner;
class Example3{
public static void main(String arg[])
{
int a;
float b;
String s;
 Scanner in = new Scanner(System.in);
System.out.println("enter an integer ");
a=in.nextInt();
System.out.println("enter an decimal ");
b=in.nextFloat();
System.out.println("enter an string ");
s=in.nextLine();
s=in.nextLine();
System.out.println("entered integer,decimal,string is "+a+" "+b+" "+s);
}
}