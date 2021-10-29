import java.lang.*;
import java.util.Scanner;

class Pyramid
{
public static void main(String agr[])
{
int n,k=1;
System.out.println("enter the number : ");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(k +" ");
k++;
}
System.out.println("\n");
}

}
}